package level_02;

import java.util.*;

public class nextBigNumber {
	
	public static int solution(int n) {
        int answer = 0;
        int cnt = 0;
        String str = Integer.toBinaryString(n); // "1001110"
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '1' ) cnt++;
        }
        
        do{
            int cnt2 = 0;
            n++;
            String tmp = Integer.toBinaryString(n);
            for(int i = 0 ; i < tmp.length() ; i++){
                if(tmp.charAt(i) == '1') cnt2++;
            }
            if(cnt2 == cnt){
                answer = n;
                break;
            }
        }while(true);
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(nextBigNumber.solution(n));
		

	}

}
