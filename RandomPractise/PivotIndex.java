package RandomPractise;
// Input: nums = [1,7,3,6,5,6]
// Output: 3
public class PivotIndex {
    public static int findPiv(int[] nums){
        int total=0;
        for(int i:nums) total+=i;
        int left=0;
        for(int i=0;i<nums.length;i++){
            int right=total-left-nums[i];
            if(left==right) return i;
            left=left+nums[i];
        }
        return -1;
    }
    public static void main(String a[]){
        int[] nums={1,7,3,6,5,6};
        System.out.println(findPiv(nums));

    }
}
