from BinaryTree import BinaryTree
class InOrder:
    def inorderiterative(self, tree):
        stack = []
        inorder = list()
        current = tree
        while stack or current:
            while current:
                stack.append(current)
                current = current.left
            
            current = stack.pop()
            inorder.append(current.val)
            
            current = current.right
        return inorder

t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
t1.left.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = InOrder()
print(obj.inorderiterative(t1))