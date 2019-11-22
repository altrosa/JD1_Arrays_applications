package by.htp.luchko.multiarray;

public class Task23 {

	public static void main(String[] args) {

		double[][] array = createMultiArray(6, 6);
		arrayElements(array);
		System.out.println("Результат: ");
		printArray(array);
		printInt("Сумма положительных элементов: ", arraySum(array));
	}

	public static double[][] createMultiArray(int a, int b) {

		double[][] array = new double[a][b];

		return array;
	}

	public static double[][] arrayElements(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = Math.sin((i * i - j * j) / array.length);
			}

		}

		return array;
	}

	public static int arraySum(double[][] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] > 0) {
					sum = sum + 1;
				}
			}
		}
		return sum;
	}

	public static void printArray(double[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(" " + array[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}

}