package by.htp.luchko.multiarray;

import java.util.Random;

public class Task11 {

	/*
	 * 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
	 * первая строка справа налево, вторая строка слева направо, третья строка
	 * справа налево и так далее
	 */

	public static void main(String[] args) {

		int[][] array = createMultiArray(5, 5);
		arrayElements(array);
		System.out.println("Дана матрица: ");
		printArray(array);
		System.out.println("------------------------");
		prinArrayLeftRight(array);
	}

	public static int[][] createMultiArray(int a, int b) {

		int[][] array = new int[a][b];

		return array;
	}

	public static int[][] arrayElements(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = randomValue(10);
			}
		}
		return array;
	}

	public static void prinArrayLeftRight(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				for (int j = 0; j < array[0].length - 1; j++) {
					System.out.print(array[i][j] + " ");
				}
				System.out.print(array[i][array[0].length - 1] + " ");
			} else {
				for (int j = array[0].length - 1; j > 0; j--) {
					System.out.print(array[i][j] + " ");
				}
				System.out.print(array[i][0] + " ");
			}

			System.out.println();
		}

		System.out.println();

	}

	public static int randomValue(int limit) {

		Random rand = new Random();

		return rand.nextInt(limit);

	}

	public static void printArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(" " + array[i][j] + " ");
			}
			System.out.println();
		}

	}


}
