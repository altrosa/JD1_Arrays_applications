package by.htp.luchko.multiarray;

import java.util.Random;

public class Task05 {

	/*
	 * 5. Дана матрица. Вывести на экран все четные строки, то есть с четными
	 * номерами.
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

		for (int i = 2; i < array.length; i = i + 2) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

}