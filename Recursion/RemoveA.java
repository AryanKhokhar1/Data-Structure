public class RemoveA {
    static String removea(StringBuilder str , int i ){
        if(i >= str.length()){
            return "";
        }
        if(str.charAt(i) == 'a'){
            return removea(str,i+1);
        } else{
            return String.valueOf(str.charAt(i)) + removea(str,i+1);
        }
    }
    public static void main(String[] args) {
        System.out.println(removea(new StringBuilder("baccad"),0));

    }
}
