package by.htp.luchko.multiarray;

import java.util.Arrays;
import java.util.Scanner;

public class Task26 {

	/*
	 * 26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить
	 * с массивом следующие действия: а) вычислить сумму отрицательных элементов в
	 * каждой строке; б) определить максимальный элемент в каждой строке; в)
	 * переставить местами максимальный и минимальный элементы матрицы.
	 * 
	 */

	public static void main(String[] args) {

		int m = enterFromConsole("Введите n: ");
		int n = enterFromConsole("Введите m: ");

		int[][] array = createMultiArray(n, m);
		arrayElements(array);
		System.out.println("Дана матрица: ");
		printArray(array);
		System.out.println("------------------------");
		printArray("Сумма нечетных элементов в каждой строке: ", arrayLineSum(array));
		printArray("Максимальный элемент в каждой строке", arrayMaxElement(array));

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

	public static int[] arrayLineSum(int[][] array) {
		int[] sum = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] < 0) {
					sum[i] = sum[i] + array[i][j];
				}
			}
		}
		return sum;
	}

	public static int[] arrayMaxElement(int[][] array) {
		int[] max = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			max[i] = array[i][0];
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] > max[i]) {
					max[i] = array[i][j];
				}
			}
		}
		return max;
	}

	public static void printArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(" " + array[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void printArray(String s, int[] array) {
		System.out.println(s + Arrays.toString(array));

	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);
	}

	public static int randomValue(int limit) {

		int max = 5;
		int min = -5;
		max -= min;
		return (int) (Math.random() * ++max) + min;
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
