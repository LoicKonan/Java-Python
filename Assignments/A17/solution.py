def addTwoNumbers(l1, l2):
    res = None
    curr = Node()
    carry = 0
    
    while l1 is not None or l2 is not None:
        if l1 is not None:
            l1Val = l1.val
        else:
            l1Val = 0

        # l1Val = l1.val if l1 is not None else 0
        
        if l2 is not None:
            l2Val = l2.val
        else:
            l2Val = 0
        
        summ = l1Val + l2Val + carry
        
        carry, currVal = divmod(summ, 10)
        currNode = Node(currVal)
        
        if res is None:
            res = currNode
            curr = res
        else:
            curr.next = currNode
            curr = curr.next
        
        if l1 is not None:
            l1 = l1.next
        
        if l2 is not None:
            l2 = l2.next
    
    if carry!=0:
        curr.next = Node(carry)
    return res