package demo1;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("---STREAM FROM LIST---");
        //Create a stream from given list and print the elements
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(10);
        list.stream().forEach(System.out::println);

        System.out.println("---STREAM FROM SET---");
        //Create a stream from given set and print the elements
        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(30);
        set.add(10);
        set.stream().forEach(System.out::println);

        System.out.println("---STREAM FROM MAP---");
        //Create a stream from given map and print the elements
        Map<Integer, String> map = new HashMap<>();
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(10, "Ten");
        map.entrySet().stream().forEach(System.out::println);


    }
}
