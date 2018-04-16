package sample;

import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ProgressBar;
import javafx.scene.paint.Color;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;

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

    @FXML
    private void handleRunBtnAction(){
        int numberOfPoints = Integer.parseInt(textField.getText());
        GraphicsContext gc = canvas.getGraphicsContext2D();
        task = new DrawerTask(numberOfPoints);
        task.addListener(this);
        task.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent event) {
                int var = (int) task.getValue();
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
    public void getResult(PointEvent e) {
        textArea.setText(Double.toString(e.getResult()));
        System.out.println("Wynik");
    }

    @Override
    public void getPoint(PointEvent e) {
    }
}
