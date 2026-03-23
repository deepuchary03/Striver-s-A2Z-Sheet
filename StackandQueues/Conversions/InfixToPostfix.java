package StackandQueues.Conversions;
// Input: s = "a*(b+c)/d"
// Output: abc+*d/

import java.io.StringBufferInputStream;
// Input: s = "a+b*c+d"
// Output: abc*+d+
import java.util.*;
public class InfixToPostfix {
    public static void main(String args[]){
        String s="a*(b+c)/d";
        Stack<Character> st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if('a'<=c && c<='z' || 'A'<=c && c<='Z' || '0'<=c && c<='9'){
                ans.append(c);
            }else if(c=='(') {
                st.push(c);
            }else if(c==')'){
                while(st.peek()!='('){
                    ans.append(st.pop());
                }
                st.pop();
            }else{
                while(!st.isEmpty() && prec(c)<=prec(st.peek())&& c!='^'){
                    ans.append(st.pop());
                }
                st.push(c);
            }
          
        }
        while(!st.isEmpty()) ans.append(st.pop());
        System.out.println(ans.toString());
    }
    public static int prec(char c){
        if(c=='^') return 3;
        if(c=='*'||c=='/') return 2;
        if(c=='+' || c=='-') return 1;
        return -1;
    }
}
