package study.scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferReader01 {
	
	//예외처리가 필수이다. 튕겨져나오는 예외까지 처리하고싶다면 try~catch문을 이용하자.
	public static void main(String[] args) throws IOException {
		
		//콘솔에서 입력 받을 경우
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//파일에서 입력받았을 경우
		FileReader fr = new FileReader("파일이름.java");
		BufferedReader br_f = new BufferedReader(fr);
		
		//String이 리턴값이기 때문에 형변환이 필수이다. 라인단위로 들어온다.
		int num = Integer.parseInt(br.readLine());
		br.close(); // 입출력 끝나면 닫기.
		
		//파일의 한 줄 한 줄 읽어서 출력
		String line="";
		for (int i = 0; (line = br_f.readLine()) != null; i++) {
			System.out.println(line);
		}
		
	}
}
