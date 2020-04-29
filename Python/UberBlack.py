from car import Car

class UberBlack(Car):
    typeCarAccepted = []
    seatsMaterial   = []

    def __init__(self, license, driver, typeCarAccepted, seatsMaterial):
        super.__init__(licence,driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial