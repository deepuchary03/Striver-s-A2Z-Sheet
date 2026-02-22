package Strings.Easy;
// Input: s = "abcde", goal = "cdeab"
// Output: true
public class RotateString {
    public static boolean rotateString(String s,String goal){
        if(s.length()!=goal.length()) return false;
        s=s+s ;
        return s.contains(goal);
    }
    public static void main(String[] args)
    {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }
    
}
