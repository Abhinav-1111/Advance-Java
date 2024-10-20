package Demo1.example4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int noOfElements = 100000;

        long startTime1 = System.nanoTime();
        for (int i = 0; i < noOfElements; i++) {
            arrayList.add(i);
        }
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 -startTime1);
        System.out.println("Time taken by ArrayList for addition / modification of " + noOfElements + " element is "
        + duration1 + " nanoSeconds");

        long startTime2 = System.nanoTime();
        for (int i = 0; i < noOfElements; i++) {
            linkedList.add(i);
        }
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 -startTime2);
        System.out.println("Time taken by LinkedList for addition / modification of " + noOfElements + " element is "
        + duration2 + " nanoSeconds");

        long startTime3 = System.nanoTime();
        for (int i = 0; i < noOfElements; i++) {
            arrayList.get(i);
        }
        long endTime3 = System.nanoTime();
        long duration3 = (endTime3 -startTime3);
        System.out.println("Time taken by ArrayList for addition / modification of " + noOfElements + " element is "
        + duration3 + " nanoSeconds");

        long startTime4 = System.nanoTime();
        for (int i = 0; i < noOfElements; i++) {
            linkedList.get(i);
        }
        long endTime4 = System.nanoTime();
        long duration4 = (endTime4 -startTime4);
        System.out.println("Time taken by LinkedList for addition / modification of " + noOfElements + " element is "
        + duration4 + " nanoSeconds");
    }
}
