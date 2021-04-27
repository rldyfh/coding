package level_02;

public class compress {
	public int solution(String s) {
        int answer = s.length();
        
        if(answer == 1) return 1;
        for(int i = 1 ; i <= s.length() ; i++){
            String comp = s.substring(0, i);
            int cnt = 1;
            String str = "";
            for(int j = i ; j < s.length() ; j = j+i){
                String tmp = s.substring(j, j+i < s.length()?j+i:s.length());
                if(tmp.equals(comp)){
                    cnt++;
                }else{
                    if(cnt == 1) str += comp;
                    else {
                        str += cnt;
                        str += comp;
                    }
                    cnt = 1;
                    comp = tmp;
                }
            }
            if(cnt == 1) str += comp;
            else {
                str += cnt;
                str += comp;
            }
            if(str.length() < answer)
                answer = str.length();
        }
        return answer;
    }
	public static void main(String[] args) {
		compress c = new compress();
		int a = c.solution("aabbcc");
		System.out.println(a);
	}
}
