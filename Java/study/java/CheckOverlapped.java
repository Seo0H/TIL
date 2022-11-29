package study.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckOverlapped {

	// 리스트 내 중복 요소를 체크하는 방법

	// 1. Set 이용하기
	// 애초에 중복을 허용하지 않는 자료구조에 넣어버리기.
	// 근데 어떤 요소가 줄어들었는지 체크도 되나?
	public static void Set(List<Integer> numList) {
		Set<Integer> numSet = new HashSet<>(numList);

		if (numSet.size() != numList.size()) {
			System.out.println("중복된 요소가 있습니다!");
		}
	}

	// 2. Stream.distinct() 이용
	// Stream.distinct() stream 의 중복을 모두 제거
	// Stream.count()는 stream 사이즈를 리턴
	public static void Stream_distinct(List<Integer> numList) {
		if (numList.size() != numList.stream().distinct().count()) {
			System.out.println("중복된 요소가 있습니다!");
		}
	}


	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1, 1, 2, 3, 4, 5);
		Set(numList);
		Stream_distinct(numList);
	}
}
