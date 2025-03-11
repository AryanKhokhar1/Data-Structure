from BinaryTree import BinaryTree
class LowestCommonAncestor:

    def lowestcommonAncestor(self, root, path):
        if root is None:
            return False
        
        path.append(root.val)
        if root == self.ele1:
            self.paths.append(path[:])
        if root == self.ele2:
            self.paths.append(path[:])
        if len(self.paths) == 2:
            l = min(len(self.paths[0]), len(self.paths[1])) -1
            match = self.paths[0][0]
            for i in range(l):
                if self.paths[0][i] == self.paths[1][i]:
                    match = self.paths[0][i]
                else:
                    return match
            return match

        left = self.lowestcommonAncestor(root.left, path) 
        if left is not False:
            return left
            
        right = self.lowestcommonAncestor(root.right, path)
        if right is not False:
            return right
        
        path.pop()
        return False

t1 = BinaryTree(1)
t1.left = BinaryTree(2)
t1.right = BinaryTree(7)
t1.right.left = BinaryTree(3)
t1.left.right = BinaryTree(4)
t1.left.right.left = BinaryTree(5)
t1.left.right.right = BinaryTree(6)

obj = LowestCommonAncestor()
obj.paths = []
obj.ele1 = t1.left.right.left
obj.ele2 = t1.left.right.right
print(obj.lowestcommonAncestor(t1,[]))  # Output: [1, 2, 4, 6]
