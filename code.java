package com.company

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("masukkan ANgka : ");
		int angka = sc.nextInt();
		int x = 0;
		int y = 1;
		
		System.out.println("Hasil : ");
			for (int 1 = 0; i < angka; i++) {
				if(i !=0) {
					System.out.println(x + " ");
					x = x + y;
					y=x;
				}
			}
	}
}