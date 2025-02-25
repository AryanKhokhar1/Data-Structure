from BinaryTree import BinaryTree
class DBTree:

    def diameterbinarytree(self, root,diameter):
        if root is None:
            return 0
        a = self.diameterbinarytree(root.left,diameter)
        b = self.diameterbinarytree(root.right,diameter)
        if a is not None and b is not None:
            diameter = max(diameter, a+b)

        return 1+max(a,b)

t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
# t1.left.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = DBTree()
print(obj.diameterbinarytree(t1,0))