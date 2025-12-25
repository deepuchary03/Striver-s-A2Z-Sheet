package Sorting;
import java.util.ArrayList;
// Input: nums = [7, 4, 1, 5, 3]

// Output: [1, 3, 4, 5, 7]

public class MergeSort {
    public static void merge(int nums[],int low,int mid,int high){
        ArrayList<Integer> ans=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]>=nums[right]){
                ans.add(nums[right]);
                right++;
            }else{
                ans.add(nums[left]);
                left++;
            }
        }
        while(left<=mid){
            ans.add(nums[left++]);
        }
        while(right<=high){
            ans.add(nums[right++]);
        }
        for(int i=low;i<=high;i++) nums[i]=ans.get(i-low);

    }

    public static void mergeSort(int[] nums,int low,int high){
        if(low>=high)return;
        int mid=(low+high)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public static void main(String[] args) {
        int nums[]={7, 4, 1, 5, 3};
        mergeSort(nums,0,nums.length-1);
        for(int i:nums) System.out.print(i+" ");
    }
}
