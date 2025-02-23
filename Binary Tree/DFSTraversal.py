class Traversal:

    def inorder(self, tree):
        if(tree == None):
            return
        self.inorder(tree.left)
        print(tree.val, end=", ")
        self.inorder(tree.right)
    def preorder(self, tree):
        if tree == None:
            return
        print(tree.val, end=", ")
        self.preorder(tree.left)
        self.preorder(tree.right)
    def postorder(self, tree):
        if tree == None:
            return
        self.postorder(tree.left)
        self.postorder(tree.right)
        print(tree.val, end=", ")
        
