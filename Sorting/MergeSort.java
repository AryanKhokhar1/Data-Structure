
import java.util.Arrays;

class MergeSort{

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first , int[] second){

        int[] mix = new int[first.length+ second.length];
        int i = 0;
        int j = 0;
        int x = 0;
        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[x++] = first[i++];
            }else{
                mix[x++] = second[j++];
            }
        }

        while(i<first.length){
            mix[x++] = first[i++];
        }

        while(j<second.length){
            mix[x++] = second[j++];
        }

        return mix;
    }  

   public static void main(String[] args) {
        int[] arr = {5,4,6,3};
        System.out.println(Arrays.toString(arr));
        // arr = mergeSort(arr);
        System.out.println(Arrays.toString(mergeSort(arr)));
    }}
