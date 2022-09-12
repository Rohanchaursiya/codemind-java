import java.util.Scanner;
class SimpleIntrest{
    public static void main(String args[]){
        int p,t,r;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        
        System.out.print((p*t*r)/100);
    }
}