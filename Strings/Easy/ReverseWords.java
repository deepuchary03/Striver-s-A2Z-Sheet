package Strings.Easy;

// Input: s = "the sky is blue"
// Output: "blue is sky the"

public class ReverseWords {
    public static String reverse(String s){
        StringBuilder sb=new StringBuilder();
        s=s.trim();
        String[] words=s.split("\\s+");
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0) sb.append(" ");
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(reverse(s));
    }
}
