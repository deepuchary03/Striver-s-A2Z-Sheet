package RandomPractise;
// Input: colors = [1,1,1,6,1,1,1]
// Output: 3
public class TwoFurthestHousesWithDifferentColors {
    public static void main(String args[]){
        int[] colors={1,1,1,6,1,1,1};
        int left=colors[0];
        int n=colors.length;
        int right=colors[n-1];
        int ans=0;
        for(int i=0;i<n;i++){
            if(right!=colors[i]){
                ans=Math.max(ans,n-i-1);

            }
        }
        for(int i=n-1;i>=0;i--){
            if(left!=colors[i]) ans=Math.max(ans,i);
        }
        System.out.println(ans);
    }   
}
