import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    Calculator calculator;

    @Before
    public void calculator() {calculator = new Calculator();}

    @Test
    public void add() { assertEquals(5, calculator.add(3, 2));}

    @Test
    public void subtract() { assertEquals(1, calculator.subtract(3, 2));}

    @Test
    public void multiply() { assertEquals(6, calculator.multiply(3, 2));}

    @Test
    public void divide() { assertEquals(2, calculator.divide(4, 2));}

}
