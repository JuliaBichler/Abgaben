package test;

import NeuronalesNetzwerk.*;
import org.junit.Assert;
import org.junit.Test;
import java.lang.ArrayIndexOutOfBoundsException;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void validInput() {
        double a[][]={{1,2},{3,4}};
        double b[][]={{1,2},{3,4}};
        double c[][]={{7,10},{15,22}};

        assertTrue(Arrays.deepEquals(c, Matrix.mul(a,b))); }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void validInput2(){
        double a[][]={{1,2,3},{4,5,6}};
        double b[][]={{1,2},{3,4}};
        double c[][]={{1,2,3},{4,5,6}};

        assertTrue(Arrays.deepEquals(c, Matrix.mul(a,b))); }

    @Test
    public void addMatrix(){
        double a[][]={{1,2},{3,4}};
        double b[][]={{1,2},{3,4}};
        double c[][]={{2,4},{6,8}};

        assertTrue(Arrays.deepEquals(c, Matrix.add(a,b)));    }

    @Test
    public void addMatrixdouble(){
        double a[][]={{1.5,2.3},{3.7,4.6}};
        double b[][]={{1.6,2.4},{3.8,4.9}};
        double c[][]={{3.1,4.7},{7.5,9.5}};

        Assert.assertArrayEquals(c,Matrix.add(a,b)); }

    @Test
    public void SigmoidTest(){
        assertEquals(0.71095, Matrix.sigmoid(0.9),0.0001);
        assertEquals(1, Matrix.sigmoid(100),0.0001);
        assertEquals(0, Matrix.sigmoid(-100),0.0001);
    }

    @Test
    public void Skalar(){
        double a[][]={{1},{3},{5}};
        double b[][]={{2},{0},{4}};
        assertEquals(22, Matrix.skalar(a,b),0.0001);
    }



}
