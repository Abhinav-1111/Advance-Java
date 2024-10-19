package Demo3;

import java.util.Objects;

public class Book {
    private int id;
    private String name;

    public Book(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Book(int id) {
        super();
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
