public class check {
    int findFibonnaci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return findFibonnaci(n-1) + findFibonnaci(n-2);
    }
    public static void main(String[] args) {
        check obj = new check();
        System.out.println(obj.findFibonnaci(5));
    }
}
