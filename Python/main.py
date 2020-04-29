from car import Car
from account import Account
from UberX import UberX
from Driver import Driver
from User import User

if __name__ == "__main__":
    print("Hola Mundo")
    
    '''
    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))

    uberX = UberX("AMS234", Account("Andres Herrera", "ANDA876"), "chev", "stm")
    print(vars(uberX))
    '''
    user1 = User(1,"Alejandro","1803524534","m@mario.com", "pass")
    print(vars(user1))