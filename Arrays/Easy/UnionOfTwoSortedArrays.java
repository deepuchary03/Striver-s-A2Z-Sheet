package Arrays.Easy;
//leetcode qsn
public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {
        
    
    int[] nums1={1, 2, 3, 4, 5,0,0,0};
    int[] nums2={1,2,7};
    int m=5;
    int n=3;

    int k=m+n-1;
    int i=m-1;
    int j=n-1;
    while(j>=0){
        if(i>=0 && nums1[i]>nums2[j]){
            nums1[k]=nums1[i];
            k--;
            i--;
        }else{
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }

    for(int p:nums1) System.out.print(p+" ");
}
}