package by.htp.luchko.multiarray;

import java.util.Random;
import java.util.Scanner;

public class Task27 {

	/*
	 * 27. В числовой матрице поменять местами два столбца любых столбца, т. е. все
	 * элементы одного столбца поставить на соответствующие им позиции другого, а
	 * его элементы второго переместить в первый. Номера столбцов вводит
	 * пользователь с клавиатуры.
	 */

	public static void main(String[] args) {

		int a = enterFromConsole("Введите номер первой колонны: ");
		int b = enterFromConsole("Введите номер второй колонны: ");

		int[][] array = createMultiArray(6, 6);
		arrayElements(array);
		System.out.println("Дан массив: ");
		printArray(array);
		System.out.println("--------------------");
		System.out.println("Результат: ");
		printArray(arrayColumnReverse(array, a, b));
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

	public static int[][] arrayColumnReverse(int[][] array, int a, int b) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count = array[i][a];
			array[i][a] = array[i][b];
			array[i][b] = count;
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

	public static int enterFromConsole(String s) {
		int value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(s);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(s);
		}
		value = sc.nextInt();
		return value;
	}

}