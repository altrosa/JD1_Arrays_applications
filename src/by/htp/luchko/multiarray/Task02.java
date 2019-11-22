package by.htp.luchko.multiarray;

import java.util.Random;

public class Task02 {

	/*
	 * Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из
	 * [0, 9].
	 */

	public static void main(String[] args) {

		int[][] array = createArray(2, 3);
		arrayElements(array);
		printArray(array);

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

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

}
