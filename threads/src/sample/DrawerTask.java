package sample;

import javafx.concurrent.Task;
import javafx.scene.canvas.GraphicsContext;

import java.util.Random;



public class DrawerTask extends Task {
    private GraphicsContext gc;
    private int numberOfPoints;
    private int MIN = -8;
    private int MAX = 8;
    private Random random;

    DrawerTask(GraphicsContext toAdd){
        gc = toAdd;
        numberOfPoints = 100;
        random = new Random();
    }

    @Override
    protected Object call() throws Exception {
        while(true){
            for (int i = 0; i < numberOfPoints; i++) {
                double x = MIN + (MAX - MIN) * random.nextDouble();
                double y = MIN + (MAX - MIN) * random.nextDouble();
                System.out.println(Equation.calc(x,y));

            }
            if(isCancelled()) break;
        }
        return null;
    }
}
