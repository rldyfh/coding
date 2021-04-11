package level_01;

public class secretMap {
	public String[] solution(int n, int[] arr1, int[] arr2) {                 
        String[] answer = new String[n];
        
        
        
        for(int i = 0 ; i < n; i++) {
            String temp = Integer.toBinaryString(arr1[i] | arr2[i]);  
            if(temp.length() < n) {                        
                int cha = n - temp.length();                
                for(int j =0 ; j < cha; j++) {              
                    temp = "0"+temp;
                }
            }
            temp = temp.replace("1", "#");                 
            temp = temp.replace("0", " ");
            answer[i] = temp;
        }
        return answer;
    }
}
