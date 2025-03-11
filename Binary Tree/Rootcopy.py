class RoottoNode:
    def roottonode(self, root, path, target):
        if root.val == target:
            return list(path)
        
        if root.left:
            path.append(root.left.val)
            left_result = self.roottonode(root.left, path, target)
            if left_result is not None:
                return left_result
            path.pop()
        
        if root.right:
            path.append(root.right.val)
            right_result = self.roottonode(root.right, path, target)
            if right_result is not None:
                return right_result
            path.pop()
        
        return None

# Assuming BinaryTree is defined as:
class BinaryTree:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

# Example usage
t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
t1.right.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = RoottoNode()
print(obj.roottonode(t1, [t1.val], 6))  # Output: [1, 2, 4, 6]