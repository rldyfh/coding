package level_02;

import java.util.*;

public class skillTree {
	public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int k = 0, i=0, j= 0;
        ArrayList<Character> list = new ArrayList<>();
        
        for(i = 0 ; i < skill.length() ; i++){
            list.add(skill.charAt(i));
        }
        
        for(i = 0 ; i < skill_trees.length ; i++){
            char[] arr = skill_trees[i].toCharArray();
            for(j = 0 ; j < arr.length ; j++){
                if(!list.contains(arr[j])){
                    skill_trees[i] = skill_trees[i].replace(String.valueOf(arr[j]) ,"");
                }
            }
            
            for(k = 0 ; k < skill_trees[i].length() ; k++){
                if(list.get(k) == skill_trees[i].charAt(k)) continue;
                else break;
            }
            if(k == skill_trees[i].length()) answer++;
        }
        

        return answer;
    }

}
