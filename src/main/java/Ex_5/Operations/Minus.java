package Ex_5.Operations;

public class Minus extends Operations {
    public Minus(double xVal, double yVal) {
        super(xVal, yVal);
    }

    @Override
    public double operation(double x, double y) {
        return x-y;
    }
}
