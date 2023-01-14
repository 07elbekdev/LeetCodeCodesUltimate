package checkStraightLine;

public class CheckStraightLine {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        System.out.println(checkStraightLine(array));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0], y0 = coordinates[0][1],
                x1 = coordinates[1][0], y1 = coordinates[1][1];
        int dx = x1 - x0, dy = y1 - y0;
        for (int[] co : coordinates) {
            int x = co[0], y = co[1];
            if (dx * (y - y1) != dy * (x - x1))
                return false;
        }
        return true;
    }
}