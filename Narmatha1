public class yyy {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=in.nextLine();
		System.out.println("Enter the number");
		int num=in.nextInt();
		String []s=str.split(" ");
		int first=num/10;
		int second=num%10;
		if(s[second-1].length() %2 ==0){
			int h=(s[second-1].length())/2;
			StringBuffer sb=new StringBuffer(s[second-1].substring(0, h));
			String x=sb.reverse().toString();
			String z=s[second-1].substring(h/2+1, s[second-1].length());
			System.out.print(z+x);
		}
		else{
			int h=(s[second-1].length())/2;
			StringBuffer sb=new StringBuffer(s[second-1].substring(0, h+1));
			String x=sb.reverse().toString();
			String z=s[second-1].substring(h);
			System.out.print(z+x);
		}
		if(s[first-1].length() %2 ==0){
			int h=(s[first-1].length())/2;
			StringBuffer sb=new StringBuffer(s[first-1].substring(0, h));
			String x=sb.reverse().toString();
			String z=s[first-1].substring(h, s[first-1].length());
			System.out.print(" "+z+x);
		}
		else{
			int h=(s[first-1].length())/2;
			StringBuffer sb=new StringBuffer(s[first-1].substring(0, h+1));
			String x=sb.reverse().toString();
			String z=s[first-1].substring(h);
			System.out.print(" "+z+x);
		}
		
in.close();
	}
}
