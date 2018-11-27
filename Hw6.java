package com.gmail.kh;

import java.util.Scanner;

public class Hw6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the (x)");
		int x = sc.nextInt();
		System.out.println("Enter the (y)");
		int y = sc.nextInt();
		if (x<=6 && y>=1 && y <= 6)
		{
			System.out.println("Yours (x,y) is in the triangle ");
		}
		else 
		{
			System.out.println("Yours (x,y) is out of the  triangle ");
		}
	}
}
