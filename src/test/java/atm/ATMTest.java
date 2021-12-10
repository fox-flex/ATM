package atm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



class ATMTest {
    ATM atm;
    ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        atm = new ATM();
    }

    @Test
    void process() throws NotFinishProcessException {
        System.setOut(new PrintStream(outputStream));
        atm.process(125);
        assertEquals(outputStream.toString().trim(), "20 bills : 6\n10 bills : 0\n5 bills : 1");
        System.setOut(System.out);
    }

    @Test(expected = NotFinishProcessException.class)
    public void processIncorrectAmount() throws NotFinishProcessException {
        ATM atm = new ATM();
        atm.process(126);
    }
}