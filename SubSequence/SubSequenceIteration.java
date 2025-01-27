import java.util.ArrayList;
import java.util.Objects;

public class SubSequenceIteration {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2};
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        arrayList.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int n = 0; n< arr.length; n++){
            start = 0;
            if(n>0 && arr[n] == arr[n-1]){
                start = end ;
            }
            end = arrayList.size();
            for(int i = start; i< end; i++){
                ArrayList<String> temp = new ArrayList<>(arrayList.get(i));
                temp.add(String.valueOf(arr[n]));
                arrayList.add(temp);
            }
            System.out.println(arrayList.toString());
        }

        System.out.println(arrayList.toString());
    }
}
