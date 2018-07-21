import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int c=0;
     int d=0;
     HashSet<Integer> hs=new HashSet<Integer>();
     int []a=new int[n];
     for(int i=0;i<n;i++){
    	 a[i]=in.nextInt();
     }
     for(int i=0;i<n;i++){
    	 c=0;
    	 for(int j=i;j<n;j++){
    		if(a[i]==a[j]){
    			c++;
    		}
    	 }
    	 if(c>1){
    	 hs.add(a[i]);
    	 }
    	 else{
    		 d++;
    	 }
     }
     Iterator<Integer> itr=hs.iterator();
     while(itr.hasNext()){
    	 System.out.print(itr.next()+" ");
     }
     if(d==n){
    	 System.out.println("Unique");
     }
    in.close();
	}
}
