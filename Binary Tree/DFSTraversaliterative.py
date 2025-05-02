from BinaryTree import BinaryTree
class DFSTraversalIterative:
    # Solving traversal problem in iterative way
    def preorder(self, tree):
        stack = [tree] # stack
        preorder = [] # list
        while stack:
            pt = stack.pop(-1)
            preorder.append(pt.val)

            if pt.right:
                stack.append(pt.right)
            if pt.left:
                stack.append(pt.left)
        return preorder


    def inorder(self, tree):
        stack = []
        current = tree
        inorder = []
        while stack or current:
            while current:
                stack.append(current)
                current = current.left
            
            current = stack.pop()
            inorder.append(current.val)
            current = current.right
        return inorder
    def postorder(self, tree):
        postorder = []
        stack = [tree]
        while stack:
            pt = stack.pop()
            postorder.append(pt.val)

            if pt.left:
                stack.append(pt.left)
            if pt.right:
                stack.append(pt.right)
        return list(reversed(postorder))

t = BinaryTree(1)
t.left = BinaryTree(2)
t.right = BinaryTree(3)
t.left.left = BinaryTree(4)
t.left.right = BinaryTree(6)
t.right.left = BinaryTree(5)
t.right.right = BinaryTree(7)
t.left.left.left = BinaryTree(8)
obj = DFSTraversalIterative()
print(obj.postorder(t))