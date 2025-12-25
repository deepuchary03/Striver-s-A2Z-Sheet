package Arrays.Easy;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums={0, 1, 4, 0, 5, 2};
        
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[idx++]=nums[i];
            }
        }
        while(idx<nums.length){
            nums[idx++]=0;
        }

        for(int i:nums) System.out.print(i+" ");
    }
}
