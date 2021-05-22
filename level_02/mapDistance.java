package level_02;

import java.util.*;

class mapDistance {
	
	class Point{
		int x;
		int y;
		int cnt;
		
		public Point(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}
    public int solution(int[][] maps) {
        int answer = -1;
        int i =0, j =0;
        int[] dx = {0,1,-1,0}; // 우 하 상 좌
        int[] dy = {1,0,0,-1};
        Queue<Point> q = new LinkedList<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        
        q.offer(new Point(0,0,1));
        visited[0][0] = true;
        while(!q.isEmpty()) {
        	Point current = q.poll();
        	if(current.x == maps.length-1 && current.y == maps[0].length-1) {
        		return current.cnt;
        	}
        	for(int k = 0 ; k < 4 ; k++) {
        		int x = current.x + dx[k];
        		int y = current.y + dy[k];
        		if(0<=x&&x<maps.length && 0<=y&&y<maps[0].length && maps[x][y] == 1 && visited[x][y] == false) {
        			visited[x][y] = true;
        			q.offer(new Point(x,y, current.cnt+1));
        		}
        	}
        }
        
        return answer;
    }
    

	public static void main(String[] args) {
		int[][] map = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		mapDistance m = new mapDistance();
		System.out.println(m.solution(map));

	}

}
