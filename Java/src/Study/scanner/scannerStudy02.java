package Study.scanner;

import java.util.Scanner;

public class scannerStudy02 {

	
	
	public static void main(String[] args) {
		scannerStudy02.nextMethod();
		scannerStudy02.nextLineMethod();
	}
	
	static void nextMethod () {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		String str4 = sc.next();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
//		input -> my cat so cute
//		output ->
//		my
//		cat
//		so
//		cute
		
	}
	
	static void nextLineMethod( ) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(str);
		
//		input -> my cat so cute
//		output -> my cat so cute
		
	}

}
