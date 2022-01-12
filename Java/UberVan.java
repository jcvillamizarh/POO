import java.util.Map;

public class UberVan extends Car {

    private Integer passenger;

    Map<String, Map<String, Integer>> typeCarAccepted;
    Map<String, Integer> seatsMaterial;

    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
                     Map<String, Integer> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("You need to assign 6 passengers for a Van");
        }
    }

    @Override
    public void printDataCar() {
        super.printDataCar();
        System.out.println("Type Car Accepted: " + typeCarAccepted.toString());
    }
}
