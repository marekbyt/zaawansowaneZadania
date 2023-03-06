package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> unsorted = List.of("A", "X", "G", "S");
        List<String> result = sortUsingAnonymusClass(unsorted);
        System.out.println(result);
        result = sortUsingOwnComparator(unsorted);
        System.out.println(result);
        System.out.println("Sorted using lambda " + sortUsingLambda(unsorted));
        System.out.println("Sorted using stream " + sortUsingStream(unsorted));

    }
    private static List<String> sortUsingAnonymusClass(List<String> unsorted){
       List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        return sorted;
    }
    private static List<String> sortUsingOwnComparator(List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyOwnComparator());
        return sorted;
    }
    private static List<String> sortUsingLambda(List<String> unsorted){
    List<String> sorted = new ArrayList<>(unsorted);
    Collections.sort(sorted, (o1, o2) -> -o1.compareTo(o2));
    return sorted;
    }
    private static List<String> sortUsingStream(List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        return sorted
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }
    private static List<String> sortUsingList(List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(Comparator.reverseOrder());
        return sorted;
    }
}
