package Arrays.Hard;
// Input: nums = [4, 5, 3, 7, 1, 2]

// Output: 840
public class MaximumProductSubarray {
     public static int maxProduct(int[] nums) {
        int p=1;
        int s=1;
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            p=(p==0?1:p)*nums[i];
            s=(s==0?1:s)*nums[n-i-1];
            int temp=Math.max(p,s);
            ans=Math.max(ans,temp);

        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={4, 5, 3, 7, 1, 2};
        System.out.println(maxProduct(nums));
    }
}
