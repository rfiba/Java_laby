package sample;

import javafx.concurrent.Task;
import javafx.scene.canvas.GraphicsContext;

import java.util.Random;



public class DrawerTask extends Task {
    private int numberOfPoints;
    private int MIN = -8;
    private int MAX = 8;
    private Random random;
    private PointListner listener;

    DrawerTask(int numberOfPointsToAdd){
        numberOfPoints = numberOfPointsToAdd;
        random = new Random();
    }

    public synchronized void addListener(PointListner listenerToAdd) {
        listener = listenerToAdd;
    }

    @Override
    protected Object call() throws Exception {
        int i = 0;
        int amountInTarget = 0;
        boolean inTarget;
        while(true){
            double x = MIN + (MAX - MIN) * random.nextDouble();
            double y = MIN + (MAX - MIN) * random.nextDouble();

            inTarget = Equation.calc(x,y);
            if(inTarget)
                amountInTarget++;

            listener.getPoint(new PointEvent(x,y,inTarget));
            updateProgress(i, numberOfPoints);

            if(i == numberOfPoints) {
                System.out.println(amountInTarget);
                //listener.getResult(new PointEvent((double)amountInTarget/256));

                break;
            }

            if(isCancelled()) {

                //listener.getResult(new PointEvent((double)amountInTarget/256));
                //return (double)amountInTarget/256;
                break;

            }

            i++;
        }
        return (double)amountInTarget/256;
    }
}
