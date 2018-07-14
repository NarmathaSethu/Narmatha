import java.util.Scanner;

public class Demo {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the start range");
		int num=in.nextInt();
		System.out.println("Enter the end range");
		int num1=in.nextInt();
		for(int i=num;i<=num1;i++){
			if(i%2==1){
			System.out.println(i);
			}
		}
		in.close();
	}

}
