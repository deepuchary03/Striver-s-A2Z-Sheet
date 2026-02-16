package Arrays.Easy;

public class LinearSearch {
    public static int linearSearch(int[] arr,int t){
        for(int i=0;i<arr.length;i++) if(arr[i]==t) return i;
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={2, 3, 4, 5, 3};
        int target=5;
        int ans=linearSearch(nums, target);
        System.out.println(ans);
    }
}
