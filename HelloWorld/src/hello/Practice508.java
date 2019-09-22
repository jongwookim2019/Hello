package hello;

public class Practice508 {
	public static void main(String[] args) {
		int[][] Array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		int Arraysize = 0;
		double avg = 0.0;
		for (int k = 0; k < Array.length; k++) {
			for (int j = 0; j < 1; j++) {
				Arraysize += Array[k].length;

			}
		}
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; j++) {
				sum += Array[i][j];
				avg = (double) sum / Arraysize;
			}
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

}
