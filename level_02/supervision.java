package level_02;

import java.util.*;


public class supervision {
	
	static int[] map;
	static int cnt = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 시험장 개수
		
		map = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			map[i] = sc.nextInt();
		}
		int fs = sc.nextInt(); // 총 감독
		int ss = sc.nextInt(); // 부 감독
		
		for(int i = 0 ; i < N ; i++) {
			int total = 0;
			total += fs;
			cnt++;
			while(total < map[i]) {
				total += ss;
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
