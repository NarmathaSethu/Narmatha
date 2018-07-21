import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
       String u=in.nextLine();
       String s[]=u.split(" ");
       for(int i=0;i<s.length;i++){
    	   String x=s[i].toLowerCase();
    	   System.out.print(x.substring(0, 1).toUpperCase()+x.substring(1)+" ");
       }
    in.close();
	}

}
