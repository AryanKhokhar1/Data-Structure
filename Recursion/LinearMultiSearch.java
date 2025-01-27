import java.util.ArrayList;
import java.util.Scanner;

public class LinearMultiSearch {

    // Not Efficient practice
    private ArrayList<Integer> search(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index>= arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList arrayList =  search(arr, target, ++index);
        list.addAll(arrayList);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 4, 9};
        Scanner scan = new Scanner(System.in);
        System.out.print("Value of X: ");
        int target = scan.nextInt();
        LinearMultiSearch obj = new LinearMultiSearch();
        ArrayList ans = obj.search(arr,target,0);
        System.out.println("The postion of "+target+" in the array: "+ans);
    }
}
