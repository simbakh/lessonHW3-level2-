package com.gmail.kh;

import java.util.Scanner;

public class Hw5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the (x)");
		int x = sc.nextInt();
		System.out.println("Enter the (y)");
		int y = sc.nextInt();
		System.out.println("Enter the center of the circle (Xc) ");
		int Xc = sc.nextInt();
		System.out.println("Enter the center of the circle (Yc)");
		int Yc = sc.nextInt();
		int r = 4;
		if ((Math.pow((x - Xc), 2)+ Math.pow((y - Yc), 2)) < 16 )
{
	System.out.println("Yours (x,y) is in the circle ");
}
		else if ((Math.pow((x - Xc), 2)+ Math.pow((y - Yc), 2)) == 16 )
		{
			System.out.println("Yours (x,y) is on the circle ");
		}
		else  if ((Math.pow((x - Xc), 2)+ Math.pow((y - Yc), 2)) > 16 )
		{
			System.out.println("Yours (x,y) is out of the circle ");
		}
	}

}
