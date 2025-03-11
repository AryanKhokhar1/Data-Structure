from BinaryTree import BinaryTree
class SymmetricBinaryTree:

    def symmetricbinarytree(self, r1, r2):
        if r1 is None or r2 is None:
            return r1 == r2
        return r1.val == r2.val and self.symmetricbinarytree(r1.left, r2.right) and self.symmetricbinarytree(r1.right, r2.left)

t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
t1.right.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = SymmetricBinaryTree()
print(obj.symmetricbinarytree(t1.left, t1.right))