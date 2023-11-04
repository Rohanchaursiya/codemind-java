import java.util.*;
public class Diff_Num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=Integer.toString(n);
        String fs="";
        for(int i=0;i<k;i++){
            fs+=s.charAt(i);
        }
        String ls="";
        for(int i=s.length()-k;i<s.length();i++){
            ls+=s.charAt(i);
        }
        int fn=Integer.parseInt(fs);
        int ln=Integer.parseInt(ls);
        System.out.println(Math.abs(fn-ln));
    }
}
