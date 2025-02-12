package Backtracking;

class Backtracking {

    private int maxRow;
    private int maxColumn;

    Backtracking(int r, int c) {
        this.maxRow = r;
        this.maxColumn = c;
    }

    void mazeproblem(int rows, int columns, String path, boolean[][] checkMaze) {
        if (rows == 1 && columns == 1) {
            System.out.println(path);
            return;
        }

        if(!checkMaze[this.maxRow-rows][this.maxColumn-columns]){
            return;
        }
        checkMaze[this.maxRow-rows][this.maxColumn-columns] = false;
        // Path to Down
        if (rows > 1) {
            mazeproblem(rows - 1, columns, path + "D",checkMaze);
        }
        // Path to Right
        if (columns > 1) {
            mazeproblem(rows, columns - 1, path + "R",checkMaze);
        }
        // Path to Up
        if (rows < this.maxRow ) {
            mazeproblem(rows + 1, columns, path + "U",checkMaze);
        }
        // Path to Left
        if (columns < this.maxColumn) {
            mazeproblem(rows, columns + 1, path + "L",checkMaze);
        }
        
        checkMaze[this.maxRow-rows][this.maxColumn-columns] = true;

    }

    public static void main(String[] args) {
        Backtracking obj = new Backtracking(3, 3);
        boolean[][] checkMaze = {
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };
        obj.mazeproblem(3, 3, "",checkMaze);
    }
}
