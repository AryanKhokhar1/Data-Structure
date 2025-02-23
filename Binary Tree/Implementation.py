from DFSTraversal import Traversal
from BFS import BFS
class BTree:

    # If I declare left and right as class variable. they will be shared amoung all the instances
    # left = None
    # right = None
    def __init__(self,val):
        self.val = val
        self.left = None
        self.right = None
    

t = BTree(4)
t.left = BTree(2)
t.right = BTree(5)
t.left.right = BTree(8)
obj = Traversal()
print("InOrder of Tree:", end=" ")
obj.inorder(t)
print()
print("PreOrder of Tree:", end=" ")
obj.preorder(t)
print()
print("PostOrder of Tree:", end=" ")
obj.postorder(t)
print()

obj2 = BFS()
obj2.bfsiterative(t)
print(obj2.bfsrecursion(t))