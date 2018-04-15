package sample;

import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ProgressBar;
import javafx.scene.paint.Color;

public class Controller implements PointListner{
    @FXML
    private Canvas canvas;

    @FXML
    private ProgressBar progressBar;

    private DrawerTask task;

    @FXML
    private void handleRunBtnAction(){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        task = new DrawerTask(gc);
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
        System.out.println("Wynik");
    }

    @Override
    public void getPoint(PointEvent e) {
    }
}
