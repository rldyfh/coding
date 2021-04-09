package level_01;

public class gcd {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int large = 0, small = 0;
        
        if(n > m){
            large = n;
            small = m;
        }else {
            large = m;
            small = n;
        }
       
        answer[0] = gcd(large, small);
        answer[1] = large*small/answer[0];
        
        return answer;
    }
    
    public int gcd(int large, int small){
        if(large % small == 0 ){
            return small;
        }else return gcd(small, large%small);
    }

}
