package by.htp.luchko.multiarray;

public class Task01 {

	/*
	 * Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке
	 * была ровно одна единица, и вывести на экран.
	 * 
	 */

	public static void main(String[] args) {

		int[][] array = createArray(3, 4);
		arrayElements(array);
		printArray(array);

	}

	public static int[][] createArray(int a, int b) {

		int[][] array = new int[a][b];

		return array;
	}

	public static int[][] arrayElements(int[][] array) {
		for (int i = 0; i < 3; i++) {
			array[i][0] = 1;
		}
		return array;
	}

	public static void printArray(int[][] array) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(" " + array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
