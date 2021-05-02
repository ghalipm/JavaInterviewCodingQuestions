package JavaSE_Test.GeeksForGeeks;

import java.util.Arrays;

public class Factorial2 {
    public static long[] factorial(long a[], int n) {
        // code here
        long[] factorials = new long[a.length];
        for (int i = 0; i < a.length; i++) {
            factorials[i]=factor(a[i])%M;
        }
        return factorials;
    }
    static long M=100_000_000_7;
    // finding factorial using recursive function
    private static long factor(long n) {
        return (n<=1)?1:(n==2)?2: n*factor(n-1);
    }

    public static void main(String[] args) {
        long[] array={3,4,5};
        System.out.println("factorial([3, 4, 5], 3) = " + Arrays.toString(factorial(array,3)));
    }
}


