package Strings.Easy;

import java.util.Arrays;

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
public class LongestCommonPrefix {
    public static String longest(String[] s){
        Arrays.sort(s);
        String s1=s[0],s2=s[s.length-1];
        int idx=0;
        while(idx<s.length){
            if(s1.charAt(idx)==s2.charAt(idx)) idx++;
            else break;
        }
        if(idx==0) return "";
        return s1.substring(0,idx);
    }
    public static void main(String[] args) {
        String[] s={"flower","flow","flight"};
        System.out.println(longest(s));

        

    }
}
