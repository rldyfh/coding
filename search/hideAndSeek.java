package search;

import java.util.*;


public class hideAndSeek {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int[] check = new int[100001];
		int N = sc.nextInt();
		int K = sc.nextInt();
		if(N == K) System.out.println(0);
		else {
		queue.add(N);
		check[N] = 0;
		while(!queue.isEmpty()) {
			int tmpIndex = queue.poll();
			int nextIndex = 0;
				for(int i = 0 ; i < 3 ; i++) {
				if(i == 0) {
					nextIndex = tmpIndex - 1;
				}else if(i == 1) {
					nextIndex = tmpIndex + 1;
				}else {
					nextIndex = tmpIndex * 2;
				}
					
				if(tmpIndex == K) {
					System.out.println(check[tmpIndex]);	
					break;
				}
				if(0 <= nextIndex && nextIndex < check.length && check[nextIndex] == 0) {
					queue.add(nextIndex);
					check[nextIndex] = check[tmpIndex] + 1;
				}
			}
		}
		}
	}
}

