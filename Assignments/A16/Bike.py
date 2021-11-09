# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 11/08/2021 

# The Bicycle class which is the Parent class
class Bicycle:
    gear = int()        # instance variable for gear
    speed = int()       # instance variable for speed
    
    # Default constructor.
    def __init__(self, gear = None, speed = None):
        self.gear = gear
        self.speed = speed
    
    def brake(self, decrement = None):
        self.speed-= decrement
    
    def speedUp(self, increment = None):
        self.speed += increment
    
    def status(self):
        print(f'Speed is {self.speed}\n Gear is {self.gear}')

    def set_brake(self, brake):        
        self.brake = brake
        
    def get_brake(self):
        return self.brake
    
    def set_gear(self, gear):        
        self.brake = gear
        
    def get_gear(self):
            return self.gear
     
# Mountain Bike Class(or Child class) which inherit from Bicycle
class mountainBike(Bicycle):
    seatHeight = int()      # instance variable for seatHeight
    
    def __init__(self, gear = None, speed = None, seatHeight = None): # constructor for montainBike
        super().__init__(gear, speed)               # Calling the Constructor for the Bicycle class
        self.seatHeight = seatHeight
    
    def status(self):                               # Display on the screen.
        print(f'Speed is = {self.speed}\n Gear is = {self.gear} \n seat Height = {self.seatHeight}')


print("""
author Loic Konan
Semester: Fall 2021
Date: 11/08/2021          
    """
    )
# Make an objects for Bike and Mountain Bike
mBike = mountainBike(3,25,7)
Bike1 = Bicycle(25,81)

# Get the status before
print('This is the Status before changing speed')
print('Mountain status is = ')
mBike.status()
print('Bicycle Bike status is = ')
Bike1.status()

# Speed Up 
mBike.speedUp(110)

# Brake 
Bike1.brake(45)

# Get the status after
print('\nThis is the Status after changed the speed')
print('Mountain status is = ')
mBike.status()
print('Bicycle Bike status is = ')
Bike1.status()