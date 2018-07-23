import java.util.*;
public class Vuram_pattern {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		int []a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			al.add(a[i]);
		}
		Collections.sort(al);
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		
in.close();
	}

}
