package BitManipulation;
// Input: n = 10, i = 1

// Output: true
public class SetBit {
    public static boolean check(int n,int i){
        return (n&(1<<i))!=0;
    }
    public static void main(String[] args) {
        int n=10;
        int i=1;
        System.out.println(check(n,i));
    }
}
