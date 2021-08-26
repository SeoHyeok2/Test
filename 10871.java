import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		
		for(int i=0 ; i<n ; i++) {
			if(Integer.valueOf(arr[i]) < x) {
				System.out.print(arr[i]);
				System.out.print(" ");
			}
		}
		
		}

}
