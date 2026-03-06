package Sorting;
// Example 1
// Input: nums = [7, 4, 1, 5, 3]
// Output: [1, 3, 4, 5, 7]
// Explanation: 1 <= 3 <= 4 <= 5 <= 7.
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++)
            { for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
    }
    public static void main(String[] args) {
        int nums[]={7, 4, 1, 5, 3};
        bubbleSort(nums);
        for(int i:nums) System.out.print(i+" ");
    }
}
