package sort;

public class radixSort {
    public static void radixSort(int[] arr){
        if (arr==null||arr.length<2){
            return;
        }
        int min = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i>min){
                min = i;
            }
        }
        int res = 0;
        while (min!=0){
            min=min/10;
            res+=1;
        }
        radixSort(arr,0,arr.length-1,res);
    }

    private static void radixSort(int[] arr, int l, int r, int res) {
        final int val = 10;
        int[] re = new int[r-l+1];
        for (int i=1;i<=res;i++){
            int[] a = new int[val];
            for (int j=l;j<=r;j++){
                int b = findnum(arr[j],i);
                a[b]=a[b]+1;
            }
            for (int j=1;j<a.length;j++){
                a[j]=a[j]+a[j-1];
            }
            for (int j=l;j<=r;j++){
                int b = findnum(arr[j],i);
                re[a[b]-1] = arr[i];
                a[b]=a[b]-1;
            }
            for (int j=0;j<re.length;j++){
                arr[l+j]=re[j];
            }

        }
    }

    private static int findnum(int i, int re) {
        int a = (int)(i/Math.pow(10, re-1))%10;
        return a;
    }
}
