class Node:
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

  def add_first(self, new_node):
    if not self.head:
      self.head = new_node
      return
    new_node.next = self.head
    self.head = new_node

  def __iter__(self):
    node = self.head
    while node is not None:
      yield node
      node = node.next

  def add_last(self, new_node):
    if not self.head:
      self.head = new_node
      return
    for curr_node in self:
      pass
    curr_node.next = new_node
    
  def remove_node(self, remove_node_data):
    if not self.head:
        raise Exception('Linked list is empty')
    if self.head.data == remove_node_data:
        self.head = self.head.next
        return
    previous_node = self.head
    for current_node in self:
        if current_node.data == remove_node_data:
            previous_node.next = current_node.next
            return
        previous_node = current_node
    raise Exception('Node is not found')
    
    
    

l1 = ['3', '2', '1']
new_node = Node('100')
ll1 = LinkedList(l1)
print(ll1)
ll1.add_first(new_node)
new_node2 = Node('200')
print(ll1)
ll1.add_last(new_node2)
ll1.remove_node('2')
print(ll1)