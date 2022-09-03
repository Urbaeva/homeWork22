package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            int n = random.nextInt(1,100);
            arrayList.add(n);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) %2 == 0)
                arrayList1.add(arrayList.get(i));
            else
                arrayList2.add(arrayList.get(i));
        }
        System.out.print("In #1 ArrayList " + arrayList1.size() + " even numbers: ");
        System.out.println(arrayList1);
        System.out.print("In #2 ArrayList " + arrayList2.size() + " odd numbers: ");
        System.out.println(arrayList2);
    }
}
