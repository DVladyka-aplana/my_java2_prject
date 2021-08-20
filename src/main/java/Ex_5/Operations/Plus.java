package Ex_5.Operations;


public class Plus extends Operations{

    public Plus(double xVal, double yVal) {
        super(xVal, yVal);
    }

    @Override
    public double operation(double x, double y) {
        return x+y;
    }

}
