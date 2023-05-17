import java.util.*;
public class Excel_SHeet{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(n!=0){
            n=n-1;
            int rem=n%26;
            char ch=(char)(64+rem+1);
            sb.append(ch);
            // n=n-1;
            n=n/26;
        }
        System.out.println(sb.reverse().toString());
    }
}