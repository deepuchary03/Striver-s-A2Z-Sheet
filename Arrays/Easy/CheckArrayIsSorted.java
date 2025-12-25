package Arrays.Easy;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        boolean ans=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                ans=false;
                break;
            }
        }
        System.out.println(ans);
    }
}
