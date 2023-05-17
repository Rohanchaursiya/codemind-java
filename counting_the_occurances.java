import java.util.*;
public class Counting_the_Occurances{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c=sc.next().charAt(0);
        char[] ch=str.toCharArray();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(ch[i]==c){
                count++;
            }
        }
        if(count!=0){
            System.out.println(count);
        }else{
            System.out.println("-1");
        }
    }
}