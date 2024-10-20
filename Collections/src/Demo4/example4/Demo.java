package Demo4.example4;

import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<Integer, String > map = Map.of(30, "Thirty", 2, "Two", 3, "Three");
        System.out.println("This map is an unModifiable map");
        System.out.println("Contents of map are : " + map);

        System.out.println("Addition of new element to map is not allowed");
//        map.put(60, "C#");

        System.out.println("Removal of element from map is not allowed");
//        map.remove(3, "Three");

        System.out.println("clear map is not allowed");
//        map.clear();
    }
}
