import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the range:");
		int x=in.nextInt();
		int y=in.nextInt();
		for(int i=x+1;i<y;i++){
			if(i%2==0){
				System.out.println(i+" ");
			}
		}
    in.close();
	}

}
