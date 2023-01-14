package reachestCustomerWealth;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(array));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxSum = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += account[j];
            }
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}