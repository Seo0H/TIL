package Solvedac.Class.Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class studingVoca {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] stringArr = br.readLine().toUpperCase().split("");

		Map<String, Integer> countMap = new HashMap<String, Integer>();
		
		//각 단어 별 중복 값 카운트 -> Map 에 담기
		for (String str : stringArr) {
			countMap.put(str, countMap.getOrDefault(str, 0) + 1);
		}

		// 가장 큰 val을 가진 key 값 모두 찾기
		int maxVal = Collections.max(countMap.values());
		List<String> maxKeyList = new ArrayList<String>();
		
		System.out.println("map 크기: "+ countMap.size() +" / 중복횟수 max : "+ maxVal);

		// 두가지의 경우가 각각 참, 거짓 일 경우 - 총 4가지의 경우의 수 생각.
		// 경우 1. map size 가 1인 경우 -> 첫번째 key 출력
		// 경우 2. 같은 val을 가진 key가 여러개인 경우 -> ? 출력
		boolean count = false;

		for (String key : countMap.keySet()) {
			int val = countMap.get(key);

			// 경우 1. map size 가 1인 경우 -> 첫번째 key 출력
			if (countMap.size() == 1) {
				System.out.println(key);
				count = true;
				break;

			// 경우 1. map size 가 1이 아닌 경우 -> 가장 큰 val을 가진 key를 maxKeyList에 담는다.
			} else if (val == maxVal) {
				maxKeyList.add(key);
			}
		}
		
		// 경우 1-1을 돌지 않았을 경우에만, 경우 2 if문 실행
		if(count == false) {
			// 경우 2. 같은 val을 가진 key가 여러개인 경우 -> ? 출력
			if (maxKeyList.size() > 1) {
			System.out.println("?");

			// 경우 2. 같은 val을 가진 key가 1개인 경우 -> 해당 key 출력
			} else if (maxKeyList.isEmpty() == false) {
			System.out.println(maxKeyList.get(0));
			}
		}

	}
}