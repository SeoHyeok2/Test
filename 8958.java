import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = sc.next();
		}
		for(int i=0 ; i<n ; i++) {
			int sum = 0;
			String[] str = arr[i].split("X");//'O'문자열만 남기기
			for(int j=0 ; j<str.length ; j++) {//'O'문자열 개수의 합들을 더하기
				sum += str[j].length() * (str[j].length()+1) / 2;
			}
			System.out.println(sum);
		}
		
	}
	
}