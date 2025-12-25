package Sorting;
// Input: nums = [7, 4, 1, 5, 3]

// Output: [1, 3, 4, 5, 7]

// Explanation: 1 <= 3 <= 4 <= 5 <= 7.


public class SelectionSort {
    public static void main(String args[]){
        int nums[]={7, 4, 1, 5, 3};
        for(int i=0;i<nums.length-1;i++){
            int minIdx=i;
            for(int j=i;j<nums.length;j++){
                if(nums[j]<nums[minIdx]){
                    minIdx=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[minIdx];
            nums[minIdx]=temp;
        }
        for(int i:nums) System.out.print(i+" ");
    }
}
