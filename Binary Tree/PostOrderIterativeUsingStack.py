from BinaryTree import BinaryTree
class PostOrder:

    def postorderiterativedoublestack(self, tree):
        stack1 = [tree]
        stack2 = []

        while stack1:
            val = stack1.pop()
            stack2.append(val.val)
            if val.left:
                stack1.append(val.left)
            
            if val.right:
                stack1.append(val.right)
            
        lis = []
        for ele in range(len(stack2)):
            lis.append(stack2.pop())
        return lis
    def postorderiterative(self, tree):
        stack = [tree]
        postorder = []
        while stack:
            val = stack.pop()
            postorder.append(val.val)

            if val.left:
                stack.append(val.left)
            if val.right:
                stack.append(val.right)
        return list(reversed(postorder))
t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
t1.left.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = PostOrder()
print(obj.postorderiterativedoublestack(t1))
print(obj.postorderiterative(t1))