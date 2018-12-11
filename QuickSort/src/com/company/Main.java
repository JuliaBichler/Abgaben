package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(7);
        a.add(3);
        a.add(5);
        a.add(9);
        a.add(6);
        a.add(1);
        System.out.println(a);
        System.out.print(quick(a));
    }


    public static ArrayList<Integer> quick(ArrayList<Integer> a) {
        System.out.println(a);
        if ((a.size() == 0)||(a.size()==1)) {
            return a;
        }

        int pivot = a.get(a.size()/2);

        ArrayList<Integer> low = new ArrayList<>();
        ArrayList<Integer> high = new ArrayList<>();
        ArrayList<Integer> all = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if(i==a.size()/2)
                continue;
            if (a.get(i) <= pivot) {
                low.add(a.get(i));
            } else {
                high.add(a.get(i));
            }
        }

        all.addAll(quick(low));
        all.add(pivot);
        all.addAll(quick(high));
        return all;
    }

}
































     /*protected ArrayList<Vehicle> quickSort(ArrayList<Vehicle> list)
    {
        if (list.size() <= 1)
            return list; // Already sorted

        ArrayList<Vehicle> sorted = new ArrayList<Vehicle>();
        ArrayList<Vehicle> lesser = new ArrayList<Vehicle>();
        ArrayList<Vehicle> greater = new ArrayList<Vehicle>();
        Vehicle pivot = list.get(list.size()-1); // Use last Vehicle as pivot
        for (int i = 0; i < list.size()-1; i++)
        {
            //int order = list.get(i).compareTo(pivot);
            if (list.get(i).compareTo(pivot) < 0)
                lesser.add(list.get(i));
            else
                greater.add(list.get(i));
        }

        lesser = quickSort(lesser);
        greater = quickSort(greater);

        lesser.add(pivot);
        lesser.addAll(greater);
        sorted = lesser;

        return sorted;
    }*/

