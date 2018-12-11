package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int n=3;
        ArrayList <Integer> target= new ArrayList<>();
        ArrayList <Integer> aux= new ArrayList<>();
        ArrayList <Integer> src= new ArrayList<>();

        for(int i = n; i>0;i--)
        {
            src.add(i);
        }
        move(n,src,aux,target);
        printStatus(src,aux,target);

    }
    public static void move(int n, ArrayList<Integer> src,ArrayList<Integer> aux,ArrayList<Integer> target)
    {
        if(n==0)
        {
            return;
        }
        move(n-1,src,target,aux);
        target.add(src.remove(src.size()-1));
        move(n-1,aux,src,target);

    }
    public static void printStatus(ArrayList<Integer> src,ArrayList<Integer> aux, ArrayList<Integer> target)
    {
        System.out.print(src);
        System.out.print(aux);
        System.out.println(target);
    }
    public static void move2(int n, ArrayList<Integer> src,ArrayList<Integer> aux,ArrayList<Integer> target)
    {
        if(n==0)
            return;;
        move(n-1,src,target,aux);
        target.add(src.remove(src.size()-1));
        move(n-1,aux,src,target);
    }
}
