package Strings.Medium;
// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
import java.util.HashMap;

public class RomanToInteger {
    public static int toInteger(String s)
    {
         if(s.length()==0||s==null){
        return -1;
    }
    int ans=0;
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	map.put('I', 1);
	map.put('V', 5);
	map.put('X', 10);
	map.put('L', 50);
	map.put('C', 100);
	map.put('D', 500);
	map.put('M', 1000);
    for(int i=0;i<s.length();i++){
        if(i<s.length()-1 &&map.get(s.charAt(i))<map.get(s.charAt(i+1))) ans=ans-map.get(s.charAt(i));
        else{
            ans=ans+map.get(s.charAt(i));
        }
    }
    return ans;
    } 
    public static void main(String[] args) {
        String s="MCMXCIV";
        System.out.println(toInteger(s));
    }
}
