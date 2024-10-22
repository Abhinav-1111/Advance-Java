package demo2;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int marks;

    public Employee(int id, String name, int marks) {
        super();
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", marks=" + marks + '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.getId() - o.getId();
    }
}
