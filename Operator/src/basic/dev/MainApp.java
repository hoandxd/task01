package basic.dev;

import java.util.Scanner;

public class MainApp {
public static void main(String[] args) {
	double a;
	double b;
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap vao a:");
	a = sc.nextDouble();
	System.out.println("nhap vao b:");
	b = sc.nextDouble();
	System.out.println("tong a va b la " + (a + b));
	System.out.println("hieu a va b la " + (a - b));
	System.out.println("tich a va b la " + a * b);
	if (b == 0) {
		System.out.println("a va b khong co thuong ");
	} else {
		System.out.println("a / b = " + a / b);
	}
	double c = a - b;
	if (c > 0) {
		System.out.println("a lon hon b");
	} else {
			if (c == 0) {
				System.out.println("a bang b");
			} else {
				System.out.println("a be hon b");
			}
	}
}
}
