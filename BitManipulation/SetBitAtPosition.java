package BitManipulation;

public class SetBitAtPosition {
    public static void main(String[] args) {
        int n=10; 
        int i=2;
        n=n|(1<<i);
        System.out.println(n);
    }
}

// 8 4 2 1
// 1 0 1 0 -10
// 1 1 1 0 -14
