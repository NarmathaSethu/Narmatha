import java.util.Scanner;

public class Demo {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=in.nextInt();
		System.out.println("Enter the power");
		int p=in.nextInt();
		System.out.println((int)Math.pow(num, p));
		in.close();
	}

}
