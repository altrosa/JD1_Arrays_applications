package by.htp.task.sort;

import java.util.Arrays;
import java.util.Random;

public class Task04 {

	/*
	 * 4. Сортировка обменами. Дана последовательность чисел a1  a2  an
	 * .Требуется переставить числа в порядке возрастания. Для этого сравниваются
	 * два соседних числа ai и ai+1 . Если ai  ai+1 , то делается перестановка. Так
	 * продолжается до тех пор, пока все элементы не станут расположены в порядке
	 * возрастания. Составить алгоритм сортировки, подсчитывая при этом количества
	 * перестановок.
	 */

	public static void main(String[] args) {

		int n = randomValue(50);

		int[] array = arrayCreate(n);
		arrayElements(array, n);
		bubbleSort(array);
		printArray("Сортировка обменами: ", array);

	}

	public static void swap(int[] args, int ind1, int ind2) {
		int tmp = args[ind1];
		args[ind1] = args[ind2];
		args[ind2] = tmp;
	}

	public static int[] bubbleSort(int[] args) {

		boolean needIteration = false;

		while (!needIteration) {
			needIteration = true;
			for (int i = 1; i < args.length; i++) {
				if (args[i] < args[i - 1]) {
					swap(args, i, i - 1);
					needIteration = false;
				}
			}
		}
		return args;
	}

	public static int[] arrayCreate(int i) {

		int[] array = new int[i];

		return array;
	}

	public static int[] arrayElements(int[] args, int a) {

		for (int i = 0; i < args.length; i++) {
			args[i] = randomValue(a);
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
