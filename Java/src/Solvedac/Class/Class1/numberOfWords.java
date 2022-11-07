package Solvedac.Class.Class1;

import java.util.Scanner;

public class numberOfWords {
	//단어의 개수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] words = sc.nextLine().split(" ");
		
		int wordsCount = words.length;
		
		for(int i=0; i<words.length; i++)
			if(words[i].equals("")) {
				wordsCount -= 1;
			}
		
		System.out.println(wordsCount);
	}

}
