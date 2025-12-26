package Arrays.Medium;
//for better approach we can use hashmap
// this is optimal approach
public class MajorityElement {
    public static int majorityElement(int[] nums){
        int n=nums.length;
        int cnt=0;
        int ele=0;
        for(int i=0;i<n;i++)
            if(cnt==0){
                cnt++;
                ele=nums[i];
            }else if(ele==nums[i]) cnt++;
            else cnt--;

            int checking=0;
            for(int i:nums) if(ele==i) checking++;
            if(checking >(n/2)) return ele;
            return -1;
    }
    public static void main(String[] args) {
        int nums[]={2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element : "+majorityElement(nums));
    }
}
