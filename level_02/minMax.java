package level_02;

import java.util.*;

public class minMax {
	public String solution(String s) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();
        
        String[] str = s.split(" ");
        for(int i = 0 ; i < str.length ; i++){
            list.add(Integer.parseInt(str[i]));
        }
        Collections.sort(list);
        answer = String.valueOf(list.get(0)) + " " + String.valueOf(list.get(list.size()-1));
        
        
        return answer;
    }

}
