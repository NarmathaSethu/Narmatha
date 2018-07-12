public class OTP {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of values in array:");
		int n=in.nextInt();
		int s=0;
		int x=0;
		int d=0;
		int w=0;
		System.out.println("Enter the value of arrays:");
		int []a=new int [10];
		int []b=new int [50];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			int l=String.valueOf(a[i]).length();
			if(l>2){
				if(l>=4){
					int f=a[i];
					a[i]=Integer.valueOf((String.valueOf(a[i]).substring(0,3)));
					a[n]=Integer.valueOf((String.valueOf(f).substring(1)));
					n++;
				}
			}
			else{
				x++;
			}
		}
		if(x==n){
			for(int i=0;i<n;i++){
				a[i]=0;
			}
		}
		else{
			for(int j=0;j<n;j++){
				int e=a[j];
				while(e!=0){
					b[s]=e%10;
					s++;
					e/=10;
				}
			}
				for(int j=0;j<n;j++){
					for(int k=j+1;k<n;k++){
						if(a[j]>a[k]){
							int temp=a[j];
							a[j]=a[k];
							a[k]=temp;
						}
					}
				}
				 d=a[0];
				for(int j=0;j<s;j++){
					for(int k=j+1;k<s;k++){
						if(b[j]>b[k]){
							int temp=b[j];
							b[j]=b[k];
							b[k]=temp;
						}
					}
				}
				if(b[0]!=b[s-1]){
			w=b[0]+b[s-1];
				}
				else{
					w=0;
				}
		}
		System.out.println(d+""+w);
		in.close();
	}

}
