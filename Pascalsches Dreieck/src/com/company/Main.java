package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(pt(10,5));
        System.out.println(pt2(10,5));
        System.out.println(fib(8));

    }
    public static int pt(int zeile, int spalte)         //Rekusiv
    {
        int[][] p = new int[zeile][spalte];

        if (spalte==0 || spalte==zeile)
            return 1;
        if (spalte==1)
            return zeile;

        return pt(zeile-1,spalte-1) + pt(zeile-1,spalte);

    }
    public static int pt2(int zeile,int spalte)         //Interrativ
    {
        int[][] x = new int[zeile][spalte];
        int erg=1;
        x[0][0]=1;

        for(int i=2;i<zeile;i++)
        {
            for(int j=0;j<spalte;j++)
            {
                if(j==0)
                {
                    erg= 1;
                }
                else if(j==i)
                {
                    erg= 1;
                }
                else
                {
                    erg = x[i-1][j-1]+x[i-1][j];
                }

            }

        }
        return erg;
    }
    public static int fib(int n)
    {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);

    }
}
