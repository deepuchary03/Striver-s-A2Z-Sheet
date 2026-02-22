package Strings.Medium;
// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.
public class LongestPalindromicSubstring {
    public static boolean isPalin(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        }
        return true;
    }
    public static String longest(String s)
    {
        String ans="";
        if(s.length()==1) return s;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String temp=s.substring(i, j);
                if(isPalin(temp)){
                    if(ans.length()<temp.length()){
                        ans=temp;
                    }
                }
            }
        }


        return ans;
    }
    public static void main(String args[]){
        String s="babad";
        System.out.println(longest(s));
    }
    
}
