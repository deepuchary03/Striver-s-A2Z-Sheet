package Arrays.Medium;
import java.util.HashMap;
// Input: nums = [1, 6, 2, 10, 3], target = 7
// Output: [0, 1]
public class TwoSum {
    public static void main(String args[]){
        int[] nums = {1, 6, 2, 10, 3};
        int target=7;
        int[] ans=twoSum(nums,target);
        for(int i:ans) System.out.print(i+" ");
    }
    public static int[] twoSum(int[] arr,int target){
        int ans[]={-1,-1};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(target-arr[i])){
                ans[0]=hm.get(target-arr[i]);
                ans[1]=i;
            }
            hm.put(arr[i],i);
        }
        return ans;
    }
    
}
