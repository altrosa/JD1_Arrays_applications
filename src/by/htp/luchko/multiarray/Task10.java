package by.htp.luchko.multiarray;

import java.util.Random;
import java.util.Scanner;

public class Task10 {

	// 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

	public static void main(String[] args) {

		int[][] array = createMultiArray(5, 5);
		arrayElements(array);
		System.out.println("Дана матрица: ");
		printArray(array);
		System.out.println("------------------------");

		int i = enterFromConsole("Введите k - ю строку [0; 4]: ");
		int p = enterFromConsole("Введите  p - й столбец [0; 4]: ");

		printArrayLine(array, i);
		printArrayColumn(array, p);

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

	public static void printArrayColumn(int[][] array, int a) {
		printInt("Столбец ", a);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i][a] + " ");
		}
		System.out.println();

	}

	public static void printArrayLine(int[][] array, int a) {
		printInt("Строка ", a);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[a][i] + " ");
		}
		System.out.println();
	}

	public static int randomValue(int limit) {

		Random rand = new Random();

		return rand.nextInt(limit);

	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);
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
