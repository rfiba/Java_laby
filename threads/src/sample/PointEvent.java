package sample;

public class PointEvent {
    double x;
    double y;
    double result;
    boolean belongingness;

    public PointEvent(double xToAdd, double yToAdd, boolean belongingnessToAdd){
        x = xToAdd;
        y = yToAdd;
        belongingness = belongingnessToAdd;
        result = -1;
    }

    public PointEvent(double resultToAdd)
    {
        result = resultToAdd;
    }
}

