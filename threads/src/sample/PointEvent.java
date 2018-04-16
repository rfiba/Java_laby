package sample;

public class PointEvent {
    private double x;
    private double y;
    private double result;
    private boolean belongingness;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getResult() {
        return result;
    }

    public boolean getBelongingness() {
        return belongingness;
    }

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

