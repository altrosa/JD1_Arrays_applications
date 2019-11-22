package by.htp.luchko.multiarray;

import java.util.Random;

public class Task06 {

	/*
	 * 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
	 * элемент больше последнего.
	 * 
	 */

	public static void main(String[] args) {

		int[][] array = createArray(9, 9);
		arrayElements(array);
		System.out.println("Дана матрица: ");
		printArray(array);
		System.out.println("------------------------");
		printArrayFirstAndLast(array);

	}

	public static int[][] createArray(int a, int b) {

		int[][] array = new int[a][b];

		return array;
	}

	public static int[][] arrayElements(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = randomValue(9);
			}
		}
		return array;
	}

	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(" " + array[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void printArrayFirstAndLast(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array[0].length - 1; j = j + 2) {
				if (array[0][j] > array[array.length - 1][j]) {
					System.out.print(" " + array[i][j] + " ");
				}

			}
			if (array[0][array[0].length - 1] > array[array.length - 1][array[0].length - 1]) {
				System.out.print(array[i][array[0].length - 1]);

			}
			System.out.println();
		}
		System.out.println();

	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

}