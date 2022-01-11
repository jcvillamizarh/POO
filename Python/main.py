from car import Car
if __name__ == "__main__":
    print("Hola mundo")
    car = Car()
    car.license = "AMS1234"
    car.driver = "Andres Herrera"
    print(vars(car))