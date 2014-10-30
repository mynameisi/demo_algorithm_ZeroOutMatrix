public class Main {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 0, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("之前的矩阵:");
		Main.printMatrix(matrix);
		Main.setZeros(matrix);
		System.out.println("之后的矩阵:");
		Main.printMatrix(matrix);

	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * 这个方法把矩阵中0所在行列全变成0
	 * 比如：
	 * 1 0 3
	 * 4 5 6 
	 * 7 8 9
	 * 会变成
	 * 0 0 0
	 * 4 0 6
	 * 7 0 9
	 * @param matrix
	 */
	public static void setZeros(int[][] matrix) {
		int[] row = new int[matrix.length];
		int[] column = new int[matrix[0].length];
		// Store the row and column index with value 0
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					column[j] = 1;
				}
			}
		}
		// Set arr[i][j] to 0 if either row i or column j has a 0
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if ((row[i] == 1 || column[j] == 1)) {
					matrix[i][j] = 0;
				}
			}
		}
	}
}
