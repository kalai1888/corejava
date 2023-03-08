package com.javalearning.string;

public class CountVowelsConsonant {

	
	public static void main(String[] args) {
	String str="Kalai   ";
	//String b="vani";
	//String str=new String();
	//	System.out.println(a);
		//System.out.println(b);.
	str=str.toLowerCase();
	
	int  vCount=0;
	int cCount=0;
		int length=str.length();
	for(int i=0;i<length;i++) {
		if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
	    vCount++;
	}  
	//else if(str.charAt(i)>='a'&& str.charAt(i)<='z') { 
	//cCount++;
//	}
//	}// or
		else {
			cCount++;
			
		}
		
	
	}
		System.out.println("count of vowels:"+vCount);
	System.out.println("count of consonants:"+cCount);	
	
	
}

}


