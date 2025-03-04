import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns:");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("First row:");
        for (int i = 0; i < columns; i++) {
            System.out.print(array[0][i] + " ");
        }

        System.out.println("\nLast column:");
        for (int i = 0; i < rows; i++) {
            System.out.println(array[i][columns - 1]);
        }
    }
}
