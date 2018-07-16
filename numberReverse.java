import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int num=in.nextInt();
	    int x=String.valueOf(num).length();
	    int temp=0;
        for(int i=0;i<x;i++){
        	int rem=num%10;
        	temp=(temp*10)+rem;
        	num/=10;
        }
        System.out.println(temp);
    in.close();
	}

}
