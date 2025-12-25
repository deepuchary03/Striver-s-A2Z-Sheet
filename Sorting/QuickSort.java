package Sorting;

public class QuickSort {
    public  static void quickSort(int[] nums,int low,int high)
    {
        if(low<high){
            int p=partition(nums,low,high);
            quickSort(nums,low,p-1);
            quickSort(nums,p+1,high);
        }
    }
    public static int partition(int nums[],int low,int high){
        int pivot=nums[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(nums[j]<=pivot){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp=nums[i+1];
        nums[i+1]=nums[high];
        nums[high]=temp;
        return i+1;

    } 
    public static void main(String[] args) {
        int nums[]={10, 7, 8, 9, 1, 5};
        quickSort(nums,0,nums.length-1);
        for(int i:nums) System.out.print(i+" ");
    }
    
}
