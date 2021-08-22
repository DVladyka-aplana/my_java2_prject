package Ex_7.Operations;

public abstract class Operations {
    double x;
    double y;

    public Operations(double xVal, double yVal){
        x = xVal;
        y = yVal;
    }
    public abstract double operation();

}