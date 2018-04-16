package sample;

public class PointEvent {
    private double x;
    private double y;

    private boolean belongingness;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean getBelongingness() {
        return belongingness;
    }

    public PointEvent(double xToAdd, double yToAdd, boolean belongingnessToAdd){
        x = xToAdd;
        y = yToAdd;
        belongingness = belongingnessToAdd;

    }
}

