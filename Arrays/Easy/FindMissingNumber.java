package Arrays.Easy;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums={0, 2, 3, 1, 4};
        int ans=0;
        for(int i:nums) ans=ans^i;
        for(int i=0;i<=nums.length;i++) ans=ans^i;
        System.out.println(ans);
    }
}
