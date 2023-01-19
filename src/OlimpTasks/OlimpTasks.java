package OlimpTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class OlimpTasks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                even.add(array[i]);
            }
        }
        System.out.println();
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                System.out.print(array[j] + " ");
                odd.add(array[j]);
            }
        }
        if (even.size() > odd.size()) {
            System.out.println('\n' + "Yes");
        } else {
            System.out.println('\n' + "No");
        }
    }
}