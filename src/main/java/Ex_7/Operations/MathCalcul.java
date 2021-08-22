package Ex_7.Operations;

import static java.lang.System.err;
import static java.lang.System.exit;

public class MathCalcul extends Operations {
    public MathCalcul(double xVal, double yVal) {
        super(xVal, yVal);
    }

    @Override
    public double operation() {
        return 0;
    }
    public double multiply(double x, double y) {
        return x*y;
    }
    public double minus(double x, double y) {
        return x-y;
    }
    public double divide(double x, double y) {
        return x / y;
    }
    public double plus(double x, double y) {
        return x+y;
    }
}
