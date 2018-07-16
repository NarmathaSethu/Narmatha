import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the range:");
		int x=in.nextInt();
		int c=0;
		int y=in.nextInt();
		for(int i=x;i<=y;i++){
			c=0;
			for(int j=2;j<=i;j++){
			if(i%j==0){
				c++;
			}
			}
			if(c==1){
				System.out.println(i+" ");
			}
		}

    in.close();
	}

}
