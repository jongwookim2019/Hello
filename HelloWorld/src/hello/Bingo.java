package hello;

public class Bingo {
	public static void main(String[] args) {
		int[][] tAry = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		for (int i = 0; i < tAry.length; i++) {
			for (int j = 0; j < tAry[i].length; j++) {
				System.out.print(tAry[i][j]);
			}
			System.out.println();
		}
	}
}
