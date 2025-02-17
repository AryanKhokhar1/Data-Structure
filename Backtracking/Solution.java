package Backtracking;

import java.util.Arrays;

class Solution {
    boolean solveSudokuHelp(char[][] board, int row , int column){
        if(row == board.length){
            // System.out.println(Arrays.toString(board));
            return true;
        }
        if(board[row][column] - 0 == 46){
            for(int i = 1; i<10; i++){
                char a = (char) (i + '0');
                if(canNumPlace(board, row, column,a)){
                    board[row][column] = a;

                    if((column == board.length - 1 && solveSudokuHelp(board, row+1, 0)) ||
                   (column < board.length - 1 && solveSudokuHelp(board, row, column+1))) {
                    return true; // Stop further recursion
                    }

                    board[row][column] = '.';
                }
            }
        }else{
            if(column == board.length -1){
                return solveSudokuHelp(board,row+1,0);
            }else{
                return solveSudokuHelp(board,row,column+1);
            }
        }
        return false;
    }
    boolean canNumPlace(char[][] board, int row, int column, char number){
        // Check in Row 
        int tempRow = 0;
        while(tempRow < board.length){
            if(board[tempRow][column] == number){
                return false;
            }
            tempRow++;
        }
        // Check in Column
        int tempColumn = 0;
        while(tempColumn < board.length){
            if(board[row][tempColumn] == number){
                return false;
            }
            tempColumn++;
        }
        // Check in 3x3 box
        int i = row - (row%3);
        int j = column - (column%3);
        for(int r = i; r<i+3; r++){
            for(int c = j; c<j+3; c++){
                if(r == row && c == column){
                    continue;
                }else{
                    if(board[r][c] == number){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solveSudokuHelp(board,0,0);
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'},
    };
        obj.solveSudoku(board);
        for(char[] a: board){
            System.out.println(Arrays.toString(a));
        }
    }
}
