import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	 String str=in.next();
	 double l=str.length();
	 int sum=0;
	 int num=Integer.valueOf(str);
     for(int i=0;i<l;i++){
    	 sum+=Math.pow(Integer.valueOf(str.substring(i,i+1)), l);
     }
    	if(num==sum){
    		System.out.println("Amstrong number");
    	} 
    	else{
    		System.out.println("Not Amstrong Number");
    	}
    in.close();
	}

}
