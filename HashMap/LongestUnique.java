import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class LongestUnique {

    static Object[] longestSubarray(int[] arr){
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arl = new ArrayList<>();
        for(int ele: arr){
            System.out.print(ele);
            if(map.get(ele) == null){
                System.out.println("Null");
                arl.add(ele);
                map.put(ele,1);
            }else if(map.get(ele) != null){
                System.out.println("Not Null");
                System.out.println(arl);
                arrayList.add(arl);
                arl.clear();
            }
        }
        System.out.println(map);
        System.out.println(arrayList);
        int ansindex = 0;
        int prevLength = arrayList.get(0).size();
        for(int i = 1; i<arrayList.size() ; i++){
           if(arrayList.get(i).size() > prevLength){
               ansindex = i;
           }
        }

        return arrayList.get(ansindex).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1,32,3,4,3,2,3,2,45,6,7};
        Object[] ans = longestSubarray(arr);
        for(Object obj: ans){
            System.out.println(obj);
        }
    }
}
