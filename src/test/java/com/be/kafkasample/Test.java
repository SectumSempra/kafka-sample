package com.be.kafkasample;

public class Test {

	public static void main(String[] args) {

		int[][] matrix = new int[3][3];

		int i=2,j=0;
		int row_limit =  matrix.length-1; 
		if (row_limit > 0) {
			int column_limit = matrix[0].length-1;
			for (int  x = Math.max(0, i - 1); x <= Math.min(i + 1, row_limit); x++) {
				for (int  y = Math.max(0, j - 1); y <= Math.min(j + 1, column_limit); y++) {
					if (x != i || y != j) {
						System.out.println(x + "" + y);
					}
				}
			}

		}
	}

}
