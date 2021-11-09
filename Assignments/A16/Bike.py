# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 11/08/2021 

# The Bicycle class which is the Parent class
class Bicycle:
    gear = int()
    speed = int()
    
    def __init__(self, gear = None, speed = None):
        self.gear = gear
        self.speed = speed
    
    def brake(self, decrement = None):
        self.speed-= decrement
    
    def speedUp(self, increment = None):
        self.speed += increment
    
    def status(self):
        print(f'Speed is {self.speed}\n Gear is {self.gear}')

# Mountain Bike Class(or Child class) which inherit from Bicycle
class mountainBike(Bicycle):
    seatHeight = int()
    
    def __init__(self, gear = None, speed = None, seatHeight = None):
        super().__init__(gear, speed)
        self.seatHeight = seatHeight
    
    def status(self):
        print(f'Speed is {self.speed}\n Gear is {self.gear} \n seat Height {self.seatHeight}')

# Make an objects for Bike and Mountain Bike
mBike = mountainBike(2,26,3)
Bike1 = Bicycle(5,66)


# Get the status before
print('the Status before changing speed')
print('Mountain status is: ')
mBike =.status()
print('Bicycle Bike status is: ')
Bike1.status()

# Speed Up my mountain bike by 4 mph
mBike =.speedUp(4)

# Brake up my car by 6 mph
Bike1.brake(6)

# Get the status after
print('the Status after changed the speed')
print('Mountain status is: ')
mBike =.status()
print('Bicycle Bike status is: ')
Bike1.status()