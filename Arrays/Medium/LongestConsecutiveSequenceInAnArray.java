package Arrays.Medium;
// Input: nums = [100, 4, 200, 1, 3, 2]

import java.util.HashSet;

// Output: 4
public class LongestConsecutiveSequenceInAnArray {
   public static void main(String[] args) {
    int[] nums={100, 4, 200, 1, 3, 2};

    int longest=0;
    HashSet<Integer> hs=new HashSet<>();
    for(int i:nums) hs.add(i);
    for(int i:hs){
        if(!hs.contains(i-1)){
            int count=1;
            int x=i;
            while(hs.contains(x+1)){
                x++;
                count++;
            }
            longest=Math.max(longest,count);
        }
    }
    System.out.println("Longest: "+longest);
   } 
}
