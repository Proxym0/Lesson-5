package group1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coef = scanner.nextInt();
        int[][][] array = new int[][][]{
                {{12, 11}, {10, 9}, {8, 7}},
                {{6, 5}, {4, 3}, {2, 1}}
                };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int c = 0; c < array[i][j].length; c++){
                    array[i][j][c]+=coef;

                }
            }
        }System.out.print(Arrays.deepToString(array));
    }
}