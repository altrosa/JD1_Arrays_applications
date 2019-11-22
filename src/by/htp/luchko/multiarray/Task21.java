package by.htp.luchko.multiarray;

public class Task21 {

	/*
	 * 21. Сформировать квадратную матрицу порядка n по заданному образцу(n -
	 * четное):
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
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <= i; j++) {
				array[i][j] = array.length - i + j;
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