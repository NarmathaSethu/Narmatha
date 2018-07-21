import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	int num1=in.nextInt();
	int num2=in.nextInt();
	int sum=0;
	for(int i=num1;i<=num2;i++){
		sum=0;
		int l=(String.valueOf(i)).length();
		for(int j=0;j<l;j++){
			sum+=Math.pow(Double.valueOf(String.valueOf(i).substring(j,j+1)),l);
		}
		if(sum==i){
			System.out.println(i+" ");
		}
	}
    in.close();
	}

}
