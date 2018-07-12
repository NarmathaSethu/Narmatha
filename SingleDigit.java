public class yy{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int num1=num;
		int c=0;
		int m=0;
		
		while(num1!=0){
			num1=num1/10;
			c++;
		}
		int []a=new int[c];
		int x=0;
		for(int i=c-1;i>=0;i--){
			a[i]=num%10;
			num=num/10;
		}
		int w=c;
		for(int i=0;i<c;i++){
			m=0;
			for(int j=0;j<w-1;j++){
				
				int s=(a[j]-a[j+1]);
				if(s>=0){
					a[j]=s;
				}
				else{
					a[j]=(-s);
				}
				m++;	
		}
		if(m==1){
			x=a[0];
			break;
		}
		else{
			w--;
		}
		}
		System.out.println(x);
		
		
		in.close();
	}
}
