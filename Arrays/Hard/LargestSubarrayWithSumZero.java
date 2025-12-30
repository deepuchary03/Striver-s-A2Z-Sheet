package Arrays.Hard;

import java.util.HashMap;

// Input: arr = [15, -2, 2, -8, 1, 7, 10, 23]
// Output: 5
public class LargestSubarrayWithSumZero {
    public static void main(String[] args) {
        int arr[]={15, -2, 2, -8, 1, 7, 10, 23};
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==0){
                ans=i+1;
            }else {
                if(hm.containsKey(sum)){
                    ans=Math.max(ans,i-hm.get(sum));
                }else hm.put(sum,i);
            }
        }
        System.out.println(ans);
    }
}
