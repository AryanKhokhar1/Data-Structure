from BinaryTree import BinaryTree
class RoottoLeafNode:

    def roottoleafpath(self, root, path):
        if root.left is None and root.right is None:
            print(path)
            return 
        

        if root.left:
            path.append(root.left.val)
            self.roottoleafpath(root.left, path)
            path.pop()
        if root.right:
            path.append(root.right.val)
            self.roottoleafpath(root.right, path)
            path.pop()

t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
t1.right.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)
obj = RoottoLeafNode()
obj.roottoleafpath(t1,[t1.val])