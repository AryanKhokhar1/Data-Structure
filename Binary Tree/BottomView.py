from BinaryTree import BinaryTree
class BottomView:

    def __init__(self):
        self.queue = []
        self.d = dict()

    def bottomviewrec(self, root, lr):
        self.d[lr] = root.val
        if root.left:
            self.queue.append([root.left,lr-1])
        if root.right:
            self.queue.append([root.right,lr+1])
        if len(self.queue) == 0:
            return 
        else:
            ele = self.queue.pop(0)
            return self.bottomviewrec(ele[0],ele[1])
    def bottomview(self, root, lr ):
        queue = [[lr, root]]
        d = dict()

        while queue:
            ele = queue.pop(0)
            d[ele[0]] = ele[1].val

            if ele[1].left:
                queue.append([ele[0]-1,ele[1].left])
            if ele[1].right:
                queue.append([ele[0]+1, ele[1].right])
        return [ d[k] for k in sorted(d.keys())]

t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
t1.right.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = BottomView()
print(obj.bottomview(t1,0))
obj.bottomviewrec(t1,0)
print([obj.d[k] for k in sorted(obj.d.keys())])