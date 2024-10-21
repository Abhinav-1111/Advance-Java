package demo9;

public class CustomComparator {
    public CustomComparator() {

    }

    public static int compareByName(Employee a, Employee b){
        return a.getName().compareTo(b.getName());
    }

    public static int compareByMarks(Employee a, Employee b){
        return a.getMarks() - b.getMarks();
    }


}
