package Arrays.Easy;

public class SingleNumber1 {
    public static void main(String[] args) {
        int[] nums={1, 2, 2, 4, 3, 1, 4};
        int ans=0;
            for(int i:nums){
                ans=ans^i;
            }
          System.out.println(ans);
    }
}
