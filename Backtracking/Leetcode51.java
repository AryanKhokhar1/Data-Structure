package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Leetcode51 {
    int maxRow;
    List<List<String>> queen(boolean[][] board, int row, List<String> path){
        if(row == this.maxRow){
            List<List<String>> lis = new ArrayList<>();
            lis.add(new ArrayList<>(path));
            return lis;
        }

        List<List<String>> p = new ArrayList<>();

        for(int i = 0; i<this.maxRow; i++){
            if(checkqueen(board, row, i)){
                board[row][i] = true;
                path.add(strpath(i, this.maxRow));

                p.addAll(queen(board, row+1,path));

                board[row][i] = false;
                path.remove(path.size()-1);
            }
        }
        return p;
    }
    String strpath(int i, int len){
        return ".".repeat(i)+"Q"+".".repeat(len-i-1);
    }
    boolean checkqueen(boolean[][] board, int row, int column){
        int tempRow = row;
        // To Upward
        while(tempRow >= 0){
            if(board[tempRow][column]){
                return false;
            }
            tempRow--;
        }

        // Going to Left Diagonal
        tempRow = row;
        int tempColumn = column;
        while(tempRow >= 0 && tempColumn >= 0){
            if(board[tempRow][tempColumn]){
                return false;
            }
            tempRow--;
            tempColumn--;
        }

        // Going to Right Diagonal
        tempRow = row;
        tempColumn = column;
        while(tempRow >= 0 && tempColumn < this.maxRow){
            if(board[tempRow][tempColumn]){
                return false;
            }
            tempRow--;
            tempColumn++;
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        this.maxRow = n;
        List<String> lis = new ArrayList<>();
        return queen(board,0,lis);
    }
    public static void main(String[] args) {
        Leetcode51 obj = new Leetcode51();
        List<List<String>> ans = obj.solveNQueens(1);
        System.out.println(ans);
    }
}