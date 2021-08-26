import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();		
		int b = sc.nextInt();		
		int c = sc.nextInt();
		int result = a * b * c;//세 수의 곱
		int length = (int)(Math.log10(result)+1);//숫자의 길이
		int[] arr = new int[length];
		int[] num = new int[10];
		for(int i=0 ; i<length ; i++) {//각 자리 숫자 구하기
			arr[i] = result%10;
			result /= 10;
		}
		for(int i=0 ; i<length ; i++) {//숫자 나온 횟수 구하기
			num[arr[i]]++;
		}
		for(int i=0 ; i<num.length ; i++) {
			System.out.println(num[i]);;
		}
		
	}

}