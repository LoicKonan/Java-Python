# Python
# @author Loic Konan
# Semester: Fall 2021
# Date: 11/22/2021 


from collections import defaultdict

class Graph:
  def __init__(self):
    self.graph = defaultdict(list)
    self.nodes = 12
    # function to add an edge to graph
  def addEdge(self,u,v):
    self.graph[u].append(v)
    
  def BFS(self, root):
    visited = [False] * (self.nodes+1)
    # print(len(visited))
    q = []
    q.append(root)
    visited[root] = True

    while len(q)!=0:
      root = q.pop(0)
      print(root, end=" ")

      for i in self.graph[root]:
        if visited[i] == False:
          q.append(i)
          visited[i] = True

  def dfs(self, visited, node):
    if node not in visited:
      print(node, end=" ")
      visited.add(node)
      for neighbor in self.graph[node]:
        self.dfs(visited, neighbor)

  def printGraph(self):
    print(self.graph)

g = Graph()
g.addEdge(1, 2)
g.addEdge(1, 3)

g.addEdge(2, 4)
g.addEdge(2, 5)

g.addEdge(3, 6)
g.addEdge(3, 7)

g.addEdge(4, 8)
g.addEdge(4, 9)

g.addEdge(5, 10)
g.addEdge(6, 11)
g.addEdge(6, 12)


g.BFS(1)

