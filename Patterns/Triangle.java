public class Triangle {

    static void trianlge2(int row , int column){
        if(row == 0){
            return;
        }

        if(row> column){
            trianlge2(row, column+1);
            System.out.print("* ");
        }else{
            trianlge2(row-1, 0);
            System.out.println();
        }
    }

    static void trianlge(int row , int column){
        if(row == 0){
            return;
        }

        if(row> column){
            System.out.print("* ");
            trianlge(row, column+1);
        }else{
            System.out.println();
            trianlge(row-1, 0);
        }
    }
    public static void main(String[] args) {
        trianlge2(5, 0);
    }
}
