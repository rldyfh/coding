package search;

import java.util.*;
import java.awt.Point;

public class tomato {
	
	
	static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { -1, 1, 0, 0 };
    static int M;
    static int N;
    static int[][] tomato;
    static Queue<Point> queue = new LinkedList<>();
	
	
	public static int BFS() {
		int result = 0;
		while(!queue.isEmpty()) {
			Point p = queue.poll();
			for(int k = 0 ; k < 4 ; k++) {
				int x = p.x + dx[k];
				int y = p.y + dy[k];
				if(0<=x && x< N && 0<=y && y <M && tomato[x][y] == 0) {
					tomato[x][y] = tomato[p.x][p.y] + 1;
					queue.add(new Point(x,y));
					result = tomato[x][y];
				}
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < M ; j++) {
				if(tomato[i][j] == 0) result = -1;
			}
		}
		
		if(result <= 0) return result;
		else return result - 1;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
        tomato = new int[N][M];
        for(int i = 0 ; i < N ; i++) {
        	for(int j = 0 ; j < M ; j++) {
        		tomato[i][j] = sc.nextInt();
        		if(tomato[i][j] == 1) queue.add(new Point(i, j));
        	}
        }
        System.out.println(BFS());
	}

}
