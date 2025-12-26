package Arrays.Medium;
// Input : nums = [2, 4, 5, -1, -3, -4]
// Output : [2, -1, 4, -3, 5, -4]
public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums={2, 4, 5, -1, -3, -4};
        int pos=0;
        int neg=1;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos=pos+2;
            }else{
                ans[neg]=nums[i];
                neg=neg+2;
            }
        }
        for(int i:ans) System.out.print(i+" ");
    }
}
