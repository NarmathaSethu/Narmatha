import java.util.Arrays;
import java.util.Scanner;
public class Vuram_pattern {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[n/2]);
in.close();
	}

}
