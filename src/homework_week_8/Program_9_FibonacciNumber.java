package homework_week_8;

public class Program_9_FibonacciNumber {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;
        System.out.println("The Fibonacci Series Till " + n + " Numbers :");
        for (int i=1; i<=n;++i){
            System.out.print(a + "  ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
