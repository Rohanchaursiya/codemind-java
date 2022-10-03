import java.util.Scanner;
class StringMethods{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
    	    int d=0;
    	    for(int i=0;i<s1.length();i++){
    	        char ch=s1.charAt(i);
    	        if(Character.isDigit(ch)){
    	            d+=1;
    	        }
    	    }
    	    if(d==0){
    	        System.out.println("Doesn't contain digit");
    	    }
    	    else{
    	        System.out.println("Contains "+d+" digit");
    	    }
    }
}