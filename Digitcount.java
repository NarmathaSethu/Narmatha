public class HelloWorld{
    	      public static void main(String []args){
    	       Scanner in=new Scanner(System.in);
    	       int x=in.nextInt();
    	       int c=0;
    	       while(x!=0){
    	           x/=10;
    	           c++;
    	       }
    	       System.out.println(c);
    	       in.close();
    	      }
    	 }
