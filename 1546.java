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
		int[] ary = new int[arr.length];
		int sum = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			ary[i] = Integer.valueOf(arr[i]);
		}
		Arrays.sort(ary);
		int m = ary[arr.length-1];
		
		for(int i=0 ; i<n ; i++) {
			sum += ary[i];
		}
		
		System.out.println((double)sum / m * 100 / n);
	}
}