package hello;

public class ArrayExample4 {
	public static void main(String[] args) {
		int[][] intAry = new int[2][];
		intAry[0] = new int[3];
		intAry[1] = new int[4];
		int a = 8;
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				intAry[i][j] = a++;
			}
		}
		for (int i = 0; i < intAry.length; i++) {
			int sum = 0;
			for (int j = 0; j < intAry[i].length; j++) {
				sum += intAry[i][j];

			}
			System.out.print("intAry[" + i + "]" + sum);
		} // printf 포맷 부여 "%2d" 2칸 부여

	}
}
