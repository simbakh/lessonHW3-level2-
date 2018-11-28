package com.gmail.kh;
import java.util.Scanner;
public class Hw8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number that include 6 numbers");
		int a = sc.nextInt();
		int a1=a/100000;
		int a2=a%100000/10000;
		int a3=a%10000/1000;
		int a4=a%1000/100;
		int a5=a%100/10;
		int a6=a%10;
		if (a1==a6 && a2==a5 && a3==a4){
			System.out.println("Yours number is polyndromic");
		}else {
			System.out.println("Yours number is unpolyndromic");
		}
			
	}

}
