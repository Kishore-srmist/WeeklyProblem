// Program Name: CompleteArrayLab
// Description: Covers all array concepts (1D, 2D, modification, search, transpose, validation)

import java.util.Scanner;

public class CompleteArrayLab {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =========================
        // 1D ARRAY SECTION
        // =========================

        int size;

        System.out.print("Enter size of 1D array: ");
        size = sc.nextInt();

        // Validation
        if (size <= 0) {
            System.err.println("Invalid size! Program exiting...");
            System.exit(0);
        }

        int[] arr = new int[size];

        // Input
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Display
        System.out.println("\nArray elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sum and Max
        int sum = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Maximum = " + max);

        // Modify element
        System.out.print("\nEnter index to modify: ");
        int index = sc.nextInt();

        if (index < 0 || index >= arr.length) {
            System.err.println("Invalid index!");
            System.exit(0);
        }

        System.out.print("Enter new value: ");
        int newValue = sc.nextInt();
        arr[index] = newValue;

        System.out.println("Updated array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Search element
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.err.println("Element not found!");
        }

        // =========================
        // 2D ARRAY SECTION
        // =========================

        int rows, cols;

        System.out.print("\nEnter number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.err.println("Invalid matrix size!");
            System.exit(0);
        }

        int[][] matrix = new int[rows][cols];

        // Input matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Row-wise sum
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + i + " Sum = " + rowSum);
        }

        // Transpose
        System.out.println("\nTranspose of Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        // =========================
        // END
        // =========================

        System.out.println("\nProgram executed successfully!");
    }
}