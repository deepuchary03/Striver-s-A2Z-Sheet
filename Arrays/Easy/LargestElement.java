package Arrays.Easy;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr={3, 3, 6, 1};
        int ans=arr[0];
        for(int i:arr) ans=Math.max(ans,i);
        System.out.println(ans);
    }
    
}
