package Arrays.Easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
       int idx=1;
       int arr[]={0, 0, 3, 3, 5, 6}; 
       for(int i=1;i<arr.length;i++){
        if(arr[i-1]!=arr[i]){
            arr[idx++]=arr[i];
        }
       }
       System.out.println(idx);
    }
    
}
