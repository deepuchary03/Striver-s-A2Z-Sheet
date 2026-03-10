package RandomPractise;
// Input: nums = [1,2,3,1,1,3]
// Output: 4
import java.util.*;
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=0;
        for(int i:nums){
            if(hm.containsKey(i)){
                ans=ans+hm.get(i);
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        System.out.println(ans);
    }
}
