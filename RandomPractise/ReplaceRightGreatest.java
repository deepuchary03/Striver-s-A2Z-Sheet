package RandomPractise;
// Input: arr = [17,18,5,4,6,1]
// Output: [18,6,6,6,1,-1]
public class ReplaceRightGreatest {
    public static void main(String[] args) {
        int max=-1;
        int[] nums={17,18,5,4,6,1};
        for(int i=nums.length-1;i>=0;i--){
            int temp=nums[i];
            nums[i]=max;
            max=Math.max(max,temp);
        }
        for(int i: nums) System.out.print(i+" ");
    }
}
