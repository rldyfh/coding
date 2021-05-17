package search;

import java.awt.Point;
import java.util.*;

public class worm {

	static int[] dx = {-1, 1, 0 , 0};
	static int[] dy = {0, 0, -1, 1};
	static boolean[][] visit;
	static int[][] map;
	static int n;
	static int m;
	static int l;
	static Queue<Point> q = new LinkedList<>();
	static int cnt = 0;
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void BFS(int i, int j) {
		cnt++;
		q.offer(new Point(i, j));
		
		while(!q.isEmpty()) {
			Point crt = q.poll();
			visit[crt.x][crt.y] = true;
			for(int k = 0 ; k < 4 ; k++) {
				int x = crt.x + dx[k];
				int y = crt.y + dy[k];
				if(x >=0 && y >= 0 && x < n && y < m && map[x][y] == 1 && visit[x][y] == false) {
					q.offer(new Point(x, y));
				}
			}
		}
	}
	
	public static void DFS(int i , int j) {
		visit[i][j] = true;
		Point crt = new Point(i, j);
		for(int k = 0 ; k < 4 ; k++) {
			int x = crt.x + dx[k];
			int y = crt.y + dy[k];
			if(x >=0 && y >= 0 && x < n && y < m && map[x][y] == 1 && visit[x][y] == false) {
				DFS(x, y);		
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int k = 0 ; k < T ; k++) {
			n = sc.nextInt();
			m = sc.nextInt();
			l = sc.nextInt();
			map = new int[n][m];
			visit = new boolean[n][m];
			
			for(int i = 0 ; i < n ; i++) {
				for(int j =0 ; j < m ; j ++) {
					map[i][j] = 0;
				}
			}	
		
			for(int i = 0 ; i < l ; i++) {
				int p = sc.nextInt();
				int q = sc.nextInt();
				map[p][q] = 1;
			}
		
			for(int i =0 ; i < n ; i++) {
				for(int j = 0 ; j < m ; j++) {
					if(map[i][j] == 1 && visit[i][j] == false) {
//						BFS(i , j);
						
						//dfs
						DFS(i, j);
						cnt++;
					}
				}
			}
			list.add(cnt);
			cnt = 0;
		}
		for(int i : list) {
			System.out.println(i);
		}

	}

}
