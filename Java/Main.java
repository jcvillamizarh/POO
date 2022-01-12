import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        Map<String, Map<String, Integer>> typeCarAccepted = new HashMap<>();
        Map<String, Integer> typeCar = new HashMap<>();
        typeCar.put("doors", 4);
        typeCarAccepted.put("Mercedes Benz", typeCar);

        Map<String, Integer> seatsMaterial = new HashMap<>();
        seatsMaterial.put("leather", 8);
        
        UberVan uberVan = new UberVan("ASD784", new Account("Juan Camilo", "123456"), typeCarAccepted, seatsMaterial);
        uberVan.printDataCar();
        
    }
}