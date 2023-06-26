import java.util.*;
public class Ones{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0,mc=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==0){
                c=0;
            }else{
                c++;
                if(mc<c){
                    mc=c;
                }
            }
        }
        
        System.out.println(mc);
    }
}