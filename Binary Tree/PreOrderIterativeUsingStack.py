from BinaryTree import BinaryTree
class PreOrder:

    def preorder_iterative(self,tree):
        stack = [tree]
        preorder = list()

        while stack:
            val = stack.pop()
            preorder.append(val.val)
            if val.right:
                stack.append(val.right)
            if val.left:
                stack.append(val.left)
        return preorder

t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
t1.left.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = PreOrder()
print(obj.preorder_iterative(t1))