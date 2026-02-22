package Strings.Medium;
// Input: s = " -042"

// Output: -42
public class StringToInteger {
    public static int atoi(String s){
        s=s.trim();
        long ans=0;
        int i=0;
        int sign=1;
        if(s.charAt(i)=='-'||s.charAt(i)=='+'){
            if(s.charAt(i)=='-') sign=-1;
            i++;
        }
        while(i<s.length()&& Character.isDigit(s.charAt(i))){
            ans=ans*10+(s.charAt(i)-'0');
            if(sign*ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign*ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int) (sign*ans);
    }
    public static void main(String[] args) {
        String s="-042";
        System.out.println(atoi(s));
    }
}
