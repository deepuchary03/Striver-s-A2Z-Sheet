package Arrays.Easy;

public class LeftRotateByKplaces {
    public static void reverse(int[] nums,int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;r--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
    public static void main(String[] args) {
        int nums[]={1, 2, 3, 4, 5, 6};
        int k=2;

        rotate(nums, k);
        for(int i:nums){
            System.out.print(i+" ");
        }

    }
}
