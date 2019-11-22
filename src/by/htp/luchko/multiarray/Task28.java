package by.htp.luchko.multiarray;

import java.util.Arrays;
import java.util.Random;

public class Task28 {

	/*
	 * 28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
	 * столбце. Определить, какой столбец содержит максимальную сумму.
	 * 
	 */

	public static void main(String[] args) {

		int[][] array = createMultiArray(6, 6);
		arrayElements(array);
		System.out.println("Дан массив: ");
		printArray(array);
		System.out.println("--------------------");
		System.out.println("Результат: ");
		printArray(arraySumColumnElements(array));
		printInt("Максимальная сумма в столбце: ", columnMax(arraySumColumnElements(array)));

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

	public static int[] arraySumColumnElements(int[][] array) {
		int[] sum = new int[array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] > 0) {
					sum[j] = sum[j] + array[i][j];
				}
			}
		}
		return sum;
	}

	public static int columnMax(int[] args) {
		int max = 0;
		int maxSum = 0;
		for (int i = 0; i < args.length; i++) {
			if (args[i] > max) {
				max = args[i];
				maxSum = i + 1;
			}
		}
		return maxSum;

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

	public static void printInt(String s, int a) {
		System.out.println(s + a);
	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);

	}

}
