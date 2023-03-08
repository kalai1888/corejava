package com.javalearning;

import java.util.Scanner;

public class NinethProgram {
	int num,num1;
    private static void prgm(int num) {
    	
    	if(num%2!=0) {
    		System.out.println("wired"+" "+num);
    	}
    	else if(num>=2 || num<=5) {
    		System.out.println("not weired");

    	}
    	else if((num>=6)||(num<=20)) {
    	
    		System.out.println(" weired");
    	}
    	else
    	{
    		System.out.println(" not weired");		
    			}
    	}
	public static void main(String[] args) {
		
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanobj.nextInt();
		prgm(num);
		}
}
