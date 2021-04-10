package level_01;

public class hashad {
	public boolean solution(int x) {
        boolean answer = true;
        int tmp = 0;
        
        String str = String.valueOf(x);
        for(int i = 0 ; i< str.length() ; i++){
            tmp += Character.getNumericValue(str.charAt(i));
        }
        if(x % tmp == 0 ) return true;
        else return false;
    }
}
