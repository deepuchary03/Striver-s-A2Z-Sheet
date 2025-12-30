package Arrays.Hard;

// Input : nums = [4, 2, 2, 6, 4], k = 6
// Output : 4

import java.util.*;

public class CountnumberofsubarrayswithgivenxorK {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] nums={4, 2, 2, 6, 4};
        int k=6;
        int sum=0;
        int ans=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum=sum^nums[i];
            int target=sum^k;
            if(hm.containsKey(target)) ans=ans+hm.get(target);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        System.out.println(ans);
    }
}
