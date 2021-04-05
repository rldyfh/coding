package level_01;

import java.util.*;

class KOrder {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0, j = 0;
        
        for(i = 0 ; i < commands.length ; i++){
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];
            for(j = 0 ; j < temp.length ; j++){
                temp[j] = array[j + commands[i][0]-1];
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] -1];
        }
        
        
        return answer;
    }
}


public class k_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
