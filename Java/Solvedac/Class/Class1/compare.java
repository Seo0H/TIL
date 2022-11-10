package Solvedac.Class.Class1;

import java.util.Scanner;

public class compare {
	
	//Class1-2. 두 수 비교하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 String input = sc.nextLine();
		 String replaceInput = input.replace(" ", "#");
		 String[] splitInput = replaceInput.split("#");
		 
		 int A = Integer.parseInt(splitInput[0]);
		 int B = Integer.parseInt(splitInput[1]);
		 
		 if (A > B) {
			 System.out.println('>');
		 } else if ( A < B) {
			 System.out.println('<');
		 } else {
			 System.out.println("==");			 
		 }
	}
}
