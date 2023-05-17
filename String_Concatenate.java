import java.util.*;
public class String_Concatenate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
       
        String s=str1.concat(str2);
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        //System.out.println((String)ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}