package by.htp.luchko.multiarray;

public class Task13 {

	/*
	 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное.
	 */

	public static void main(String[] args) {

		int[][] array = createMultiArray(6, 6);
		arrayElements(array);
		System.out.println("Результат: ");
		printArray(array);
	}

	public static int[][] createMultiArray(int a, int b) {

		int[][] array = new int[a][b];

		return array;
	}

	public static int[][] arrayElements(int[][] array) {
		for (int i = 0; i < array.length; i = i + 2) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = j + 1;
			}

		}
		for (int i = 1; i < array.length; i = i + 2) {
			for (int j = array[0].length - 1; j >= 0; j--) {
				array[i][array.length - 1 - j] = j + 1;

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

}