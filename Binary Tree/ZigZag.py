from BinaryTree import BinaryTree
class ZigZag:

    def __init__(self):
        self.queue = []
        self.mainlis = []

    def zigzagiterative(self, root):
        queue = [root]
        mainlis = []
        lefttoright = False

        while queue:
            
            l = len(queue)
            lis = []
            for i in range((l)):
                val = queue.pop(0)
                lis.append(val.val)

                if val.left:
                    queue.append(val.left)
                if val.right:
                    queue.append(val.right)

            if lefttoright:
                mainlis = mainlis + lis
            else:
                mainlis = mainlis + list(reversed(lis))
            
            lefttoright != lefttoright
        return mainlis
        
t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
# t1.left.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = ZigZag()
print(obj.zigzagiterative(t1))