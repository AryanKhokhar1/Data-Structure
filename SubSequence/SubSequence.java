public class SubSequence {

    void sequence(String Processed_String, String UnProcessed_String){
        if(UnProcessed_String.isEmpty()){
            System.out.println(Processed_String);
            return;
        }
        this.sequence( Processed_String + UnProcessed_String.charAt(0), UnProcessed_String.substring(1));
        this.sequence(Processed_String , UnProcessed_String.substring(1));

    }
    public static void main(String[] args) {
        SubSequence obj = new SubSequence();
        obj.sequence("", "123");
        
    }
}
