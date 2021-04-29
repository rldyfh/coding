package level_02;

public class carpet {
	public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int i = 0;
        int tmp = 0;
        answer = new int[2];
        for(i = 1 ; i <= yellow ; i++ ){
            if(yellow % i == 0){
                tmp = yellow / i;  
            }else continue;
            if(tmp + 2 == brown /2 -i && i+2 == brown/2 -tmp){
                answer[0] = tmp+2;
                answer[1] = i+2;
                break;
            }
        }
  
        return answer;
    }
}
