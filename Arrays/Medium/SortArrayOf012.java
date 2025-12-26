package Arrays.Medium;
// Input: nums = [1, 0, 2, 1, 0]
// Output: [0, 0, 1, 1, 2]
public class SortArrayOf012 {
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String args[]){
        int[] nums={1, 0, 2, 1, 0};
        int low=0,high=nums.length-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else {
                swap(nums,high,mid);
                high--;
                
            }
        }
        for(int i:nums) System.out.print(i+" ");
    }
}
