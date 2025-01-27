
import java.util.Arrays;

class MergeInSort{

    static void mergeSort(int[] arr, int start, int end){
        if(end-start <= 1){
            return ;
        }

        int mid = (start+end)/2;

        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        System.out.println(start+" "+mid+" "+end);
        merge(arr,start,mid,end);
    }

    static void merge(int[] arr, int start, int mid, int end){
        int[] newArr = new int[end-start];
        int x = 0;
        int i = start;
        int j = mid;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                newArr[x++] = arr[i++];
            }else{
                newArr[x++] = arr[j++];
            }
        }

        while(i < mid){
            newArr[x++] = arr[i++];
        }
        while(j<end){
            newArr[x++]  = arr[j++];
        }

        x = 0;
        for(;start<end;start++){
            arr[start] = newArr[x++];
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        // arr = mergeSort(arr);
        mergeSort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));


    }}
