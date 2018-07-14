import java.util.Scanner;

public class Demo {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		String num=in.next();
		StringBuffer sb=new StringBuffer(num);
		String s=(sb.reverse()).toString();
		if(num.equals(s)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
		in.close();
	}

}
