import java.util.*;
public class Counting_the_Camel_Case_Word{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       
       
        int max=0;;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=max){
                max=str.charAt(i);
            }
        }
        // if(count!=0){
            System.out.println((char)max);
        // }else{
        //     System.out.println("-1");
        // }
    }
}