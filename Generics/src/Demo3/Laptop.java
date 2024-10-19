package Demo3;

import java.util.Objects;

public class Laptop {
    private int id;
    private String name;

    public Laptop(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Laptop(int id) {
        super();
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Laptop{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
