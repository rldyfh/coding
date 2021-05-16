package search;

import java.util.*;
import java.awt.Point;

public class sectionNumber {

	static int[][] a;
	static boolean[][] visit;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int n = 0;
	static Queue<Point> q = new LinkedList<>();
	static ArrayList<Integer> list = new ArrayList<>();
	static int num = 0;
	static int cnt = 0;
	
	public static void BFS() {
		int cnt = 0;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(a[i][j] == 1 && visit[i][j] == false) {
					cnt = 0;
					num++;
					q.offer(new Point(i,j));
					visit[i][j] = true;
					cnt++;
					while(!q.isEmpty()) {
						int nx = q.peek().x;
						int ny = q.peek().y;
						q.poll();
						for(int k = 0 ; k < 4 ; k++) {
							int x = nx + dx[k];
							int y = ny + dy[k];
							if(x >= 0 && y >= 0 && x < n && y < n && a[x][y] == 1 && visit[x][y] == false) {
								q.offer(new Point(x,y));
								visit[x][y] = true;
								cnt++;
							}
						}
					}
					list.add(cnt);
				}
			}
		}
		Collections.sort(list);
		System.out.println(num);
		for(int i : list) {
			System.out.println(i);
		}
	}
	
	public static int DFS(int i, int j) {
		visit[i][j] = true;
		for(int k = 0 ; k < 4 ; k++) {
			int x = i + dx[k];
			int y = j + dy[k];
			if(x >=0 && y >=0 && x<n && y<n && a[x][y] == 1 && visit[x][y] == false) {
				DFS(x, y);
				cnt++;
			}
		}
		return cnt;
	}
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n][n];
		visit = new boolean[n][n];
		
		for(int i=0; i<n; i++){
            String input = sc.next();
            for(int j=0; j<n; j++){
                a[i][j] = input.charAt(j)-'0';
            }
        }
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(a[i][j] == 1 && visit[i][j] == false) {
					num++;
					cnt = 1;
					DFS(i, j);
					list.add(cnt);
				}
			}
		}
		Collections.sort(list);
		System.out.println(num);
		for(int i : list) {
			System.out.println(i);
		}
//		BFS();
	}

}
