package FactorialTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestFactorial extends Factorial {
    @Test
    void calculateFactorial_zero() {
        TestFactorial calculator = new TestFactorial();
        assertEquals(1, calculator.calculateFactorial(0));
    }

    @Test
    void calculateFactorial_positive() {
        TestFactorial calculator = new TestFactorial();
        assertEquals(120, calculator.calculateFactorial(5));
    }

    @Test
    void calculateFactorial_negative() {
        TestFactorial calculator = new TestFactorial();
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateFactorial(-1));
    }

}