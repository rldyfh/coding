package level_01;

class gymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int i = 0, j = 0;
        int temp = n - lost.length;
        
        for(i = 0 ; i < lost.length ; i++){
            for(j = 0 ; j < reserve.length ; j++){
                if(lost[i] == reserve[j]){
                    reserve[j] = -1;
                    lost[i] = -1;
                    temp++;
                    break;
                }
            }
        }
        
        for(i = 0 ; i < lost.length ; i++){
            for(j = 0 ; j < reserve.length ; j++){
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]){
                    reserve[j] = -1;
                    temp++;
                    break;
                }
            }
        }
        answer = temp;
        
        return answer;
    }
}



public class gym_suit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
