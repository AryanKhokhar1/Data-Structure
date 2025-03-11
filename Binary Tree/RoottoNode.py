from BinaryTree import BinaryTree
class RoottoNode:

    def roottonode(self, root, path, target):
        if not root:
            return False
        
        path.append(root.val)
        
        if root.val == target:
            return path

        if self.roottonode(root.left, path, target) or self.roottonode(root.right, path, target):
            return path
        
        path.pop()
        return False


t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
t1.right.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)
obj = RoottoNode()
print(obj.roottonode(t1,[],8))