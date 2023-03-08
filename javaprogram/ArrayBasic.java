package com.javalearning;

import java.util.Scanner;

public class ArrayBasic {

	public static void toreadvalues(byte score[],Scanner obj) {
		for(int ctr=0;ctr<score.length;ctr++) {//arr.lenth
			score[ctr]=obj.nextByte();//arr[index-0]=values
		}
		
	}
	static void displayarrvalues(byte score[]) {
		for(int ctr=0;ctr<score.length;ctr++) {
		System.out.println(score[ctr]);
	}
	}
	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter how many players you have need ");
		byte numofplayers=scanobj.nextByte();//10
		System.out.println("enter the score of the players ");
		byte score[]=new byte[numofplayers];//array objects declare -u can get a input from the user
		toreadvalues(score,scanobj);//10 bytes// read the values  of team score from the scaner input(get)
        displayarrvalues(score);// display the players score
	}

}
