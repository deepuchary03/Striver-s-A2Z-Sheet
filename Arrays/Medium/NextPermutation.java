package Arrays.Medium;
// Example 1
// Input: nums = [1,2,3]
// Output: [1,3,2]

public class NextPermutation {
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }

    }    public static void main(String args[]){
        int nums[]={1,2,3};
        int idx=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]) {
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>idx;i--){
            if(nums[idx]<nums[i]){
                swap(nums,idx,i);
                break;
            }
        }
        reverse(nums,idx+1,nums.length-1);
        for(int i:nums) System.out.print(i+" ");
    }
}
