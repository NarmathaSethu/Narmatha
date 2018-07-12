public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String ch=in.next();
	char ch1=ch.charAt(0);
	if(!Character.isDigit(ch1)){
	if(ch.matches("[aeiouAEIOU]")){
		System.out.println("Vowels");
	}
	else{
		System.out.println("Consonants");
	}
	}
	else{
		System.out.println("Invalid");
	}
			in.close();
		}
