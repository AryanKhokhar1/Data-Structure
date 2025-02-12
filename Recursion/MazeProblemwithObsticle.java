public class MazeProblemwithObsticle {
    static void MazewithObsiticle(int rows, int columns, String path, int[][] arr){
        if(rows == 1 && columns == 1){
            System.out.println(path);
            return;
        }
        boolean canGoRow = true;
        boolean canGoColumn = true;
        boolean canGoDiagonal = true;
        for(int[] ar : arr){
            if(rows-1 == ar[0] && columns == ar[1]){
                canGoDiagonal = false;
            }
            if(rows-1 == ar[0] && columns == ar[1]){
                canGoRow = false;
            }
            if(rows == ar[0] && columns-1 == ar[1]){
                canGoColumn = false;
            }
        }
        if(rows>1 && columns >1 && canGoDiagonal){
            MazewithObsiticle(rows-1, columns-1, path+"\\", arr);
        }
        if(rows>1 && canGoRow){
            MazewithObsiticle(rows-1, columns, path+"D", arr);
        }
        if(columns>1 && canGoColumn){
            MazewithObsiticle(rows, columns-1, path+"R", arr);
        }
        // return;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3},{3,2},{2,3},{3,1}};
        MazewithObsiticle(4, 4, "", arr);
    }
}
