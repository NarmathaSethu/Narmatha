import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());

    in.close();
	}

}
