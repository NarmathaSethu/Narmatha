import java.util.Scanner;

public class Demo {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=in.nextInt();
		int c=0;
		for(int i=2;i<=num;i++){
			if(num%i==0){
				c++;
			}
		}
		if(c==1){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not prime");
		}
		in.close();
	}

}
