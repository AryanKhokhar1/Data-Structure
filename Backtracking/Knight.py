class Chess:
    def __init__(self, d):
        self.maxDim = d

    def knight(self, board, row):
        if(row == self.maxDim):
            print(board)
            return
        
        for i in range(self.maxDim*self.maxDim):
            if self.canKnightPlaced(board, i// self.maxDim, i%self.maxDim):
                board[i//self.maxDim][i%self.maxDim] = True
        
        print(board)



    def canKnightPlaced(self,board, row, column):
        # Upside
        List = [[row-2, column +1],[row-2, column-1],[row+2,column-1],[row+2, column+1],[row+1,column+2],[row-1, column+2],[row+1, column-2],[row-1, column-2]]
        for innerList in List:
            if(innerList[0] < self.maxDim and innerList[1] < self.maxDim):
                if board[innerList[0]][innerList[1]] :
                    return False
        return True


obj = Chess(4)
board = [
    [False, False, False, False],
    [False, False, False, False],
    [False, False, False, False],
    [False, False, False, False],
]
obj.knight(board,0)