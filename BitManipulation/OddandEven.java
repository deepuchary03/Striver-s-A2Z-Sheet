package BitManipulation;
public class OddandEven {
    public static String checkEvenOrOdd(int n){
        String s="";
        if((n&1)==1) s=s+""+n+" is odd";
        else if((n&1)==0)  s=s+""+n+" is even";
        return s;

        
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(checkEvenOrOdd(n));

        int p=7;
        System.out.println(checkEvenOrOdd(p));
    }
}
