package by.htp.luchko.multiarray;

public class Task07 {

	/*
	 * 7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
	 * элементов.
	 */

	public static void main(String[] args) {
		int[][] array = createArray(5, 5);
		arrayElements(array);
		System.out.println("Дана матрица: ");
		printArray(array);
		System.out.println("------------------------");
		System.out.println(sumArrayOdd(array));

	}

	public static int[][] createArray(int a, int b) {

		int[][] array = new int[a][b];

		return array;
	}

	public static int[][] arrayElements(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = randomValue();
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

	public static int sumArrayOdd(int[][] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if ((array[i][j] < 0) & (array[i][j] % 2 != 0)) {
					sum = sum + array[i][j];
				}
			}
		}
		return sum;
	}

	public static int randomValue() {
		int max = 5;
		int min = -5;
		max -= min;
		return (int) (Math.random() * ++max) + min;

	}

}
