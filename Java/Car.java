package POO.Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    public Car() {
	}

	@Override
    public String toString() {
        return "Car [driver=" + driver.name + ", id=" + id + ", license=" + license + ", passenger=" + passenger + "]";
    }
}
