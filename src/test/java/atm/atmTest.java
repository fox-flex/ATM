package atm;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class atmTest {
    ATM atm;
    ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        atm = new ATM();
    }

    @Test
    public void process() throws NotFinishProcessException {
        System.setOut(new PrintStream(outputStream));
        atm.process(125);
        assertEquals(outputStream.toString().trim(), "Took 1 5-bills.\nTook 0 10-bills.\nTook 6 20-bills.");
        System.setOut(System.out);
    }

    @Test(expected = NotFinishProcessException.class)
    public void processIncorrectAmount() throws NotFinishProcessException {
        ATM atm = new ATM();
        atm.process(126);
    }
}