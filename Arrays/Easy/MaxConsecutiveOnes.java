package Arrays.Easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1, 1, 0, 0, 1, 1, 1, 0};
        int ans=0;
        int temp=0;
        for(int i:nums){
            if(i==1) temp++;
            else temp=0;
            ans=Math.max(ans,temp);
        }
        System.out.println(ans);
    }
}
