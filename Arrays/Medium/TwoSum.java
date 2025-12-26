package Arrays.Medium;
import java.util.HashMap;
// Input: nums = [1, 6, 2, 10, 3], target = 7
// Output: [0, 1]
public class TwoSum {
    public static void main(String args[]){
        int[] nums={1, 6, 2, 10, 3};
        int target=7;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
             int temp=target-nums[i];
            if(hm.containsKey(temp) && i!=hm.get(temp)){
                System.out.println(hm.get(temp)+" "+i);
                return;
            }
               hm.put(nums[i],i);
            
        }
    }
    
}
