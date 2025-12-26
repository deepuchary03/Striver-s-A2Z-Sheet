package Arrays.Medium;
// Input: arr = [10, 7, 5, 8, 11, 9]

// Output: 6
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        int nums[]={10, 7, 5, 8, 11, 9};
        int ans=0,min=nums[0];
        for(int i:nums){
            if(i>min){
                int temp=i-min;
                ans=Math.max(ans,temp);
            }else 
                min=i;
        }
        System.out.println(ans);
    }
}
