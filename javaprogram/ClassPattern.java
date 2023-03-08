package com.javalearning;

import java.util.Scanner;

public class ClassPattern {

	public static void main(String[] args) {
	/*	System.out.println("enter   the row number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("enter   the colunm number");
		int n2=sc.nextInt();*/
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=row;col--) {
				System.out.print(row);
			}
				
				System.out.print("\n");
			
				
		}

	}

}
