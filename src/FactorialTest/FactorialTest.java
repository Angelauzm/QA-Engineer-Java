package FactorialTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest extends Factorial {
    @Test
    public void calculateFactorial_zero() {
        FactorialTest calculator = new FactorialTest();
        Assert.assertEquals(1, calculator.calculateFactorial(0));
    }

    @Test
    public void calculateFactorial_positive() {
        FactorialTest calculator = new FactorialTest();
        Assert.assertEquals(120, calculator.calculateFactorial(5));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void calculateFactorial_negative() {
        FactorialTest calculator = new FactorialTest();
        calculator.calculateFactorial(-1);
    }

}