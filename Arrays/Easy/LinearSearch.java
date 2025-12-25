package Arrays.Easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={2, 3, 4, 5, 3};
        int target=3;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                System.out.println("Found at index:"+i);
                return;
            }
        }
        System.out.println(-1);
    }
}
