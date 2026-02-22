package Strings.Easy;

// Input: num = "52"
// Output: "5"
public class LargestOdd {
    public static String largest(String s){
         int idx=-1;
        int i;
        for(i=s.length()-1;i>=0;i--){
            if((s.charAt(i)-'0')%2!=0){
                idx=i;
                break;
            }
        }
        if(idx==-1) return "";
        i=0;
        while(i<=idx && s.charAt(i)=='0') i++;
        return s.substring(i,idx+1);
    }
    public static void main(String[] args) {
        String s="52";
        System.out.println(largest(s));
    }
}
