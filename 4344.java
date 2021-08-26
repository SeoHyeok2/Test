import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.nextLine();
		for(int i=0 ; i<c ; i++) {
			String s = sc.nextLine();
		    String[] arr = s.split(" ");
		    int n = Integer.valueOf(arr[0]);
			double sum = 0;
			for(int j=1; j<arr.length ; j++) { // 합 구하기
				sum += Integer.valueOf(arr[j]);
			}
			double m = sum / n; // 평균 구하기
			double num = 0;
			for(int k=1 ; k<=n ; k++) { //평균을 넘는 학생 수 구하기
				if(Integer.valueOf(arr[k]) > m) {
					num += 1;
				}
			}
			System.out.printf("%.3f%%\n",(num/n)*100); //소수점 셋째자리까지 출력
		}
		sc.close();
	}
}