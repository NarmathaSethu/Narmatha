import java.util.*;
public class IO {
		public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int k=in.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		int []a=new int[k];
		for(int i=0;i<k;i++){
			a[i]=in.nextInt();
			al.add(a[i]);
		}
		System.out.println(Collections.max(al));
		in.close();
		}
		}
