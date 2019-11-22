package by.htp.luchko.multiarray;

public class Task12 {

	/*
	 * 12. Получить квадратную матрицу порядка n:
	 */

	public static void main(String[] args) {

		int[][] array = createMultiArray(5, 5);
		arrayElements(array);
		System.out.println("Дана матрица: ");
		printArray(array);
		System.out.println("------------------------");
	}

	public static int[][] createMultiArray(int a, int b) {

		int[][] array = new int[a][b];

		return array;
	}

	public static int[][] arrayElements(int[][] array) {
		for (int i = 0, j = 0; i < array.length; i++, j++) {
			array[i][j] = i;
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
