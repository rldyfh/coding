package search;

import java.util.*;

public class myDfs {

	static ArrayList<Integer>[] a;
	static boolean[] visit;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정점의 수
		int m = sc.nextInt(); // 간선의 수
		int start = sc.nextInt(); // 시작할 정점

		a = new ArrayList[n+1];
		visit = new boolean[n+1];
		
		for(int i = 1 ; i <= n ; i++) {
			a[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0 ; i< m ; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			a[u].add(v);
			a[v].add(u); 
		}
		dfs(start);
		System.out.println("");
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("visit :" + Arrays.toString(visit));
	}
	
	public static void dfs(int x) {
		visit[x] = true;
		System.out.println("visit: " + x);
		for(int y : a[x]) {
			if(visit[y] == false) {
				dfs(y);
			}
		}
	}

}
