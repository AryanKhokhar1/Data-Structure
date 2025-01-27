public class SkipApp {
    // skip but not apple
    static String skipapp(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") &&  !str.startsWith("apple")){
            return skipapp(str.substring(3));
        }else{
            return str.charAt(0) + skipapp(str.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(skipapp("kaoeAppleappro").toLowerCase());
    }
}
