package by.htp.task.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task02 {

	/*
	 * 2. Даны две последовательности a1  a2  an и b1  b2  bm . Образовать
	 * из них новую последовательность чисел так, чтобы она тоже была неубывающей.
	 * Примечание. Дополнительный массив не использовать.
	 */

	public static void main(String[] args) {

		int n = randomValue(50);

		int[] firstArray = arrayCreate(n);
		int[] secondArray = arrayCreate(10);
		arrayElements(firstArray, n);
		arrayElements(secondArray, n);
		bubbleSort(firstArray);
		bubbleSort(secondArray);
		printArray("Первый массив: ", firstArray);
		printArray("Второй массив: ", secondArray);
	
	}

	public static int[] arrayCreate(int i) {

		int[] array = new int[i];

		return array;
	}

	public static int[] arrayElements(int[] args, int n) {

		for (int i = 0; i < args.length; i++) {
			args[i] = randomValue(n);

		}
		return args;
	}

	public static void swap(int[] args, int ind1, int ind2) {
		int tmp = args[ind1];
		args[ind1] = args[ind2];
		args[ind2] = tmp;
	}

	public static int[] bubbleSort(int[] args) {

		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;
			for (int i = 1; i < args.length; i++) {
				if (args[i] < args[i - 1]) {
					swap(args, i, i - 1);
					needIteration = true;
				}
			}
		}
		return args;
	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

	public static void printArray(String s, int[] array) {
		System.out.println(s + Arrays.toString(array));
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);
	}

}
