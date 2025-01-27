public class SelectionSort {

    static void myIteration(int[] arr){
        int c;
        for(int i = 0; i<arr.length; i++){
            Integer smallNumIndex = null;
            for(int j = i; j<arr.length; j++){
                if(smallNumIndex == null){
                    smallNumIndex = j;
                }else if(arr[smallNumIndex] > arr[j]){
                    smallNumIndex = j;
                }
            }
            c = arr[i];
            arr[i] = arr[smallNumIndex];
            arr[smallNumIndex] = c;
            

        }
    }

    static void myRecursion(int[] arr,int i,int j,Integer valIndex){
        if(i == arr.length){
            return;
        }
        if(j<arr.length){
            System.out.printf("%d , %d",i, j);
            System.out.println();
            if(valIndex == null){
                valIndex = j;
            }else if(arr[j] < arr[valIndex]){
                valIndex = j;
            }
            myRecursion(arr, i, j+1, valIndex);
        }else{
            int c = arr[i];
            arr[i] = arr[valIndex];
            arr[valIndex] = c;
            System.out.println("Changes in i ="+i+" valIndex ="+valIndex);
            for(int element:arr){
                System.out.print(element+", ");
            }
            System.out.println();
            myRecursion(arr, i+1, i+1, null);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 4, 8, 9};
        // myIteration(arr);
        myRecursion(arr,0,0,null);
        for(int element: arr){
            System.out.print(element+", ");
        }
        System.out.println();
    }
}
