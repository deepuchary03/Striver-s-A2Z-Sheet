package Arrays.Medium;
// Input: nums = [1, 2, 5, 3, 1, 2]

import java.util.ArrayList;
import java.util.Collections;

// Output: [5, 3, 2]
public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] nums={1, 2, 5, 3, 1, 2};
        int max=nums[nums.length-1];
        if(nums.length==0){
            return;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(max);
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>max){
                ans.add(nums[i]);
                max=nums[i];
            }
        }
        Collections.reverse(ans);
        for(int i:ans) System.out.print(i+" ");

    }
}
