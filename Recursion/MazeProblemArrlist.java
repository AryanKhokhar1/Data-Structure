import java.util.ArrayList;

class MazeProblemArrlist {
    static ArrayList<String> maze(int rows, int columns, String path){
        if(rows == 1 || columns == 1){
            ArrayList<String> list = new ArrayList<>();
            while(rows != 1){
                path += "D";
                rows--;
            }
            while(columns != 1){
                path += "R";
                columns--;
            }
            list.add(path);
            return list;
        }

        ArrayList<String> down = maze(rows-1, columns, path+"D");
        ArrayList<String> right = maze(rows, columns-1, path + "R");
        down.addAll(right);
        // System.out.println(down);
        return down;

    }
    public static void main(String[] args) {
        ArrayList<String> answer = maze(3, 3, "");
        System.out.println(answer);
    }
}
