public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int num=in.nextInt();
	if(num%4==0 && num%100==0 && num%400==0){
		System.out.println("Leap Year");
	}
	else{
		System.out.println("Not Leap year");
	}
			in.close();
		}
