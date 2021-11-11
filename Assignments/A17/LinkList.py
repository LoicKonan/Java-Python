# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 11/10/2021 


class Node:
      # Constructor to initialize the node object
      def __init__(self, data=None):
        self.data = data
        self.next = None


class LinkedList:
  def __init__(self, nodes=None):
    self.head = None
    if nodes is not None:
      node = Node(nodes.pop(0))
      self.head = node
      for element in nodes:
        node.next = Node(element)
        node = node.next

  def __repr__(self):
    node = self.head
    nodes = []
    while node is not None:
      nodes.append(node.data)
      node = node.next
    nodes.append('None')
    return "->".join(nodes)
  
  def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        val = l1.val + l2.val 
        # c = val // 10
        ret = LinkedList(val % 10 ) 
        
        if (l1.next != None or l2.next != None):
            if l1.next == None:
                l1.next = LinkedList(0)
            if l2.next == None:
                l2.next = LinkedList(0)
            ret.next = self.addTwoNumbers(l1.next,l2.next)
        return ret



l1 = ['3', '2', '1']
l2 = ['6', '5', '4']
# ll1 = LinkedList(l1)
# ll2 = LinkedList(l2)
# print(ll1)
# print(ll2)
add = LinkedList.addTwoNumbers(l1,l2)
print(add)
