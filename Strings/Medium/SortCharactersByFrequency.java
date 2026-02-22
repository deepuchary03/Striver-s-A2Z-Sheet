package Strings.Medium;
// Input: s = "tree"
// Output: "eert"
import java.util.*;
public class SortCharactersByFrequency {
    public static String sort(String s){
        PriorityQueue<Freq> pq=new PriorityQueue<>((a,b)->b.value-a.value);
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char c:hm.keySet()){
            Freq temp=new Freq(c,hm.get(c));
            pq.add(temp);
        }

        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Freq temp=pq.poll();
            for(int i=0;i<temp.value;i++){
                sb.append(temp.key);
            }
        }
        return sb.toString();


        
    }
    public static void main(String[] args) {
        String s="tree";
        System.out.println(sort(s));
    }
}
class Freq{
    char key;
    int value;
    Freq(char key,int value){
        this.key=key;
        this.value=value;
    }
}
