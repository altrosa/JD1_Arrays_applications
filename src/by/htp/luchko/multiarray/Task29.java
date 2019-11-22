package by.htp.luchko.multiarray;

import java.util.Arrays;

public class Task29 {

	/*
	 * 29. Найти положительные элементы главной диагонали квадратной матрицы.
	 * 
	 */

	public static void main(String[] args) {
		int[][] array = createMultiArray(6, 6);
		arrayElements(array);
		System.out.println("Дан массив: ");
		printArray(array);
		System.out.println("--------------------");
		System.out.println("Результат: ");
		printArray(arrayDiagonal(array));

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

	public static int[] arrayDiagonal(int[][] array) {
		int count = 0;
		int[] array2 = new int[array.length];
		for (int i = 0, j = 0; i < array.length; i++, j++) {
			if (array[i][j] < 0) {
				count = count + array[i][j];
			} else {
				array2[i] = array[i][j];
			}

		}
		return array2;
	}

	public static void printArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(" " + array[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));

	}

	

	public static int randomValue(int limit) {

		int max = 5;
		int min = -5;
		max -= min;
		return (int) (Math.random() * ++max) + min;

	}

}
