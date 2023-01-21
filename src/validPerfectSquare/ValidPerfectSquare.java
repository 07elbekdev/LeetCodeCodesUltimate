package validPerfectSquare;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int number = 16;
        System.out.println(isPerfectSquare(number));
    }

    public static boolean isPerfectSquare(int num) {

        if (num == Math.sqrt(num) * Math.sqrt(num)) {
            return true;
        }
        return false;
    }
}