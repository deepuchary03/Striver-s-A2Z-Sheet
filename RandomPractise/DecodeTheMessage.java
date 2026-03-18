package RandomPractise;

import java.util.HashMap;

public class DecodeTheMessage {
    public static void main(String s[]){
 String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
        int temp=97;
        HashMap<Character,Character> hm=new HashMap<>();
        for(char c:key.toCharArray()){
            if(c!=' '&&!hm.containsKey(c)){
                hm.put(c,(char) temp);
                temp++;
            }
        }
        for(char c:hm.keySet()) System.out.println(c+" -> "+hm.get(c));
        StringBuilder ans=new StringBuilder();
        for(char c:message.toCharArray()){
            if(c==' ') ans.append(" ");
            else ans.append(hm.get(c));
        }
        String res=ans.toString();
       System.out.println(res);
    }
}
