package level_02;

import java.util.*;
	
public class tuple {

	
	public int[] solution(String s) {
        String[] str = s.substring(2, s.length()-2).replace("},{", "/").split("/");
        ArrayList<Integer> list = new ArrayList<>();
        
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String s1, String s2){
                return s1.length() - s2.length();
            }
        });
        
        for(String tmp : str){
            String[] s1 = tmp.split(",");
            for(int i = 0 ; i < s1.length ; i++){
                int num = Integer.valueOf(s1[i]);
                
                if(!list.contains(num)){
                    list.add(num);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            answer[i] = list.get(i);
        }
        
    
        return answer;
    }
}
