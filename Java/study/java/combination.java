package study.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination {
	
	static StringBuilder sb = new StringBuilder();
	static List<Object> testArr = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		int[] arr = {1,2,3};
		boolean visited[] = new boolean[arr.length];
		for(int i=0; i<arr.length; i++) {
			combination(arr, visited, 0, arr.length, i+1);
		}
		
		System.out.println(testArr);
	}
	
	//arr[] : 뽑고자 하는 배열
	//visited[] : 배열의 방문여부 탐색
	//start: 현재 탐색하고 있는 index
	//arrLen: 배열의 길이
	//r: 뽑으려고 하는 조합의 개수
	static void combination(int arr[], boolean visited[], int start, int arrLen, int r) throws IOException {
		
		if(r==0) {
			print(arr, visited, arrLen);
			return;
		}
		
		for(int i=start; i<arrLen; i++) {
			visited[i]=true;
			combination(arr,visited,i+1,arrLen,r-1);
			visited[i]=false;
			
		}
	}
	
	static void print(int arr[], boolean visited[], int arrLen) throws IOException {
		sb.setLength(0);
		for(int i=0; i<arrLen; i++) {
			if(visited[i]) {
				sb.append(arr[i]);
			}
			testArr.add(sb);
		}

	}

}
