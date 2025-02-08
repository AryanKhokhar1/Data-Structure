class Phone_Letter_Combination_void {
    static void pad(String pstr, String unpstr){
        if(unpstr.isEmpty()){
            System.out.println(pstr);
            return;
        }
        int digit = unpstr.charAt(0) - '0';
        for(int i = (digit-1)*3; i<digit*3; i++){
            
            pad(pstr+(char)('a' + i), unpstr.substring(1));
        }
    }
    public static void main(String[] args) {
        pad("", "12");
    }
}
