
# create a class calle node that will be the basis for each node
class Node:
    
    # first and foremost, we must create a constructor for our node
    # inside of whcih we have the elements and then the node will 
    #be pointing to none so essentially (Head -> None) each
    # time we add elements, we will be continually growing outwards 
    def __init__(self, initial_elements):
        self._elements = initial_elements
        self._next = None
    # function method in which we return the elements of our node
    # this is utilizing the get method so inside of here, we 
    # will be passing back the elements inside of the node itself

    @property# getting attribute values and returning the elements
    def elements(self):
        return self._elements

    # setter method for the elements in our nodes where we 
    # set new daya to each of our nodes again, because 
    # we are setting, we wont be reutrning anythin here
    @elements.setter# accessor method
    def elements(self, new_elements):
        self._elements = new_elements

    # function method in which we return the value that next is 
    # pointing to in which the next value is another node 
    # which could be none or could be another node

    @property # used for getting attribute data
    def next(self):
        return self._next

    # here we have setter value  where we are going to set the 
    # value of the node to next pointer we dont return anything 
    # here we just point to next
    @next.setter # accessor method
    def next(self, NextValuePtr):
        self._next = NextValuePtr


class Stack:
    # constructor for the class stack implementing the link list
    # will set the calue of the top to None and the StackSize to that
    # of Zero
    def __init__(self):
        self.TopOfStack = None
        self._StackSize = 0

    # if want to return the StackSize of the stack this function 
    # will be instantiated and return the StackSize of the stack
    def StackSize(self):
        return self._StackSize

    # if the stack is empty, the top is None
    def empty(self):
        return self.TopOfStack is None

    # if there are elemnts at the top, then return the top elements
    # if the stack is empty, then return none
    def top(self):
        if not self.empty():
            return self.TopOfStack.elements
        else:
            return None

    # whenever we push new elements into the link list stack
    # this function is initiated 
    def push(self, new_elements):
        
        # new node is created that will hold the elements and 
        # will then become the new top elements and the old top 
        # value will be pointing to the next value
        # the new node will be initialize to the top
        # and we increase the StackSize by one each time new node added
        NewNode = Node(new_elements)
        NewNode.next = self.TopOfStack
        self.TopOfStack = NewNode
        self._StackSize += 1

    # we define out pop definition method that will remove the 
    # top none on the stack(LIFO) and this will return the 
    # elements that are present, if the stack is empty, None
    def pop(self):
        
        if not self.empty():
            # the next node after the current top will become the
            # new top value 
            NextNode = self.TopOfStack.next
            TopNodeValue = self.TopOfStack.elements
            # our next node in line will become the new top node
            self.TopOfStack = NextNode
            # with popping, the current StackSize of the list will
            # decrease by one
            self._StackSize -= 1
            # return the elements of the top node
            return TopNodeValue
        else:
            # if the stack is empty, there is nothing to return so
            # we return none
            return None

    # If we want to view our stack, we must create a method that will 
    # handle this 
    def __iter__(self):
        # we create a temp node to point to the head of our list and
        # this will iterate throughought the whole list until
        # it is at None value or the end of the list(i.e. pointing to
        # null value and there is no next node)
        temp_node = self.TopOfStack
        # while it is not pointing to Nonde
        while temp_node is not None:
            # we will yield the elements in the list
            yield temp_node.elements
            # go to the next value and do again until null
            temp_node = temp_node.next


if __name__ == '__main__':
    # Here We create a new link list stack we are going to push some values
    # pop some and iterate through the list to see how a stack and link list 
    #work

    #create an object from stack class
    stack = Stack()
    
    # pushing some values to our link list 
    # calling the mehtod (obj.push(value))
    print("\nWe are now going to push a few values to our link List\n")
    print("===============================================\n")
    print("Values successfully pushed to Linked List Stack\n")
    print("===============================================\n")
    stack.push(200)
    stack.push(5)
    stack.push(103)
    stack.push(9)
    stack.push(57)
    stack.push(-50)
    stack.push(23)
    stack.push(77)
    stack.push(19)
    # now tht we have pushed some values to the stack,
    # lets see about  iterating through and see what we got

    print('Our Stack Values are as Follows : ', end='')
    # for values in the stack print out each one followed by space
    # from head to null
    for elements in stack:
        print(elements, end=' ')

    print('\n')
    # Lets view the top of our stack see what we got
    # at what our top element is now to do this, we just call stack.top()
    print(f'After Adding Nodes to the stack, our Top Value is : {stack.top()}')
    print("===============================================")
    print('\n')


    # now,we are going to pop a few elements from the link list stack
    # to do this, all we do is call the method stack.pop
    print("\nWe are now going to pop a few values from our link List")
    print("=======================================================\n")
    print(f'We are popping {stack.pop()} from the stack')
    print(f'We are popping {stack.pop()} from the stack')
    print(f'We are popping {stack.pop()} from the stack')
    print("================================\n")
    #To see the results of our link list stack, lets iterate
    # again and see what we got
    
    print('After We popped Some elements, our Stack Values are : ')
    # iterate through the stack again until the end
    for elements in stack:
        print(elements, end=' ')
    print('\n')

    # now that we see our values after we popped them, lets take a look
    # at what our top element is now to do this, we just call stack.top()
    print("===============================================")
    print(f'After Removing some Values, our New Top is : {stack.top()}')
    print("===============================================\n\n")