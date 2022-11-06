package Solvedac.Class.Class1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class maximum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for (int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		IntStream maxStream = Arrays.stream(arr);
		int arrMax = maxStream.max().getAsInt();
		int index = 0 ;
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] == arrMax) {
				index = i+1;
			}
		}
		
		System.out.println(arrMax);
		System.out.println(index);
		
	}
	

}
