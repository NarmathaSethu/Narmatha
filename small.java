import java.util.*;
public class IO {
		public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String x=in.next();
		int k=in.nextInt();
		int []a=new int[x.length()];
		int y=0;
		int s=0;
		int f=k;
		ArrayList<Integer> al=new ArrayList<Integer>();
		if(k!=0){
		for(int i=0;i<x.length()-(k-1);i++){
			a[y]=Integer.valueOf(x.substring(s,f));
			y++;
			s++;
			f++;
		}
		for(int i=0;i<y;i++){
			al.add(a[i]);
		}
		System.out.println(Collections.min(al));
		}
		else{
			System.out.println(x);
		}
		in.close();
		}
		}
