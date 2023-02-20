public class Task_2 {
    public static void main(String[] args) {
        int arg1 = Integer.parseInt(args[0]);
        printFibonacci(arg1);
    }

    static void printFibonacci(long n){
        long a = 0;
        long b = 1;
        for (long i = 2; i <= n; ++i) {
            long next = a + b;
            a = b;
            b = next;
        }
        if(n != 0) System.out.println(b);
        else System.out.println(0);
    }
}
