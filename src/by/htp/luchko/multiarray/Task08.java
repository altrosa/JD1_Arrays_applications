package by.htp.luchko.multiarray;

import java.util.Random;

public class Task08 {

	/*
	 * 8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
	 * число 7 среди элементов массива
	 */

	public static void main(String[] args) {

		int[][] array = createArray(randomValue(10), randomValue(10));
		arrayElements(array);
		System.out.println("Дана матрица: ");
		printArray(array);
		System.out.println("------------------------");
		int sum = sumArrayOdd(array);
		printInt("Количество элементов, равных 7 - ми: ", sum);

	}

	public static int[][] createArray(int a, int b) {

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

	public static int sumArrayOdd(int[][] array) {

		int sum = 0;
		int x = 7;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == x) {
					sum = sum + 1;
				}
			}
		}
		return sum;
	}

	public static int randomValue(int limit) {

		Random rand = new Random();

		return rand.nextInt(limit);

	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);
	}

}
