package by.htp.luchko.multiarray;

public class Task24 {

	/*
	 * 24. Дан линейный массив n n x , x , , x , x 1 2  −1 . Получить
	 * действительную квадратную матрицу порядка n:
	 * 
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
			for (int j = 0; j < array.length - i; j++) {
				array[i][j] = i + j + 1;
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