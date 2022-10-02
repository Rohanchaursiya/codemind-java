import java.util.*;
class Slice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.print(s.substring(a,b+1));
    }
}