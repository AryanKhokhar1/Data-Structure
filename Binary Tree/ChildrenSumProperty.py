from BinaryTree import BinaryTree
class ChildrenSumProperty:

    # turning a binary tree to ChildrenSumProperty Follower

    def turningtochild(self, root):
        if root is None:
            return
        child = 0
        if root.left:
            child += root.left.val
        if root.right:
            child += root.right.val
        
        if child > root.val:
            root.val = child
        elif child < root.val and (root.left or root.right):
            a = 0
            if root.left:
                root.left.val = root.val
                a +=1
            if root.right:
                root.right.val = root.val
                a+=1
            root.val = root.val *a
        self.turningtochild(root.left)
        self.turningtochild(root.right)
            


t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
t1.right.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = ChildrenSumProperty()
BinaryTree.PrintTree(t1)
print(obj.turningtochild(t1)) 
BinaryTree.PrintTree(t1)