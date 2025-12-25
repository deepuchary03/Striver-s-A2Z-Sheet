package Sorting;
// Input: nums = [7, 4, 1, 5, 3]

// Output: [1, 3, 4, 5, 7]
public class InsertionSort {
    public static void main(String[] args) {
        int nums[]={7, 4, 1, 5, 3};
        for(int i=1;i<nums.length;i++){
            int j=i-1;
            int key=nums[i];
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;

        }
        for(int i:nums) System.out.print(i+" ");
    }
}
