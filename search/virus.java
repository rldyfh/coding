package search;

import java.util.*;

public class virus {

	static int node[][];
	static boolean check[];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		
		node = new int[n+1][n+1];
		check = new boolean[n+1];
		for(int i = 0 ; i < p ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			node[a][b] = 1;
			node[b][a] = 1;
		}
		BFS(1);

	}
	
	public static void BFS(int start) {
		Queue<Integer> q = new LinkedList<>();
		check[start] = true;
		int cnt = 0;
		q.offer(start);
		
		while(!q.isEmpty()) {
			int x = q.poll();
			for(int i = 1 ; i < node.length ; i++) {
				if(node[x][i] == 1 && check[i] == false) {
					q.offer(i);
					check[i] = true;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
