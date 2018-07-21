import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int []a=new int[n];
     for(int i=0;i<n;i++){
    	 a[i]=in.nextInt();
     }
     for(int i=0;i<n;i++){
    	 for(int j=i+1;j<n;j++){
    		if(a[i]==a[j]){
    			a[j]=a[n-1];
    			j--;
    			n--;
    		}
    	 }
     }
     System.out.println(n);
    in.close();
	}
}
