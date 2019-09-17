package hello;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[][] Ary = { { 2, 3, 4 }, { 5, 6, 7 } };

		for (int i = 0; i < Ary.length; i++) {
			for (int j = 0; j < Ary[i].length; j++) {
				System.out.print("["+i+","+j+"=>" +Ary[i][j]+"]");

			}
			System.out.println();
		}
		
		int[][] tAry = new int[5][5];
		for (int i =1; i<2)
	}
}