package Arrays.Easy;

public class FindMissingNumber {
    public static int missing(int[] nums){
        int ans=0;
        for(int i:nums) ans=ans^i;
        for(int i=1;i<=nums.length;i++) ans=ans^i;
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={0, 2, 3, 1, 4};
        int ans=missing(nums);
        System.out.println(ans);
    }
}
