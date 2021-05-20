package level_02;

import java.util.*;

public class openChatting {

	public String[] solution(String[] record) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        
        for(int i = 0 ; i < record.length ; i++){
            String[] command = record[i].split(" ");
            
            if(command[0].equals("Enter")){
                list.add(command[1] +"님이 들어왔습니다.");
                map.put(command[1], command[2]);
            }else if(command[0].equals("Leave")){
                list.add(command[1] +"님이 나갔습니다.");
            }else if(command[0].equals("Change")){
                map.put(command[1], command[2]);
            }
        }
        
        answer = new String[list.size()];
        int ans = -1;
        for(int i = 0 ; i < list.size() ; i++){
            int index = list.get(i).indexOf("님"); 
            String uid = list.get(i).substring(0, index);
            
            answer[++ans] = list.get(i).replace(uid, map.get(uid));
        }
        return answer;
    }
	
	
	public static void main(String[] args) {
		String[] str = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		openChatting op = new openChatting();
		String[] ans = op.solution(str);
		
		for(int i = 0 ; i < ans.length ; i++) {
			System.out.println(ans[i]);
		}
	}

}
