package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class studyMap {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] stringArr = br.readLine().toUpperCase().split("");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String key: stringArr) {
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		System.out.println(map);
	}
}
