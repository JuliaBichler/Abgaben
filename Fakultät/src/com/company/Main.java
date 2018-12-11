package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        long t=System.nanoTime();
        //System.out.println(fac(1));
        //System.out.println(isPalindrom("123456789987654321"));
        System.out.println(facru(5));
        //System.out.println(facendre(5,1));
        System.out.println(Zeitnehmung(t));
    }
    public static int fac(int n)
    {
        int s=1;
        for(int i=1; i<=n;i++)
            s=s*i;
        return s;
    }
    public static int facru(int n)
    {
        if(n==1)return 1;

        return n*facru(n-1);
    }
    public static int facendre(int n,int erg)
    {
        if(n==1)return erg;
        else {return facendre(n-1,erg*n);}

    }
    public static long Zeitnehmung(long t)
    {
        long k=System.nanoTime();
        long zeit = k-t;
        return zeit;
    }
    public static boolean isPalindrom (String s)
    {
        char[] a= s.toCharArray();
        boolean pali = false;
        if(a.length%2==0)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i] != a[a.length-i-1]){
                    return false;
                }
                else {
                    pali = true;
                }
            }

        }
        else{
            for(int i=0;i <a.length;i++)
            {
                if(a[i] != a[a.length-i-1]){
                    return false;
                }
                else {
                    pali = true;
                }
            }
        }


        return pali;
    }

}
