package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
	int a;
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap vao mot so nguyen :");
	a = sc.nextInt();
	if (a > 0) {
		System.out.println("day la so nguyen duong");
	} else {
		if (a < 0) {
			System.out.println("day la so nguyen am");
		} else {
				System.out.println("day la so 0, khong phai nguyen am cung khong phai nguyen duong");
		}
	}
}
}
