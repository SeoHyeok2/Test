import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		int[] array = new int[n];
		for(int i=0 ; i<n ; i++) {
			array[i] = Integer.valueOf(arr[i]);
		}
		Arrays.sort(array);
		System.out.println(array[0]+" "+array[n-1]);


	}

}