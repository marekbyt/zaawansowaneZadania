package day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> unsorted = List.of("C", "A", "c", "X", "a");
        System.out.println("Sorted using stream " + sortedUsingStream(unsorted));


        }
        private static List<String> sortedUsingStream(List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(new MyOwnIgnorCaseComparator());
        return sorted;


        }

}


