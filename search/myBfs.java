package search;

import java.util.*;

public class myBfs {
	
	private int V;
	private int[][] map;
	private boolean[] visit;
	public myBfs(int v) {
		this.V = v;
		visit = new boolean[V+1];
	}
	
	public void BFS(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		visit[i] = true;
		
		while(!q.isEmpty()) {
			int tmp = q.poll();
			System.out.println(tmp + "");
			for(int j = 1 ; j < V+1 ; j++) {
				if(map[tmp][j] == 1 && !visit[j]) {
					q.offer(j);
					visit[j] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		

	}

}
