package Ex_5.Operations;

public class Divide extends Operations{
    public Divide(double xVal, double yVal) {
        super(xVal, yVal);
    }

    @Override
    public double operation(double x, double y) {
        return x/y;
    }
}
