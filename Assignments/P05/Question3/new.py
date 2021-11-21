
#CREATE a classs called Queue to nstantiat the running for
# the average from the user input
class Queue:
    # create the constructor for the queue
    def __init__(self, n):
        # for each element in the user input of values
        self.StreamValues=[0 for i in range(n)]

    #enqueue function
    def enqueue(self):
        # adding the stream values to the queue
        # initialized as enqueue inside of a queue,
        # you add by enqueu and remove by dequeue
        # init [1:] to include all in the line
        self.StreamValues = self.StreamValues[1:]

    #dequeue function method
    def dequeue(self, val):
        # append the value
        self.StreamValues.append(val)
    #function to return the sum of stream values,
    # each time will add with previous values and then
    # divide inside of the streamaverage class to get the
    # corresponding output
    def queue_sum(self):
        # sum is being return to stream average which will in
        # turn be calculated in the average which stored
        # and then each item that is iterated will be summed
        # together and divided by number of vals
        return sum(self.StreamValues)
    
#create our class stream average to iterate through the users
# input and then calculate the average for each of the stream 
# values and then print back the list to the screen the 
# calculation of each value in one list in its corresponding slot
class StreamAverage:
    # create basic constructor for the window and stream
    def __init__(self):
        self.WindowSize = 0
        self.stream = []
    # method inside of the stream to read in the 
    # user data  and override the window and stream  
    #function to take input
    def UserData(self):
        # read in the size of the window
        self.WindowSize = int(input("What is the Size of your Window? : "))
        # read in the the streams separated by collon
        # we will put them in a list and split them by commas
        print("\r\nPlease enter the stream values for your window(separated by comma) : ")
        self.stream = list(map(int, input().split(",")))

        # display to the user what they entered for better visual
        print("\n\n===============================================================")
        print("The window size you entered was          :", self.WindowSize)
        print("The Values you entered was               :", self.stream)
    #function method to compute the average for the values enetered one after another 
    # and store the output in list
    def Average(self):
        # output as a list
        output=[]
        temp = 0
        #call the queue class and pass the window size in
        # and the stream values
        queue = Queue(self.WindowSize)
        for i in range(len(self.stream)):
            #calcluelate the average by adding the elements etered 
            queue.enqueue()
            queue.dequeue(self.stream[i])
            #our average will be rounded to two decimal places 
            temp = round(queue.queue_sum()/min(i+1, self.WindowSize), 2)
            #add the average to output list
            output.append(temp)
        # return to the screen to correpsonding output by
        # the average for each of the numbers
        # inputed for string after going through the queue class
        return output


#-----Main portion of program to create object and run through the test---

#object of class moving average
TestingCase = StreamAverage()
#call the method inside of the class to take the user input
TestingCase.UserData()

#print out to the screen and call the average calculator which
# will utilize the queue class to sum the values each element and then return the 
# average for each item in the list hinging off of the value before
print("The The Average of the Stream Values are :", TestingCase.Average())
print("===============================================================\n\n")