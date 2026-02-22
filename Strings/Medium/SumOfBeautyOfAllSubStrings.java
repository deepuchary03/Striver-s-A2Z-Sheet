package Strings.Medium;
// Input: s = "aabcb"
// Output: 5
// Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.

import java.util.HashMap;

public class SumOfBeautyOfAllSubStrings {
    public static int sum(String s){
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer> hm= new HashMap<>();
            for(int j=i;j<n;j++){
                 int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
                 for(int ch:hm.values())
            {
                max=Math.max(max,ch);
                min=Math.min(min,ch);
            }
            ans=ans+(max-min);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="aabcb";
        System.out.println(sum(s));
    }
}
