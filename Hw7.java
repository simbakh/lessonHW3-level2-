package com.gmail.kh;
import java.util.Scanner;
public class Hw7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number that include 4 numbers");
		int a = sc.nextInt();
		int a1=a/1000;
		int a2=a%1000/100;
		int a3=a%100/10;
		int a4=a%10;
		if (a1+a2==a3+a4)
		{
			System.out.println("Yours ticket is lucky");
		}
		else
		{
			System.out.println("Yours ticket is unlucky");
		}
	}

}
