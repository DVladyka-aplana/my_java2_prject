import Ex_7.ApplicCalc;
import Ex_7.Operations.MathCalcul;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCalc {
    double x;
    double y;
    MathCalcul operation = new MathCalcul(x,y);

    @Test public void TestPlus (){
        x = 100;
        y = 2;
        assertEquals(102.0,operation.plus(x,y));
    }
    @Test public void TestPlusOtr (){
        x = 100;
        y = -2;
        assertEquals(98.0,operation.plus(x,y));
    }
    @Test public void TestPlusOtr2 (){
        x = -100;
        y = -2;
        assertEquals(-102.0,operation.plus(x,y));
    }
    @Test public void TestMinus (){
        x = 20;
        y = 10;
        assertEquals(10.0,operation.minus(x,y));
    }
    @Test public void TestMinusOtr (){
        x = 20;
        y = -10;
        assertEquals(30.0,operation.minus(x,y));
    }
    @Test public void TestMinusOtr2 (){
        x = -20;
        y = -10;
        assertEquals(-10.0,operation.minus(x,y));
    }
    @Test public void TestMulti (){
        x = 7;
        y = 7;
        assertEquals(49.0,operation.multiply(x,y));
    }
    @Test public void TestMultiOtr (){
        x = -7;
        y = 7;
        assertEquals(-49.0,operation.multiply(x,y));
    }
    @Test public void TestMultiOtr2 (){
        x = -7;
        y = -7;
        assertEquals(49.0,operation.multiply(x,y));
    }
    @Test public void TestDiv (){
        x = 45;
        y = 5;
        assertEquals(9.0,operation.divide(x,y));
    }
    @Test public void TestDivOtr (){
        x = 45;
        y = -5;
        assertEquals(-9.0,operation.divide(x,y));
    }
    @Test public void TestDivZeroPositive (){
        x = 100;
        y = 0;
        assertEquals(Double.POSITIVE_INFINITY,operation.divide(x,y));
    }
    @Test public void TestDivZeroNegative (){
        x = -100;
        y = 0;
        assertEquals(Double.NEGATIVE_INFINITY,operation.divide(x,y));
    }
}
