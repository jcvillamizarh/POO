package POO.Java;

class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        System.out.println(car.toString());
    }
}