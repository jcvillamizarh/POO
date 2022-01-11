package POO.Java;

public class Car {
    Integer id;
    String license;
    String driver;
    Integer passenger;

    @Override
    public String toString() {
        return "Car [driver=" + driver + ", id=" + id + ", license=" + license + ", passenger=" + passenger + "]";
    }
}
