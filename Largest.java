import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int []a=new int[n];
     for(int i=0;i<n;i++){
    	 a[i]=in.nextInt();
     }
    Arrays.sort(a);
    for(int i=n-1;i>=0;i--){
    	System.out.print(a[i]+"");
    }
    in.close();
	}
}
