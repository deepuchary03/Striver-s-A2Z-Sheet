package RandomPractise;
// [0,1,0,2,1,0,1,3,2,1,2,1]
public class TrapRainWater {
    public static void main(String args[]){
        int []nums={0,1,0,2,1,0,1,3,2,1,2,1};
        int n=nums.length;
       int[] left=new int[n];
       left[0]=nums[0];
       for(int i=1;i<n;i++){
           left[i]=Math.max(left[i-1],nums[i]);
       }
       
       int[] right=new int[n];
       right[n-1]=nums[n-1];
       for(int i=n-2;i>=0;i--){
           right[i]=Math.max(right[i+1],nums[i]);
       }
       int ans=0;
       for(int i=0;i<n;i++){
           ans=ans+Math.min(left[i],right[i])-nums[i];
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       System.out.print("Nums: ");
       for(int i:nums) System.out.print(i+" ");
       System.out.println();
       System.out.print("Left: ");
       for(int i:left) System.out.print(i+" ");
       System.out.println();
       System.out.print("Right ");
       for(int i:right) System.out.print(i+" ");
       System.out.println("\nans: "+ans);
    
    }
    
}
