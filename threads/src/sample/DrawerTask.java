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
    private PointListner listener;

    DrawerTask(GraphicsContext toAdd){
        gc = toAdd;
        numberOfPoints = 100;
        random = new Random();
    }

    public synchronized void addListener(PointListner listenerToAdd) {
        listener = listenerToAdd;
    }

    @Override
    protected Object call() throws Exception {
        int i = 0;
        while(true){
            double x = MIN + (MAX - MIN) * random.nextDouble();
            double y = MIN + (MAX - MIN) * random.nextDouble();
            System.out.println(Equation.calc(x,y));
            listener.getPoint(new PointEvent(x,y,Equation.calc(x,y)));
            updateProgress(i, numberOfPoints);

            if(i == numberOfPoints) {
                listener.getResult(new PointEvent(1));
                break;
            }
            if(isCancelled()) {
                listener.getResult(new PointEvent(1));
                break;
            }i++;
        }
        return null;
    }
}
