package Arrays.Easy;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={8, 8, 7, 6, 5};
        int high=arr[0];
        int shigh=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>high){
                shigh=high;
                high=i;
            }else if(i>shigh && i!=high){
                shigh=i;
            }
        }
        System.out.println(shigh);
    }
}
