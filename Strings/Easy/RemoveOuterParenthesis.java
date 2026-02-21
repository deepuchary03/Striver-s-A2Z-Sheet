package Strings.Easy;
// Input: s = "(()())(())"
// Output: "()()()"
public class RemoveOuterParenthesis {

    public static String remove(String s){
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')') count--;
            if(count!=0) sb.append(s.charAt(i));
            if(s.charAt(i)=='(') count++;
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String s="(()())(())";
        System.out.println(remove(s));
    }

}
