//import Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void sqrtTruePositive(){
        assertEquals("Adding two integer numbers for True Positive", 2, calculator.sqrt2(4), DELTA);
        assertEquals("Adding two double numbers for True Positive", 3, calculator.sqrt2(9), DELTA);
    }

    @Test
    public void sqrtFalsePositive(){
        assertNotEquals("Adding two integer numbers for False Positive", 6, calculator.sqrt2(16), DELTA);
        assertNotEquals("Adding two double numbers for False Positive", 7, calculator.sqrt2(36), DELTA);
    }

    @Test
    public void factTruePositive(){
        assertEquals("Subtracting two integer numbers for True Positive", 6, calculator.fact(3), DELTA);
        assertEquals("Subtracting two double numbers for True Positive", 120, calculator.fact(5), DELTA);
    }

    @Test
    public void factFalsePositive(){
        assertNotEquals("Subtracting two integer numbers for False Positive", 6, calculator.fact(2), DELTA);
        assertNotEquals("Subtracting two double numbers for False Positive", 12, calculator.fact(5), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Multiplying two integer numbers for True Positive", 1.6094379124341003, calculator.log(5), DELTA);
        assertEquals("Multiplying two double numbers for True Positive", 1.9459101490553132, calculator.log(7), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Multiplying two integer numbers for False Positive", 6, calculator.log(5), DELTA);
        assertNotEquals("Multiplying two double numbers for False Positive", 7.3, calculator.log(2.1), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Dividing two integer numbers for True Positive", 4, calculator.pow1(2, 2), DELTA);
        assertEquals("Dividing two double numbers for True Positive", 1, calculator.pow1(2, 0), DELTA);
        assertEquals("Dividing two double numbers for True Positive", 9, calculator.pow1(3,2), DELTA);
        assertEquals("Dividing two double numbers for True Positive", 27, calculator.pow1(3, 3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Dividing two integer numbers for True Positive", 1, calculator.pow1(2, 2), DELTA);
        assertNotEquals("Dividing two double numbers for True Positive", 0, calculator.pow1(3, 0), DELTA);
        assertNotEquals("Dividing two double numbers for True Positive", 2, calculator.pow1(4, 0), DELTA);
        assertNotEquals("Dividing two double numbers for True Positive", 1, calculator.pow1(5, 1), DELTA);
    }


}
