package Solvedac.Class.Class1;
import java.util.Scanner;

public class A_divide_B {
	
	//Class1-1. A/B
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
	    String input = sc.nextLine();
	    double A = input.charAt(0) - 48; // '0'의 아스키코드 48 빼주기
	    double B = input.charAt(2) - 48;
	    
	    System.out.println(A/B);

	}
	
}
