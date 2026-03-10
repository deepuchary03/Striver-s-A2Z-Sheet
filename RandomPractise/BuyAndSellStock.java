package RandomPractise;
// Input: prices = [7,1,5,3,6,4]
// Output: 5
public class BuyAndSellStock {
    public static void main(String args[])
    {
        int[] prices={7,1,5,3,6,4};
        int ans=0;
        int min=prices[0];
        for(int i:prices){
            if(i>min){
                int temp=i-min;
                ans=Math.max(ans,temp);

            }
            else{
                min=i;
            }

        }
        System.out.println(ans);
        
    }    
}
