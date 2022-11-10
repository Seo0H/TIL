package Solvedac.Class.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Modulo {
	//3052. 나머지
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//input 담아서 Str -> int 로 바꾸는 과정
		int[] A = new int[10];
		for(int i =0; i<10; i++)
			A[i] = Integer.parseInt(br.readLine());
		
		//나머지 LIST
		List<Integer> rest = new ArrayList<>();		
		for(int i=0; i<A.length; i++) {
			rest.add(A[i]%42);
		}
		
		//중복값 제거
		Set<Integer> nonduplicates = new HashSet<>(rest);
		System.out.println(nonduplicates.size());
		}
	}
