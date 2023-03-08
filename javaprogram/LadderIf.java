package com.javalearning.string;

import java.util.Scanner;

public class LadderIf {
	static void toCalculateOfAlpha(String userinput) {
		int vowels,whitespace,consonant;
		vowels=whitespace=consonant=0;
		 for(int ctr=0; ctr<userinput.length();ctr++) {
			 if(userinput.charAt(ctr)=='a'||userinput.charAt(ctr)=='e'||userinput.charAt(ctr)=='i'||userinput.charAt(ctr)=='o'||userinput.charAt(ctr)=='u') {  
				vowels++;
			 }
		    else if(userinput.charAt(ctr)==' ') {
				whitespace++;
		    }
			else {
				consonant++;
        }
		 }
		
		System.out.println("no of vowels "+vowels);	
		System.out.println("no of whitespace "+whitespace);	
		System.out.println("no of consonant "+consonant);	
					
		}		

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a str u want to count vow and con and whitspaces");
		String userinput=scan.nextLine();
		toCalculateOfAlpha(userinput);
	}

}
