package LearningTestNg;

import java.util.Scanner;

public class evenCellsFrom2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row value");
		int row = sc.nextInt();
		System.out.println("Enter the col value");
		int col = sc.nextInt();
		int sum = 0;
		// Enter values
		System.out.println("Enter the array values");
		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		// displaying values
		System.out.println("Displaying the 2D array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}

}
