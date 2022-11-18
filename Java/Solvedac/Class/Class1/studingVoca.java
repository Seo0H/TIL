package Solvedac.Class.Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class studingVoca {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] stringArr = br.readLine().toUpperCase().split("");
		
		List<String> stringList =  Arrays.stream(stringArr)
										  .collect(Collectors.toList());
		
		Map<String,Integer> result = stringList.stream()
							.filter(i->Collections.frequency(stringList, i) > 1)
							.collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
		
		System.out.println(result);
		if(result.size()>1) {
			System.out.println('?');
		}else {
			String[] r = result.keySet().toString().split("");
			System.out.println(r[1]);
		}
	}
}
