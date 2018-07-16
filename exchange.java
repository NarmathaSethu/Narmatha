import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	  String str=in.next();
	  String x="";
	  char ch[]=str.toCharArray();
	  if(str.length()%2==0){
	  for(int i=0,j=1;i<ch.length;i+=2,j+=2){
		  x+=(ch[j]+""+ch[i]);
	  }
	  }
	  else{
		  for(int i=0,j=1;i<ch.length-1;i+=2,j+=2){
			  x+=(ch[j]+""+ch[i]);
		  }
		  x+=ch[ch.length-1];
	  }
	 System.out.println(x);
    in.close();
	}

}
