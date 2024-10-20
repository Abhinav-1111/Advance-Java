package Demo4.example3;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<Integer, String > hashMap = new HashMap<>();
        hashMap.put(30, "Java");
        hashMap.put(80, "is");
        hashMap.put(17, "good");
        hashMap.put(56, "You");
        hashMap.put(34, "should");
        hashMap.put(90, "learn");
        hashMap.put(2, "this");
        hashMap.put(null, "a");
        hashMap.put(null, "b");
        System.out.println("Contents of HashMap are : " + hashMap);

        Map<Integer, String > linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(30, "Java");
        linkedHashMap.put(80, "is");
        linkedHashMap.put(17, "good");
        linkedHashMap.put(56, "You");
        linkedHashMap.put(34, "should");
        linkedHashMap.put(90, "learn");
        linkedHashMap.put(2, "this");
        linkedHashMap.put(null, "a");
        linkedHashMap.put(null, "b");
        System.out.println("Contents of HashMap are : " + linkedHashMap);


        Map<Integer, String > treeMap = new TreeMap<>();
        treeMap.put(30, "Java");
        treeMap.put(80, "is");
        treeMap.put(17, "good");
        treeMap.put(56, "You");
        treeMap.put(34, "should");
        treeMap.put(90, "learn");
        treeMap.put(2, "this");
//        treeMap.put(null, "a");
//        treeMap.put(null, "b");
        System.out.println("Contents of TreeMap are : " + treeMap);

    }
}
