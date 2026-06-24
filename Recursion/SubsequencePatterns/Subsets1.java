package Recursion.SubsequencePatterns;
import java.util.*;
// Input : nums = [2, 3]
// Output : [0, 2, 3, 5]
// Explanation :
// When no elements is taken then Sum = 0.
// When only 2 is taken then Sum = 2.
// When only 3 is taken then Sum = 3.
// When element 2 and 3 are taken then sum = 2+3 = 5.
public class Subsets1 {
    public static void main(String args[]){
        int []nums={2,3};
        List<Integer> ans=findSub(nums);
        Collections.sort(ans);
        System.out.println(ans);

    }
    public static List<Integer> findSub(int[] nums){
        List<Integer> ans=new ArrayList<>();
        backtrack(0,nums,0,ans);
        return ans;
    }
    public static void backtrack(int i,int[] nums,int sum,List<Integer> ans){
        if(i==nums.length){
            ans.add(sum);
            return;
        }
        sum=sum+nums[i];
        backtrack(i+1, nums, sum, ans);
        sum=sum-nums[i];
        backtrack(i+1, nums, sum, ans);
    }
}
