import java.util.*;
public class Guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int x=0;
	int c=0;
	int u=0;
	String []s1=new String[100];
	int []a=new int[n];
	String []s=new String[n];
	for(int i=0;i<n;i++){
		s[i]=in.next();
		a[i]=s[i].length();
	}
	Arrays.sort(a);
	int y=0;
	while(y<a[0]){
    	x=0;
    	c=0;
    	for(int j=0;j<n;j++){
    		s1[x]=s[j].substring(y, y+1);
    		x++;
    	}
    	for(int k=0;k<x-1;k++){
    		if(s1[k].equalsIgnoreCase(s1[k+1])){
    			c++;
    		}
    		}
    	if(c==(x-1)){
    		System.out.print(s1[c]);
    		u++;
    	}
    	else{
    		break;
    	}
    	y++;
	}
	if(u==0){
		System.out.println("No Matching prefix");
	}
	in.close();
}
}
