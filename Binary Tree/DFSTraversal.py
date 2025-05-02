from BinaryTree import BinaryTree
class AllTraversal:
    def preorder(self, tree):
        if tree is None:
            return 
        print(tree.val)
        self.preorder(tree.left)
        self.preorder(tree.right)
    
    def inorder(self, tree):
        if tree is None:
            return 
        self.inorder(tree.left)
        print(tree.val)
        self.inorder(tree.right)

    def postorder(self, tree):
        if tree is None:
            return 
        self.postorder(tree.left)
        self.postorder(tree.right)
        print(tree.val)

t = BinaryTree(1)
t.left = BinaryTree(2)
t.right = BinaryTree(3)
t.left.left = BinaryTree(4)
t.left.right = BinaryTree(6)
t.right.left = BinaryTree(5)
t.right.right = BinaryTree(7)
obj = AllTraversal()
obj.postorder(t)
