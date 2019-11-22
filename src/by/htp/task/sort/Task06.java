package by.htp.task.sort;

import java.util.Arrays;
import java.util.Random;

public class Task06 {

	/*
	 * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
	 * его по возрастанию. Делается это следующим образом: сравниваются два соседних
	 * элемента ai и ai+1 . Если ai  ai+1 , то продвигаются на один элемент вперед.
	 * Если ai  ai+1 , то производится перестановка и сдвигаются на один элемент
	 * назад. Составить алгоритм этой сортировки.
	 */

	
	public static void main(String[] args) {

		int n = randomValue(100);
		int[] array = arrayCreate(n);
		arrayElements(array, n);
		shellSort(array);
		printArray("Сортировка Шелла: ", array);
	}

	public static void swap(int[] args, int ind1, int ind2) {
		int tmp = args[ind1];
		args[ind1] = args[ind2];
		args[ind2] = tmp;
	}

	public static int[] shellSort(int[] args) {
		int gap = args.length / 2;
		while (gap >= 1) {
			for (int right = 0; right < args.length; right++) {

				for (int c = right - gap; c >= 0; c -= gap) {
					if (args[c] > args[c + gap]) {
						swap(args, c, c + gap);
					}
				}
			}
			gap = gap / 2;
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

	public static void printArray(String s, int[] array) {
		System.out.println(s + Arrays.toString(array));
	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

}
