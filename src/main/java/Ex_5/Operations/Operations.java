package Ex_5.Operations;

public abstract class Operations {
    double x;
    double y;

    Operations(double xVal,double yVal){
        x = xVal;
        y = yVal;
    }
    public abstract double operation(double x, double y);

}