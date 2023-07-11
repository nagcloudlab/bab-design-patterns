package com.example.iterator;


// data-structue a.k.a Collection + iterator ==> iterable

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class Application {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("chicken");
        arrayList.add("meat");
        arrayList.add("fish");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("rice");
        linkedList.add("biryani");


        display(arrayList);
        System.out.println();
        display(linkedList);
        System.out.println();

    }

    private static void display(Iterable<String> list) {

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

    }
}
