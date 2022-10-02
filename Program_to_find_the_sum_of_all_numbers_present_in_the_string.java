import java.util.Scanner;
class StringMethods{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
    	int sum=0;
    	for(int i=0;i<s1.length();i++)
    	{
    		char ch=s1.charAt(i);
    		if(Character.isDigit(ch)){
    		   int b = Integer.parseInt(String.valueOf(ch));
    		   sum=sum+b;
    		}
    	}
    	System.out.print(sum);
    }
}