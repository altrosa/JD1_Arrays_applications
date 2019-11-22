package by.htp.task.sort;

import java.util.Arrays;
import java.util.Random;

public class Task03 {

	/*
	 * 3. Сортировка выбором. Дана последовательность чисел a1  a2  an.
	 * Требуется переставить элементы так, чтобы они были расположены по убыванию.
	 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и
	 * ставится на первое место, а первый - на место наибольшего. Затем, начиная со
	 * второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
	 */

	public static void main(String[] args) {

		int n = randomValue(50);

		int[] array = arrayCreate(n);
		arrayElements(array, n);
		printArray("Последовательность: ", array);
		selectionSort(array);
		printArray("Сортировка выбором: ", array);

	}

	public static int[] selectionSort(int[] args) {

		for (int right = 0; right < args.length; right++) {
			int maxInd = right;
			for (int i = right; i < args.length; i++) {
				if (args[i] > args[maxInd]) {
					maxInd = i;
				}
			}
			swap(args, right, maxInd);
		}
		return args;
	}

	public static void swap(int[] args, int ind1, int ind2) {
		int tmp = args[ind1];
		args[ind1] = args[ind2];
		args[ind2] = tmp;
	}

	public static int[] arrayCreate(int i) {

		int[] array = new int[i];

		return array;
	}

	public static int[] arrayElements(int[] args, int a) {

		for (int i = 0; i < args.length; i++) {
			args[i] = randomValue(100);
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
}
