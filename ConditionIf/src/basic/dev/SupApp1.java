package basic.dev;

import java.util.Scanner;

public class SupApp1 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao mot so nguyen n:");
		n = sc.nextInt();
		if ((n % 3) == 0) {
			System.out.println("n chia het cho 3");
		} else {
			System.out.println("n khong chia het cho 3");
		}
		if ((n % 5) == 0) {
			System.out.println("n chia het cho 5");
		} else {
			System.out.println("n chia het cho 5");
		}
}
}