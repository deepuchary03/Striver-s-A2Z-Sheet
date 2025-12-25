package Arrays.Easy;

public class LeftRotateByKplaces {
    public static void main(String[] args) {
        int nums[]={1, 2, 3, 4, 5, 6};
        int k=2;

        int n=nums.length;
        int d=k%n;
        int ans[]=new int[n];
        for(int i=0;i<n-d;i++){
            ans[i]=nums[i+d];
        }
        for(int i=0;i<d;i++){
            ans[n-d+i]=nums[i];
        }
        for(int i:ans){
            System.out.print(i+" ");
        }

    }
}
