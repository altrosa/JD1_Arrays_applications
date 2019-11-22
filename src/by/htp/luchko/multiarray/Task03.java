package by.htp.luchko.multiarray;

import java.util.Random;

public class Task03 {

	/*
	 * Дана матрица. Вывести на экран первый и последний столбцы.
	 */

	public static void main(String[] args) {

		int[][] array = createArray(9, 9);
		arrayElements(array);
		System.out.println("Дана матрица: ");
		printArray(array);
		System.out.println("------------------------");
		printArrayFirstandLast(array);

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

	public static void printArrayFirstandLast(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i][0] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i][array[0].length - 1]);
		}

		System.out.println();
	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

}
