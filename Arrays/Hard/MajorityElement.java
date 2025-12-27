package Arrays.Hard;

import java.util.ArrayList;
import java.util.HashMap;

// Input: nums = [1, 2, 1, 1, 3, 2, 2]
// Output: [1, 2]
public class MajorityElement {
    public static ArrayList<Integer> majorityElement(int[] nums){
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums) hm.put(i,hm.getOrDefault(i,0)+1);
        for(int i:hm.keySet()) if(hm.get(i)>nums.length/3) ans.add(i);
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={1, 2, 1, 1, 3, 2, 2};
        ArrayList<Integer> res=new ArrayList<>();
        res=majorityElement(nums);
        System.out.println(res);
        
        
    }

}
