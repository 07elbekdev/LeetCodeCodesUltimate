package main;

public class Main {
    public static void main(String[] args) {
        int number = 234;
        System.out.println(method(number));
    }

    public static int method(int n) {
        long sum = 0;
        long prd = 1;
        while (n > 0) {
            int res = n % 10;
            sum += res;
            prd *= res;
            n /= 10;
        }
        return (int) (prd - sum);
    }
}