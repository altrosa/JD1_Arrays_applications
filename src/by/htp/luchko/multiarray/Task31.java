package by.htp.luchko.multiarray;

import java.util.Random;

public class Task31 {

	/*
	 * 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать
	 * количество двузначных чисел в ней.
	 * 
	 */

	public static void main(String[] args) {
		int[][] array = createMultiArray(10, 10);
		arraySum(array);
		System.out.println("Дан массив: ");
		printArray(array);
		System.out.println("--------------------");
		int sum = arrayLine(array);
		printInt("Двузначных чисел: ", sum);

	}

	public static int[][] createMultiArray(int a, int b) {

		int[][] array = new int[a][b];

		return array;
	}

	public static int[][] arraySum(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = randomValue(999);
			}
		}
		return array;
	}

	public static int arrayLine(int[][] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] <= 99 & array[i][j] > 9) {
					count++;
				}
			}

		}
		return count;

	}

	public static void printArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(" " + array[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void printInt(String s, int a) {
		System.out.println(s + a);
	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);

	}

}