public class LinearSearch {

    static int search(int[] arr, int x, int index){
        if(index >= arr.length){
            return -1;
        }
        if(arr[index] == x){
            return index;
        }
        return search(arr,x,++index);
    }
    public static void main(String[] args) {
        int[] arr = {1, 23, 5, 8, 63, 95};
        System.out.println("Position of "+8+" in the array: "+(search(arr,8,0)+1));
    }
}
