public class subsequence {
    static void subsequencewithascii(String pstr, String unpstr){
        if(unpstr.isEmpty()){
            System.out.println(pstr);
            return;
        }

        subsequencewithascii(pstr+unpstr.charAt(0), unpstr.substring(1));
        subsequencewithascii(pstr, unpstr.substring(1));
        subsequencewithascii(pstr+(unpstr.charAt(0)+0), unpstr.substring(1));
        return;
    }
    public static void main(String[] args) {
        subsequencewithascii("","abc");
    }
}
