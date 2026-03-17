package RandomPractise;
// Input: nums = [1,2,2,4]


// Output: [2,3]
import java.util.*;
public class SetMismatch {
    public static void main(String[] args) {
        int nums[]={1,2,2,4};
        HashSet<Integer> hs=new HashSet<>();
        int ans[]={-1,-1};
        for(int i:nums){
            if(hs.contains(i)){
                ans[0]=i;
            }else{
                hs.add(i);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)) {
                ans[1]=i;
                break;
            }
        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
