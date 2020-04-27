import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer = new Printer();

    @Test
    public void numberOfSheets(){
        assertEquals(100, printer.getNumberOfSheets());
    }

    @Test
    public void canPrintCopies() {
        printer.printCopies( 2, 5 );
        assertEquals( 90, printer.getNumberOfSheets() );
    }

}
