package by.htp.task.sort;

import java.util.Arrays;
import java.util.Random;

public class Task05 {

	/*
	 * 5. Сортировка вставками. Дана последовательность чисел a a an , , , 1 2  .
	 * Требуется переставить числа в порядке возрастания. Делается это следующим
	 * образом. Пусть a a ai , , , 1 2  - упорядоченная последовательность, т. е.
	 * a1  a2  an . Берется следующее число ai+1 и вставляется в
	 * последовательность так, чтобы новая последовательность была тоже
	 * возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
	 * не будут перебраны. Примечание. Место помещения очередного элемента в
	 * отсортированную часть производить с помощью двоичного поиска. Двоичный поиск
	 * оформить в виде отдельной функции
	 */

	public static void main(String[] args) {

		int n = randomValue(50);

		int[] array = arrayCreate(n);
		arrayElements(array, n);
		insertionSort(array);
		printArray("Сортировка вставками: ", array);

	}

	public static int[] insertionSort(int[] args) {

		for (int left = 0; left < args.length; left++) {
			int value = args[left];
			int i = left - 1;
			for (; i >= 0; i--) {
				if (value < args[i]) {
					args[i + 1] = args[i];
				} else {
					break;
				}
			}
			args[i + 1] = value;
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
