import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int c=0;
     int []a=new int[n];
     for(int i=0;i<n;i++){
    	 a[i]=in.nextInt();
     }
  for(int i=0;i<n;i++){
	  if(a[i]==i){
		  System.out.print(i+" ");
		  c++;
	  }
  }
  if(c==0){
	  System.out.println("-1");
  }
    in.close();
	}
}
