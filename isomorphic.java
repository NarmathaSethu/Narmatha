import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	  String x=in.next();
	  String y=in.next();
	  int c=0;
	  int d=0;
	  String x1="";
	  String y1="";
	  for(int i=0;i<x.length();i++){
		  c=0;
		  for(int j=0;j<x.length();j++){
			  c++;
		  }
		  x1+=c;
	  }
	  for(int i=0;i<y.length();i++){
		  d=0;
		  for(int j=0;j<y.length();j++){
			  d++;
		  }
		  y1+=d;
	  }
	  if(x1.equals(y1)){
		  System.out.println("yes");
	  }
	  else{
		  System.out.println("no");
	  }
    in.close();
	}

}
