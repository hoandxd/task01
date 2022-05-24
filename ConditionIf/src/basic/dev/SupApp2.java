package basic.dev;

import java.util.Scanner;

public class SupApp2 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao mot thang:");
		n = sc.nextInt();
		if (n == 1 || n ==3||n==5||n==7||n==8||n==10||n==12) {
			System.out.println("thang " + n + " co 31 ngay");
		} else {
			if (n == 1 || n ==4||n==6||n==9||n == 11) {
				System.out.println("thang "+ n + " co 30 ngay");
			} else {
				System.out.println("thang "+ n + " co 28 ngay");
			}
		}
}
}