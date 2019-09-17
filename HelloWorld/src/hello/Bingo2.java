package hello;

public class Bingo2 {
	public static void main(String[] args) {
		int[][] tAry = new int[5][5];
		int a = 1;
		for (int i = 0; i < tAry.length; i++) {
			for (int j = 0; j < tAry[i].length; j++) {
				tAry[i][j] = a++;
			}
		}
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < tAry[i].length; j++) {
				System.out.print(tAry[j][i]);

			}
			System.out.println();
		}
	}
}
