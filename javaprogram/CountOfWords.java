package com.javalearning.string;

import java.util.Scanner;

public class CountOfWords {
public static void toCountTheWords(String userinput) {
	int count=1;
	for(int ctr=0;ctr<=userinput.length()-1;ctr++) {
		
		if(userinput.charAt(ctr)==' ') {
			count++;
		}
	}
		System.out.println(count);
	
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the name");
		String userinput=scan.nextLine();
		toCountTheWords(userinput);


	}

}
