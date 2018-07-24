import java.util.*;
public class Guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int hh=in.nextInt();
	int mm=in.nextInt();
	int c=0,c1=0;
	for(int i=hh;i<=mm;i++){
		c=0;
		for(int j=2;j<=i;j++){
			if(i%j==0){
				c++;
			}
		}
		if(c==1){
			c1++;
		}
	}
	System.out.println(c1);
	in.close();
}
}
