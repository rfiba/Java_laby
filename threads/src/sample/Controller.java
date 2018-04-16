package sample;

import javafx.concurrent.WorkerStateEvent;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ProgressBar;
import javafx.scene.paint.Color;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImage.*;


import static java.awt.Color.YELLOW;

public class Controller implements PointListner{
    @FXML
    private Canvas canvas;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private TextArea textArea;

    @FXML
    private TextField textField;

    private DrawerTask task;

    private GraphicsContext gc;

    private BufferedImage bi;
    int i;

    @FXML
    private void handleRunBtnAction(){
        int numberOfPoints;
        i = 0;

        try {
            numberOfPoints = Integer.parseInt(textField.getText());
        }
        catch(NumberFormatException e) {
            textField.clear();
            return;
        }

        gc = canvas.getGraphicsContext2D();

        bi= new BufferedImage(600, 400,
                BufferedImage.TYPE_INT_RGB);



        drawShapes(gc);

        task = new DrawerTask(numberOfPoints);
        task.addListener(this);
        task.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent event) {
                double var = (double) task.getValue();
                System.out.println("Wynik: " + var);
                textArea.setText(Double.toString(var));
                gc.drawImage(SwingFXUtils.toFXImage(bi, null), 0,0 );
            }
        });
        progressBar.progressProperty().bind(task.progressProperty());

        new Thread(task).start();
    }

    @FXML
    private void handleStopBtnAction(){
        task.cancel();
    }

    private void drawShapes(GraphicsContext gc)
    { gc.setFill(Color.BLUEVIOLET);
        gc.fillRect(gc.getCanvas().getLayoutX(),
                gc.getCanvas().getLayoutY(),
                gc.getCanvas().getWidth(),
                gc.getCanvas().getHeight());
    }

    @Override
    public void getPoint(PointEvent e) {
        System.out.println("(x,y): " + e.getX() +" "+ e.getY());
        if(e.getBelongingness()) {
            bi.setRGB((int) (e.getX()*5) +300 , (int) (e.getY()*5) + 200 , java.awt.Color.YELLOW.getRGB());
            i++;
        }

        if(i%100 == 0)
            gc.drawImage(SwingFXUtils.toFXImage(bi, null), 0,0 );
    }
}
