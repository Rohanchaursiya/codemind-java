import java.util.*;
class Phone_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int c=0;
        while(n!=0){
            c+=1;
            n/=10;
        }
        if(c==10){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}