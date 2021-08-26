import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ascii = 97;
	    for(int i=ascii ; i<=122 ; i++) {
	    	char alpha = (char)i;// 아스키코드 변환
	    	int n = 0;
	    	for(int j=0 ; j<s.length() ; j++) {
	    		if(alpha == s.charAt(j)) { // 알파벳이 단어에 있는 경우
	    			n = 1;
	    			System.out.print(j + " ");
	    			break;
	    		}
	    	}
	    	if(n == 0) System.out.print(-1 + " "); // 알파벳이 단어에 없는 경우
	    }

} 
}