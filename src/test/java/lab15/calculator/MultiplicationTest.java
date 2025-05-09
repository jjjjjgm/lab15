package lab15.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {
    @Test
    void testMultiplyPositive() {
        Multiplication calc = new Multiplication();
        assertEquals(6.0, calc.multiply(2.0, 3.0));
    }

    @Test
    void testMultiplyNegative() {
        Multiplication calc = new Multiplication();
        assertEquals(-6.0, calc.multiply(-2.0, 3.0));
    }
    @Test
    void testDivisionPositive() {
        Division calc = new Division();
        assertEquals(3.0, calc.division(9.0, 3.0));
    }

    @Test
    void testDivisionNegative() {
        Division calc = new Division();
        assertEquals(-3.0, calc.division(-9.0, 3.0));
    }
}
