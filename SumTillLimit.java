public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=in.nextInt();
	}
	int lim=in.nextInt();
	int sum=0;
	for(int i=0;i<lim;i++){
		sum+=a[i];
	}
	System.out.println(sum);
			in.close();
		}
