package basic.dev;

public class MainApp {
	public static void main(String[] args) {
		int a = 1;
	while (a <=9) {
		int b = 0;
		while (b <= 9) {
			System.out.format(" %d * %d = %d \t ", b, a, a * b);
			b++;
			
		}
		System.out.println("");
		a++;
	}
}
}
