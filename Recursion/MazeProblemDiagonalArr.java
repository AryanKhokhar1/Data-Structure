import java.util.ArrayList;

class MazeProblemDiagonalArr {
    static ArrayList<String> path(int rows,int columns, String path){
        if(rows == 1 && columns ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(rows > 1 && columns > 1){
            list.addAll(path(rows-1,columns-1,path+"T"));
        }
        if(rows > 1){
            list.addAll(path(rows-1,columns,path+"D"));
        }
        if(columns > 1){
            list.addAll(path(rows,columns-1,path+"R"));
        }
        return list;

    }
    public static void main(String[] args) {
        ArrayList<String> answer = path(3,3,"");
        System.out.println(answer);
    }
}
