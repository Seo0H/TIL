package Solvedac.Class.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.stream.Stream;

public class average {
	//Class 1 : 1546번 평균
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//시험 본 과목의 개수 N
		BigDecimal N = new BigDecimal(br.readLine());
		String input = br.readLine();
		
		//문자열->int[] 처리 부분
		int[] splitInput = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		
		//최고점을 구하는 과정
		Arrays.sort(splitInput);
		BigDecimal maxVal = new BigDecimal(splitInput[splitInput.length-1]);
		
		BigDecimal hundred = new BigDecimal("100");
		BigDecimal sumAll = new BigDecimal("0") ;
		
		//계산 과정
		for(int i=0; i<splitInput.length; i++){
			BigDecimal calVal = new BigDecimal(splitInput[i]).divide(maxVal, 6, RoundingMode.HALF_UP).multiply(hundred);
			sumAll = sumAll.add(calVal);
		}
		BigDecimal average = sumAll.divide(N, 6, RoundingMode.HALF_UP);
		System.out.println(average);
	}
}
