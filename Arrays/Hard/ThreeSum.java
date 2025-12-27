package Arrays.Hard;
import java.util.*;
// Input: nums = [2, -2, 0, 3, -3, 5]
// Output: [[-2, 0, 2], [-3, -2, 5], [-3, 0, 3]]
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        // Set<List<Integer>> ans=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     HashSet<Integer> hs=new HashSet<>();
        //     for(int j=i+1;j<nums.length;j++){
        //         int third=-(nums[i]+nums[j]);                                  //this is better sol. not optimal
        //         if(hs.contains(third)){
        //             List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
        //             Collections.sort(temp);
        //             ans.add(temp);
        //         }
        //         hs.add(nums[j]);
        //     }
        // }
        // return new ArrayList<>(ans);
        //----------------------------------------------optimal soln-----------------
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(i>0 && nums[i]==nums[i-1]) continue;
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                        ans.add(temp);
                        j++;
                        k--;
                        while(j<k && nums[j-1]==nums[j])j++;
                        while(j<k && nums[k+1]==nums[k])k--;
                }
            }
        }
return ans;
    }
    public static void main(String[] args) {
        
        int nums[]={2, -2, 0, 3, -3, 5};
        List<List<Integer>> res=threeSum(nums);
        System.out.println(res);
    }
}
