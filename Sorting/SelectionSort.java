package Sorting;
// Input: nums = [7, 4, 1, 5, 3]

// Output: [1, 3, 4, 5, 7]
// Explanation: 1 <= 3 <= 4 <= 5 <= 7.
public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIdx=i;
            for(int j=i;j<arr.length;j++)
                {
                    if(arr[j]<arr[minIdx]){
                        minIdx=j;
                    }
                }
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
    }
    public static void main(String args[]){
        int nums[]={7, 4, 1, 5, 3};
        selectionSort(nums);
        for(int i:nums) System.out.print(i+" ");
    }
}
