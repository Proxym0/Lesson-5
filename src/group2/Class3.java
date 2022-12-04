package group2;

public class Class3 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                         {5, 6, 7},
                         {9, 10, 11}};
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
            }System.out.print(array[i][i] + " ");
            }
            System.out.println(" ");
            for (int i = 0 ; i < array.length ; i++) {
                for (int j = 0; j < array[i].length; j++) {
            }System.out.print(array[i][array.length -1 - i] + " ");
        }
    }
}

