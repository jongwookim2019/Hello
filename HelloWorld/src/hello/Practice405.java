package hello;

public class Practice405 {
	public static void main(String[] args) {
		int a =0;
		int b =0;
		for(int x=1; x<=10; x++) {
			a = 4*x;
			for(int y=1; y<=10; y++) {
				b = 5*y;
				if(a+b==60) {
					System.out.println("("+x+","+y+")");	}
			}
		}
	}
}