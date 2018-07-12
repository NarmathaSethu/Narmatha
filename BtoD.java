public class BtoD {
	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the Binary Value");
    String str=in.next();
    int sum=0;
    double sum1=0;
    int pos=0;
    for(int i=0;i<str.length();i++){
    	if(str.charAt(i)==('.')){
    		pos=i;
    		break;
    	}
    }
    if(pos!=0){
    int l1=(str.substring(0, pos)).length();
    int []a=new int[l1];
    int x=Integer.valueOf(str.substring(0, pos));
    int l2=(str.substring(pos+1,str.length())).length();
    int []b=new int[l2];
    int y=Integer.valueOf(str.substring(pos+1,str.length()));
    for(int i=0;i<l1;i++){
    	a[i]=x%10;
    	sum=sum+((int)(a[i]*(Math.pow(2.0, i))));
    	x/=10;
    }
    int d=l2;
    for(int i=l2-1;i>=0;i--){
    	b[i]=(int)y%10;
    	sum1=sum1+(b[i]*(Math.pow(2.0, -d)));
    	d--;
    	y/=10;
    }
    System.out.println(sum+sum1);
    }
    else{
    	int x=Integer.valueOf(str);
    	int []a=new int[str.length()];
    	 for(int i=0;i<str.length();i++){
    	    	a[i]=x%10;
    	    	sum=sum+((int)(a[i]*(Math.pow(2.0, i))));
    	    	x/=10;
    	    }
    	 System.out.println(sum);
    }
    in.close();
	}
