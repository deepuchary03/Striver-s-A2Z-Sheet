package Arrays.Easy;
// Input: nums = [10, 5, 2, 7, 1, 9],  k=15

// Output: 4
public class LongestSubarraySum {
    public static void main(String[] args) {
        int []nums={10, 5, 2, 7, 1, 9};
        int k=15;
        int ans=0,temp=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            temp=temp+nums[r];
            while(temp>k){
                temp=temp-nums[l];
                l++;
            }
            if(temp==k) ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
    
}
