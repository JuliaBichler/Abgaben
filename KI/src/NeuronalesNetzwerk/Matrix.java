package NeuronalesNetzwerk;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Matrix {


    public static double[][] mul(double a[][],double b[][]){

        double c[][]=null;

        int x = a[0].length;
        int y = b[0].length;

        c = new double[x][y];

        for(int i=0;i<a[0].length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                c[i][j] = round(c[i][j], 14);
            }
        }
        return c;
    }

    public static double[][] add(double a[][],double b[][])
    {
        int x = a[0].length;
        int y = b[0].length;
        double[][] sum = new double[x][y];
        for(int i = 0; i <a[0].length ; i++) {
            for (int j = 0; j <b[0].length ; j++) {
                sum[i][j] = round(a[i][j] + b[i][j],14);
            }
        }
        return sum;
    }

    public static double sigmoid(double x)
    {
        double y = (1/(Math.exp(-x)+1));

        return y;
    }

    private static double round(double value, int places) {
        if(places < 0)throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static double skalar(double a[][],double b[][])
    {
        double sum = 0;
        for(int i = 0; i <a.length ; i++) {
            sum = sum + a[i][0]*b[i][0];
        }
        return sum;
    }
}
