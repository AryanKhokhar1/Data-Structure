import java.util.Scanner;

public class LinearSearchRecursion {
    
    private int search(int[] arr, int target, int index){
        if(index>= arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return search(arr, target, ++index);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9};
        Scanner scan = new Scanner(System.in);
        System.out.print("Value of X: ");
        int target = scan.nextInt();
        LinearSearchRecursion obj = new LinearSearchRecursion();
        int ans = obj.search(arr,target,0);
        System.out.println("The postion of "+target+" in the array: "+ans);
    }
}
