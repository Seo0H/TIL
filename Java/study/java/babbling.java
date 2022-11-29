package study.java;

import java.util.Arrays;

public class babbling {
	
	
	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		
		int answer = 0;
		
		for(int i=0; i<babbling.length ; i++){
            babbling[i] = babbling[i].replace("aya"," ");
            babbling[i] = babbling[i].replace("ye"," ");   
            babbling[i] = babbling[i].replace("woo"," ");   
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].trim();
            
            if (babbling[i].isEmpty()){
                answer ++;
            }
		}
		System.out.println(answer);
		System.out.println(Arrays.toString(babbling));
	}

}
