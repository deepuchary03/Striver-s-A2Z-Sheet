package Recursion;
// [10,20,30,40,50,60]
// [60,50,40,30,20,10]
public class ReverseArray {
    public static void reverse(int arr[],int left,int right){
        if(left>=right) return;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
        reverse(arr,left,right);
    }
    public static void main(String a[]){
        int[] arr={10,20,30,40,50,60};
       
        
        reverse(arr,0,arr.length-1);
        for(int i:arr) System.out.print(i+" ");
    }
}
