package com.weightwatchers.generalproblems;

import java.util.Scanner;

public class ReverseDemo {



	public static void main(String[] args) {

		System.out.print("Enter a Line:");    //user input
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		ReverseDemo reverseDemo = new ReverseDemo();
		String reveresedLine = reverseDemo.reverseEverything(line.trim());
		System.out.println("After Reversion : "+reveresedLine);

	}

	private static String reverseWord(String word){
		String reversedWord= "";
		char [] charArray = word.toCharArray();
		for(int i = word.length()-1;i>=0;i--){
			reversedWord+=charArray[i];
		}
		return reversedWord;
	}

	private String reverseEverything(String line) {

		String reversedLine = "";              //Boundary Checking for an empty String
		String reversedWord = "";
		if(line.length()==0){
			reversedLine = "Empty String Entered";
		}

		else if(line.length()==1){             //Checks if it's a one letter string
			reversedLine = line;
		}

		else{
			String tempLine = line.toLowerCase();
			String [] words = tempLine.split(" ");
			for(int i =words.length-1;i>=0;i--){
				reversedWord = reverseWord(words[i]);
				reversedLine+=reversedWord;
				reversedLine+=" ";

			}
		}
		return reversedLine;
	}
}
