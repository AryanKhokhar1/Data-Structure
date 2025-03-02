from BinaryTree import BinaryTree
class BoundaryTraversal:

    def __init__(self):
        self.lis = []
        self.rightlis = []
    def leftboundarytraversal(self, root):
        if root.left is None and root.right is None:
            return
        
        self.lis.append(root.val)
        if root.left:
            return self.leftboundarytraversal(root.left)
        if root.right:
            return self.leftboundarytraversal(root.right)

    def rightboundarytraversal(self, root):
        if root.right is None and root.left is None:
            return

        self.rightlis.append(root.val)
        if root.right:
            return self.rightboundarytraversal(root.right)
        if root.left:
            return self.rightboundarytraversal(root.left)

    def leafboundarytraversal(self, root):
        if root is None:
            return 

        if root.left is None and root.right is None:
            self.lis.append(root.val)
        self.leafboundarytraversal(root.left)
        self.leafboundarytraversal(root.right)

t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
t1.right.left = BinaryTree(3)
# t1.left.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = BoundaryTraversal()
obj.leftboundarytraversal(t1)
print(obj.lis)
obj.leafboundarytraversal(t1)
print(obj.lis)
obj.rightboundarytraversal(t1)
obj.rightlis.pop(0)
print(obj.lis + list(reversed(obj.rightlis)))
# print(obj.boundarytraversal(t1))