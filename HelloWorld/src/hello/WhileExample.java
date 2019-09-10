package hello;

public class WhileExample {
	public static void main(String[] args) {
		// 4단 출력
		int i = 1;
		int a = 4;
		while(true) {
			if(i++ < 5)
				continue;
			System.out.println(a+"*"+i+"="+(a*i));
			if(i==9)
				break;
			//i++;
		}
}
}
