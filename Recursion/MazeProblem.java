class MazeProblem {
    static int maze(int rows , int columns){
        if(rows == 1 || columns == 1){
            return 1;
        }
        int left = maze(rows-1, columns);
        int right = maze(rows, columns-1);
        return left+ right;
    }
    public static void main(String[] args) {
        System.out.println(maze(3, 3   ));
    }
}
