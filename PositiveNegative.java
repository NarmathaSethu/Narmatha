 public static void main(String args[]) {
       Scanner in=new Scanner(System.in);
       int num=in.nextInt();
       if(num==0){
           System.out.println("Zero");
       }
       else if(num>0){
           System.out.println("Positive");
       }
       else{
           System.out.println("Negative");
       }
       in.close();
    }
