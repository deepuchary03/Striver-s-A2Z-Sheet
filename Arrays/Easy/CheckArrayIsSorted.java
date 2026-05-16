package Arrays.Easy;

public class CheckArrayIsSorted {
    public static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++) if(arr[i-1]>arr[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        boolean ans=isSorted(arr);
        
        System.out.println(ans);
    }
}
