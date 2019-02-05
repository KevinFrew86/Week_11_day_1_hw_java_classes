import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() { printer = new Printer(100, 50);}

    @Test
    public void has100sheets() {
        assertEquals(100, printer.getNumberOfSheets());
    }

    @Test
    public void print() {
        printer.print(20);
        assertEquals(80, printer.getPaper());
        assertEquals(49, printer.getToner());
    }

    @Test
    public void refill() {
        printer.refill();
        assertEquals(100, printer.getPaper());
    }

}
