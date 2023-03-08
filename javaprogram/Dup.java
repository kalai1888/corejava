package com.javalearning;

import java.util.Scanner;

public class Dup {
	public static void toreadvalues(byte print[],Scanner obj) {

		for(int ctr=0;ctr<print.length;ctr+=1) {
			print[ctr]=obj.nextByte();
		}
	}
	public static void todisplayvalues(byte print[]) {
		for(int ctr=0;ctr<print.length;ctr+=1) {
			System.out.println(print[ctr]);
		}
	}
	static void tofinddup(byte print[]) {
		String flag="not found";
		for(int ctr=0;ctr<print.length;ctr+=1) {
			for(int ctr1=0;ctr1<print.length;ctr1+=1) {
				if(print[ctr]==print[ctr1]) {
					flag="found";
					System.out.println("occur duplicate value"+print[ctr]);
					System.out.println("element found index"+ctr1);
					break;
				}

			}

			if(flag=="not found") {

				System.out.println("not found duplicat value");
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("how  many values u want to need ");
		byte number=scanobj.nextByte();
		System.out.println("enter the elemnt of the array values ");
		byte print[]=new byte[number];
		toreadvalues(print,scanobj);
		todisplayvalues(print);
		tofinddup(print);
}

}
