package search;

import java.util.*;

public class blackJack {
	
	public static void main(String[] args) {
		int n = 5;
		int m = 21;
		int answer = 0;
		int result = 0 ;
		for(int i = 0 ; i < n ; i++) {
			for(int j = i+1 ; j < n ; j++) {
				for(int k = j+1 ; k < n ; k++) {
					int sum = i + j + k;
					if(sum <= m && sum > result) {
						result = sum;
					}
					
				}
			}
		}
		System.out.println(result);
	}

}
