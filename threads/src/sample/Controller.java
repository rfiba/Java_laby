package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    private Canvas canvas;

    @FXML
    private void handleRunBtnAction(){
        GraphicsContext gc =
                canvas.getGraphicsContext2D(); drawShapes(gc);
    }

    private void drawShapes(GraphicsContext gc)
    { gc.setFill(Color.BLUEVIOLET);
        gc.fillRect(gc.getCanvas().getLayoutX(),
                gc.getCanvas().getLayoutY(),
                gc.getCanvas().getWidth(),
                gc.getCanvas().getHeight());
    }
}
