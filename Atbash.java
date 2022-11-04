import java.util.HashMap;

public class Atbash {
	public static void main(String args[]) {		
		System.out.println(atbash("apple"));
		System.out.println(atbash("Hello world!"));
		System.out.println(atbash("Christmas is the 25th of December"));

	}
	
	public static String atbash(String str){
		HashMap<Character, Character> map = new HashMap<>();
		
		Character c;
		Character m = 'z';

	    for(c = 'a'; c <= 'z'; c++) {
	    	map.put(c, m);
	    	m--;
	    }
	    char[] atbash = new char[str.length()];
	    char[] strCh = str.toCharArray();
	    int i = 0;
	    for(char ch: strCh) {
	    	if(Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z') {
		    	if(Character.isUpperCase(ch)) {
		    		atbash[i] = Character.toUpperCase(map.get(Character.toLowerCase(ch)));
		    	}else {
		    		atbash[i] = map.get(ch);
		    	}
	    	}else {
	    		atbash[i] = ch;
	    	}
	    	i++;	    	
	    }
	    String atbashStr = new String(atbash);  	    

		return atbashStr;
		
	}


}
