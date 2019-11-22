package by.htp.luchko.multiarray;

import java.util.Random;

public class Task30 {

	/*
	 * 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран
	 * саму матрицу и номера строк, в которых число 5 встречается три и более раз.
	 * 
	 */

	public static void main(String[] args) {
		int[][] array = createMultiArray(10, 20);
		arrayElements(array);
		System.out.println("Дан массив: ");
		printArray(array);
		System.out.println("--------------------");
		arrayLine(array);

	}

	public static int[][] createMultiArray(int a, int b) {

		int[][] array = new int[a][b];

		return array;
	}

	public static int[][] arrayElements(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = randomValue(15);
			}
		}
		return array;
	}

	public static void arrayLine(int[][] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == 5) {
					count++;
				}
			}

			if (count >= 3) {
				System.out.println("Число 5 встречается 3 и более раз в строках: " + i);
			}
			count = 0;
		}

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