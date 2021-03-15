import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasPaper() {
        assertEquals(500, printer.getPaperLeft());
    }

    @Test
    public void hasToner() {
        assertEquals(5000, printer.getTonerVolume());
    }

    @Test
    public void canPrint() {
        printer.print(1, 1);
        assertEquals(499, printer.getPaperLeft());
        printer.print(9, 1);
        assertEquals(490, printer.getPaperLeft());
        printer.print(2, 10);
        assertEquals(470, printer.getPaperLeft());
    }

    @Test
    public void refusesToPrintIfInsufficientPaper(){
        assertEquals(false, printer.print(501, 1));
        assertEquals(500, printer.getPaperLeft());
    }

    @Test
    public void printingReducesToner(){
        printer.print(50, 2);
        assertEquals(4900, printer.getTonerVolume());
    }
}
