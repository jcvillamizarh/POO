from car import Car
from account import Account
if __name__ == "__main__":
    print("Hola mundo")

    car = Car("AMS123", Account("Juan Villamizar", "ASD790"))
    print(vars(car))
    print(vars(car.driver))