package level_02;

import java.util.*;
import java.awt.*;

class coloringBook {
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int[] dx = {-1, 1, 0 , 0};
        int[] dy = {0,0,-1,1};
        boolean[][] visited = new boolean[m][n];
        Queue<Point> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;
        
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(picture[i][j] != 0 && visited[i][j] == false){
                    cnt = 0;
                    int tmp = picture[i][j];
                    q.offer(new Point(i,j));
                    while(!q.isEmpty()){
                        Point current = q.poll();
                        for(int k = 0 ; k < 4 ; k++){
                            int x = current.x + dx[k];
                            int y = current.y + dy[k];
                            if(0<= x && x <m && 0<= y && y<n){
                                if(picture[x][y] == tmp && visited[x][y] == false){
                                    q.offer(new Point(x,y));
                                    cnt++;
                                    visited[x][y] = true;
                                }
                            }
                        }
                    }
                    list.add(cnt);
                }
            }
        }

        int[] answer = new int[2];
        Collections.sort(list);
        
        answer[0] = list.size();
        answer[1] = list.get(list.size()-1);
        return answer;
    }
    
    public static void main(String[] args) {
    	coloringBook book = new coloringBook();
    	int[][] picture = {{1, 1, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}};
    	
    	for(int i : book.solution(6, 4, picture)) {
    		System.out.println(i);
    	}
    }
}