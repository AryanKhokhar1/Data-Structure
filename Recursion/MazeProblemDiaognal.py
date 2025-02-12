class Maze:
    def maze(self,rows,columns,path):
        if(rows == 1 and columns == 1):
            print(path)
            return
        
        if(rows > 1 and columns > 1):
            self.maze(rows-1, columns-1, path+"T")
        if(rows > 1):
            self.maze(rows -1, columns,path+"D")
        if(columns>1):
            self.maze(rows,columns-1, path+"R")
        return

obj = Maze()
obj.maze(3,3,"")