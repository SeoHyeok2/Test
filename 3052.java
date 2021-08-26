import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0; i<10 ; i++) {//42로 나눈 나머지 배열에 저장
			arr[i] = sc.nextInt() % 42;
		}
		int n=9;
		int result=10;
		for(int i=0; i<10 ; i++) {//나머지가 같을 때마다 10에서 1 빼기
			for(int j=0 ; j<n ; j++) {
				if(arr[i] == arr[i+1+j]) {
					result--;
					break;
				}
			}
			n--;
		}
		System.out.println(result);
		

	}

}