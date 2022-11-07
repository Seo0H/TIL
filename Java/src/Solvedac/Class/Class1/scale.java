package Solvedac.Class.Class1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class scale {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String scaleRaw = sc.nextLine();		
		String[] scaleRawSplit = scaleRaw.split(" ");
		String inputScale = String.join("", scaleRawSplit);
		
		int inputScaleint =  Integer.parseInt(inputScale);
		int ascending = 12345678;
		int descending = 87654321;
		
		if(inputScaleint == ascending) {
			System.out.println("ascending");
			} else if(inputScaleint == descending) {
			System.out.println("descending");
			} else {
			System.out.println("mixed");
			}
	}

}
