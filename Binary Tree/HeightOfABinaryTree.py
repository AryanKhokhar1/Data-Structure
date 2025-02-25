from BinaryTree import BinaryTree
class Height:
    
    def heightofbinarytree(self, tree):
        if tree is None:
            return 0
        print(tree.val)
        a = self.heightofbinarytree(tree.left)
        b = self.heightofbinarytree(tree.right)

        return 1+ max(a,b)

t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
t1.left.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = Height()
print(obj.heightofbinarytree(t1))