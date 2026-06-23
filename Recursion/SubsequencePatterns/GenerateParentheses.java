package Recursion.SubsequencePatterns;
import java.util.*; //leetcode : 22
// Input: n = 3
// Output: ["((()))","(()())","(())()","()(())","()()()"]
// Input: n = 1
// Output: ["()"]
public class GenerateParentheses {
    public static void main(String args[])
    {
        int n=3;
        List<String > ans=generate(n);
        System.out.println(ans);

    }
    public static List<String> generate(int n){
        List<String> ans=new ArrayList<>();
        backtrack("",0,0,n,ans);
        return ans;
    }
    public static void backtrack(String curr,int open,int close,int n, List<String> ans){
        if(curr.length()==2*n){
            ans.add(curr);
            return;

        }
        if(open<n) backtrack(curr+"(", open+1, close, n, ans);
        if(close<open) backtrack(curr+")", open, close+1, n, ans);
    }
}
