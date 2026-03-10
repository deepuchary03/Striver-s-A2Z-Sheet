package RandomPractise;
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
import java.util.*;
public class MajorityElement {
    public static int majority(int[] nums){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums) hm.put(i,hm.getOrDefault(i,0)+1);
        for(int i:hm.keySet()) if(hm.get(i)>nums.length/2) return i;
        return -1;
    }
    public static void  main(String args[]){
        int nums[]={2,2,1,1,1,2,2,};
        System.out.println("majority ele: "+majority(nums));
    }
}
