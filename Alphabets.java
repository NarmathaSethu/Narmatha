public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.next();
	if(s.matches("[A-Za-z]")){
		System.out.println("Alphabets");
	}
	else{
		System.out.println("Not Alphabets");
	}
			in.close();
		}
