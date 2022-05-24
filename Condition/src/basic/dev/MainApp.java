package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		double a;
		double b;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao a");
		a = sc.nextDouble();
		System.out.println("nhap vao b");
		b = sc.nextDouble();
		
		if(a == 0) {
			if (b == 0) {
				System.out.println("phuong trinh vo so nghiem");
			}else {
				System.out.println("Phuong trinh co vo so nghiem");
			}
		}else {
			double x = -b / a;
			System.out.println("Phuong trinh co nghiem x = " + x);
			}
		}
	}
