import java.util.*;
class Slice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String reverse=new StringBuffer(s).reverse().toString(); 
        System.out.println(reverse);
    }
}