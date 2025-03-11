from BinaryTree import BinaryTree
class VerticalTraversal:

    def __init__(self):
        self.lis = []
    def verticaltraversalrecur(self, root, lr, v):
        if root is None:
            return
        
        self.lis.append([lr,v,root.val])
        self.verticaltraversalrecur(root.left,lr -1, v+1 )
        self.verticaltraversalrecur(root.right, lr+1, v+1)
        

t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
t1.right.left = BinaryTree(3)
# t1.left.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = VerticalTraversal()
print(obj.verticaltraversalrecur(t1,0,0))
print(sorted(obj.lis))