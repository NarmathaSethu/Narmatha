import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	  String s[]={"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
	  String num=in.next();
	  for(int i=0;i<20;i++){
		  if(num.equals(s[i])){
			  System.out.println(i+1);
		  }
	  }
    in.close();
	}

}
