import java.util.Arrays;

class QuickSort{
    static void quickSort(int[] arr,int start, int end){
        if(start >= end){
            return ;
        }
        int low = start;
        int high = end;
        int pivot = arr[low + (high-low)/2];
        while(low<=high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        quickSort(arr,start,high);
        quickSort(arr,low,end);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,6,7,8,9};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}