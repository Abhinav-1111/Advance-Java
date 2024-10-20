package Demo3.example5;

import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Set<String > set = Set.of("Java", "python", "C");
        System.out.println("This set is an unmodifiable set");
        System.out.println("Contents of HashSet are : " + set);

        System.out.println("Addition of new element to set is not allowed");
//        set.add("C#");

        System.out.println("Removal of element from set is not allowed");
//        set.remove("Java");

        System.out.println("clear set is not allowed");
//        set.clear();

    }
}
