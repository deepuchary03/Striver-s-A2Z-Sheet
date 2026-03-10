package RandomPractise;
// Input: jewels = "aA", stones = "aAAbbbb"
// Output: 3
import java.util.*;
public class JewelsandStones {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        int ans=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:stones.toCharArray()) hm.put(c,hm.getOrDefault(c,0)+1);
        for(char c:jewels.toCharArray() )if(hm.containsKey(c)) ans=ans+hm.get(c);
        System.out.println(ans);
        
    }
}
