import java.util.ArrayList;

public class LinearSearchMultiOccurence {

    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> search(int[] arr, int x, int index){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == x){
            list.add(index);
        }
        return search(arr,x,++index);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,8};
        ArrayList<Integer> arrayList = search(arr,4, 0);
        System.out.println(arrayList);
    }
}
