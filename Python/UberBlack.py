from car import Car

class UberBlack(Car):
    typeCarAccepted = []
    seatsMAterial = []

    def __init__(self, license, driver, typeCarAccepted, seatsMaterial):
        super().__init__(license, driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMAterial = seatsMaterial