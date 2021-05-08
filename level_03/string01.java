package level_03;

import java.util.HashMap;

public class string01 {
	public int solution(String s) {
        int answer = 0;
        String str = "";
        HashMap<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        for(int i = 0 ; i <= s.length() ; i++){
            for(int j = i+1 ; j <= s.length() ; j++){
                String tmp = s.substring(i, j);
                try{
                if(map.containsKey(tmp)){ 
                    str += map.get(tmp);
                    i = j-1;
                    break;
                }else if(0 <= Integer.parseInt(tmp) && Integer.parseInt(tmp) <= 9){
                    str += tmp;
                    break;
                }
                }catch(Exception e){
                    continue;
                }
            }
        }
        answer = Integer.parseInt(str);

        return answer;
    }
}
