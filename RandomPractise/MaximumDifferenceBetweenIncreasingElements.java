package RandomPractise;
// input: nums = [7,1,5,4]
// Output: 4

public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String args[]){
        int[] nums={7,1,5,4};
        int ans=-1;
        int left=nums[0];
        for(int i=0;i<nums.length;i++){
            if(left<nums[i]) ans=Math.max(ans,nums[i]-left);
            left=Math.min(left,nums[i]);
        }
        ans=ans;
        System.out.println(ans);
    }
}
