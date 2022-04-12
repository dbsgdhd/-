package sort;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        if (arr==null||arr.length<2){
            return;
        }
        for (int i=0;i<arr.length-1;i++){
            int min = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[j]^arr[i];
    }
}
