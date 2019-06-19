package test;

import org.junit.Test;
import Rechner.*;
import static org.junit.Assert.*;

public class RechnerTest {

    @Test
    public void validInput() throws InvalidFormatException {
        assertEquals(11, Rechner.sum("4;7"));
    }

    @Test
    public void validInputSum() throws InvalidFormatException {
         assertEquals(11, Rechner.sum("4 7"," "));
    }

    @Test(expected= InvalidFormatException.class)
    public void invalidDelimeterSum() throws InvalidFormatException {
        Rechner.sum("4 7");
    }

    @Test(expected= InvalidFormatException.class)
    public void invalidNumberSum() throws InvalidFormatException{
        Rechner.sum("4;a");
    }

    @Test
    public void validInputSumList() throws InvalidFormatException {
        assertEquals(40, Rechner.sumList("7;8;10;15",";"));
    }

    @Test(expected= InvalidFormatException.class)
    public void invalidDelimeterSumList() throws InvalidFormatException {
        Rechner.sumList("a 7 c d"," ");
    }

    @Test(expected=InvalidFormatException.class)
    public void invalidDelimeterSumList2() throws InvalidFormatException {
        Rechner.sumList("1  2  2  3"," ");
    }
}