package POO.Java;

class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car();
        car.id = 1234;
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passenger = 4;
        System.out.println(car.toString());
    }
}