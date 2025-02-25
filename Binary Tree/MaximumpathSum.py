from BinaryTree import BinaryTree
class MaxPathSum:
    def __init__(self):
        self.maximum = 0
    def maximumpathsum(self, root):
        if root is None:
            return 0
        
        leftSum = self.maximumpathsum(root.left)
        rightSum = self.maximumpathsum(root.right)

        self.maximum = max(self.maximum, leftSum+rightSum+root.val)
        return (root.val) + max(leftSum,rightSum)
    

t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
# t1.left.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = MaxPathSum()
print(obj.maximumpathsum (t1))
print(obj.maximum)