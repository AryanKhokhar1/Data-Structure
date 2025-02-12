package Backtracking;

class NQueen {
    int maxRow;
    int maxColumn;
    NQueen(int r,int c) {
        this.maxRow = r;
        this.maxColumn = c;
    }
    
    void queen(boolean [][] board, int row ){
        if(row > this.maxRow){
            display(board);
            return;
        }

        for(int i = 0; i<=maxColumn; i++){
            if(canQueenplaced(board,row,i)){
                board[row][i] = true;
                queen(board, row+1);
                board[row][i] = false;
            }
        }
    }
    boolean canQueenplaced(boolean[][] board,int row, int column){
        int temp_row = row;
        int temp_column = column;

        // Going upward
        while(temp_row >= 0){
            if(board[temp_row][column]){
                return false;
            }
            temp_row--;
        }

        temp_row = row;
        // Going left diagonal
        while(temp_row >= 0 && temp_column >= 0){
            if(board[temp_row][temp_column]){
                return false;
            }
            temp_row--;
            temp_column--;
        }

        temp_row = row;
        temp_column = column;
        // Going right diagonal
        while(temp_row >= 0 && temp_column <= this.maxColumn){
            if(board[temp_row][temp_column]){
                return false;
            }
            temp_row--;
            temp_column++;
        }
        return true;

    }
    void display(boolean[][] board){
        System.out.println();
        for(boolean[] b: board){
            for(boolean ele: b){
                if(ele){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        NQueen obj = new NQueen(3,3);
        // 4x4 matrix
        boolean[][] board = {
            {false,false,false,false},
            {false,false,false,false},
            {false,false,false,false},
            {false,false,false,false}
        };
        obj.queen(board,0);
    }
}
