package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(1);
        list.add(123);
        list.add(456);
        System.out.println(list.get(list.size()));
    }
}
