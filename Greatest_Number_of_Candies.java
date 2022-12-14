import java.util.*;
class Candy{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int t=-99;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]>t){
                t=a[i];
            }
        }
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]+m>=t){
                System.out.print("True ");
            }else{
                System.out.print("False ");
            }
        }
    }
}