package level_03;

import java.util.*;

class Genres {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < genres.length ; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        ArrayList<String> keySetList = new ArrayList<>(map.keySet());
        
        Collections.sort(keySetList, (o1,o2)->(map.get(o2).compareTo(map.get(o1)))); 
        
        for(int i = 0 ; i < keySetList.size() ; i++){
            String tempGenre = keySetList.get(i);
            int firstMax = 0;
            int secondMax = 0;
            int maxTmp = 0;
            
            for(int j = 0 ; j < genres.length ; j++){
                if(tempGenre.equals(genres[j])){
                    if(plays[j] > maxTmp){
                        maxTmp = plays[j];
                        firstMax = j;
                    }
                }
            }
            maxTmp = -1;
            for(int j = 0 ; j < genres.length ; j++){
                if(tempGenre.equals(genres[j])){
                    if(j != firstMax && plays[j] > maxTmp){
                        maxTmp = plays[j];
                        secondMax = j;
                    }
                }
            }
            list.add(firstMax);
            if(maxTmp != -1) list.add(secondMax);
        }
        answer = new int[list.size()];
        for(int k = 0 ; k < list.size() ; k++){
            answer[k] = list.get(k);
        }
        return answer;
    }
}
