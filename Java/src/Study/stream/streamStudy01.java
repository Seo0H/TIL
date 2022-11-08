package Study.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class streamStudy01 {
	public static void main(String[] args) {
		// stream배열이나 컬렉션(List, Set, Map)으로 원하는 값을 얻을 때
		// for문 도배를 방지하기 위해 나온 개념

		// 스트림 선언: 배열, 컬렉션(list, set, map) 등을 스트림 형태로 만들기
		// 스트림 가공 : 스트림을 필요한 형태로 가공하기
		// 스트림 반환 : 가공한 값을 원하는 형태로 가져오기

		int[] arr = new int[]{5,82,68,41,15,1,23,45,81};
		
		//스트림 생성
		IntStream stream1 = Arrays.stream(arr);
		//stream1.forEach(e -> System.out.println(e));
		//System.out.println();
		System.out.println(stream1.max().getAsInt());
		
		

	}
}
