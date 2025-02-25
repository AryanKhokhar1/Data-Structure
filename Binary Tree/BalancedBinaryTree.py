from BinaryTree import BinaryTree
class BalanceBinaryTree:

    def check(self, tree):

        if tree is None:
            return 0
        
        a = self.check(tree.left)
        b = self.check(tree.right)

        # Below return function 
        if a == -1 or b == -1: return -1
        if abs(a-b) > 1: return -1

        return 1+max(a,b)

t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
# t1.left.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = BalanceBinaryTree()
print(obj.check(t1))