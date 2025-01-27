public class BinarySearch {

    public static int search(int[] arr,int target, int start,int end){
        if(start > end){
            return -1;
        }
        int mid = (start + end)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] < target){
            return search(arr,target,mid+1,end);
        }else{
            return search(arr,target,start,mid-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 70;
        int val = search(arr,target,0,arr.length-1);
        System.out.println(val);
//        int start = 0;
//        int end = arr.length -1;
//
//        if(start>target){
//            System.out.println("Not Present in the Array");
//        }
//        while(start != end){
//            int mid = (start+end)/2;
//            if(arr[mid] == target) {
//                System.out.println(target + " present in the array at index: " + mid);
//                break;
//            }else if(arr[mid] < target){
//                start = mid+1;
//            }else{
//                end = mid-1;
//            }
//        }
    }
}
