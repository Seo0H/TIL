package Study.scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferReader02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int i = Integer.parseInt(br.readLine());
		
		System.out.println("String : " + s);
		System.out.println("int : " + i);
	}
}
