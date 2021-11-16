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
    
    
l1 = ['3', '2', '1']
new_node = Node('100')
ll1 = LinkedList(l1)
print(ll1)
ll1.add_first(new_node)
new_node2 = Node('200')
print(ll1)
ll1.add_last(new_node2)