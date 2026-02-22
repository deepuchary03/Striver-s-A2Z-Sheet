package Strings.Medium;
import java.util.Stack;
// Input: s = "()(())((()()))"

// Output: 3
public class NestingDepth {
    public static int max(String s){
        Stack<Character> st=new Stack<>();
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='(') st.push(c);
            else if(c==')') st.pop();
            count=Math.max(count,st.size());
        }

        return count;
    }
    public static void main(String[] args) {
        String s="()(())((()()))";
        System.out.println(max(s));

    }
}
