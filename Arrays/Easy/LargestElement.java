package Arrays.Easy;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr={3, 3, 6, 1};
        int max=arr[0];
        for(int i:arr) max=Math.max(i,max);
        System.out.println(max);
    }
    
}
