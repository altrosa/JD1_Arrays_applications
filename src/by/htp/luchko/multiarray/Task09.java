package by.htp.luchko.multiarray;

import java.util.Random;

public class Task09 {

	/*
	 * 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
	 */

	public static void main(String[] args) {

		int[][] array = createMultiArray(5, 5);
		arrayElements(array);
		System.out.println("Дана матрица: ");
		printArray(array);
		System.out.println("------------------------");
		diagonalElements(array);

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

	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(" " + array[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void diagonalElements(int[][] array) {

		for (int i = 0, j = 0; i < array.length; i++, j++) {
			System.out.print(array[i][j] + " ");
		}

	}

	public static int randomValue(int limit) {

		Random rand = new Random();

		return rand.nextInt(limit);

	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);
	}

}