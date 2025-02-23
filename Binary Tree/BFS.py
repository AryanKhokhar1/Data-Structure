class BFS:

    # Traversal a Tree level wise
    def bfsiterative(self,tree):
        queue = list()
        bfs_list = list()
        queue.append(tree)
        while len(queue) != 0:
            val = queue.pop(0)
            if val.left:
                queue.append(val.left)
            if val.right:
                queue.append(val.right)
            bfs_list.append(val.val)
        print(bfs_list)

    queue = list()
    bfs_list = list()
    def bfsrecursion(self, tree):        
        self.bfs_list.append(tree.val)
        if tree.left:
            self.queue.append(tree.left)
        if tree.right:
            self.queue.append(tree.right)
        
        if len(self.queue) > 0:
            return self.bfsrecursion(self.queue.pop(0))
        else:
            return self.bfs_list