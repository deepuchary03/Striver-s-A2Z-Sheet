package Arrays.Medium;
// Input: nums = [1, 1, 1], k = 2

// Output: 2
import java.util.HashMap;

public class CountSubarraysWithGivenSum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int[] nums={1,1,1};
        int k=2;
        int ans=0,sum=0;
        for(int i:nums){
            sum=sum+i;
            int temp=sum-k;
            if(hm.containsKey(temp)){
                ans=ans+hm.get(temp);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);

        }
        System.out.println(ans);
    }
}
