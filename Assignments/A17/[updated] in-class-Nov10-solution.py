def addTwoNumbers(l1, l2):
    # creating the result varibale as None
    res = None
    # creating a dummy node with nothing
    curr = Node()
    carry = 0
    
    # iterate the loop either l1 or l2 has values
    while l1 is not None or l2 is not None:
        #if l1 doesn't have values, make the l1val to zero
        if l1 is not None:
            l1Val = l1.data
        else:
            l1Val = 0

        # l1Val = l1.val if l1 is not None else 0
        
        #if l2 doesn't have values, make the l2val to zero
        if l2 is not None:
            l2Val = l2.data
        else:
            l2Val = 0
        
        #sum up l1 val, l2 val and carry (if retained from the last iteration, otherwise zero)
        summ = l1Val + l2Val + carry
        
        #divmod function separate carry and result part
        carry, currVal = divmod(summ, 10)
        
        #using the result part, we can create a node
        currNode = Node(currVal)
        
        #initially we have assigned result variable as none, when we add the first node to the result, we can do the following if
        if res is None:
            res = currNode      # pointing the res variable to the current node
            curr = res          # since we will return the res variable, we need to iterate the result linkedlist to insert teh next nodes, that's why we use curr to point teh res linkedlist
        else:
        # in this case, we have some values inside teh res linkedlist, now we need to iterate the linkedlist using next
            curr.next = currNode
            curr = curr.next
        
        # always we need to check whether we reach the end of the linkedlist for both l1 and l2. If we reach to teh end and use .next, we will get an error
        if l1 is not None:
            l1 = l1.next
        
        if l2 is not None:
            l2 = l2.next
    
    #After adding all nodes from l1 and l2, finally we will check if there is a carry remaining. If so, we can add a carry node and add to the current nodes .next
    if carry!=0:
        curr.next = Node(carry)
    return res