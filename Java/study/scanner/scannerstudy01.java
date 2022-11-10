package study.scanner;
import java.util.Scanner;

public class scannerstudy01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		byte a = sc.nextByte();           // byte 형 입력 및 리턴
		short b = sc.nextShort();         // short 형 입력 및 리턴
		int c = sc.nextInt();             // int 형 입력 및 리턴
		long d = sc.nextLong();           // long 형 입력 및 리턴
		                                  
		float e = sc.nextFloat();         // float 입력 및 리턴
		double f = sc.nextDouble();       // double 입력 및 리턴
		                                  
		boolean g = sc.hasNextBoolean();  // boolean 입력 및 리턴
		                                  
		String h = sc.next();             // String 형 입력 및 리턴 (공백을 기준으로 한 단어 읽음) 
		String i = sc.nextLine();         // String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)
		
		//이 중 가장 많이 쓸 것은
		//nextInt(), nextDouble(), next(), nextLine() 

	}

}
