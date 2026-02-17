package Arrays.Medium;

// Input: nums = [-2, -3, -7, -2, -10, -4]

// Output: -2

public class KadanesAlgorithm {
    public static int kadanesAlgorithm(int[] nums){
        int ans=Integer.MIN_VALUE;
        int temp=0;
        for(int i:nums){
            temp=temp+i;
            ans=Math.max(ans,temp);
            if(temp<0) temp=0;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={-2, -3, -7, -2, -10, -4};

            System.out.println(kadanesAlgorithm(nums));
    }
}
