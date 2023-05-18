package LearningTestNg;

import java.util.Scanner;

public class LearningTwoDimensionalarray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row value");
		int row = sc.nextInt();
		System.out.println("Enter the col value");
		int col = sc.nextInt();

		System.out.println("Enter the array values");
		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Displaying the 2D array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Adding the even rows and columns in the array");
		int count = 0;
		
		if (row % 2 == 0 || col%2 ==0)
		{
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
					count = count + arr[i][j];
					
				}
				System.out.print("Sum of even row count is " + count);
			}

		}
	}
}
