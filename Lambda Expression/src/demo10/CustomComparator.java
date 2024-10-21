package demo10;

public class CustomComparator {
    public CustomComparator() {

    }

    public int compareByName(Employee a, Employee b){
        return a.getName().compareTo(b.getName());
    }

    public int compareByMarks(Employee a, Employee b){
        return a.getMarks() - b.getMarks();
    }

}
