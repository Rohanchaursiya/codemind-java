import java.util.*;
public class Sub_Array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int n=sc.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        Arrays.sort(b);
        int c=0;
        for(int i=0;i<m;i++){
            if(a[i]==b[i]){
                c++;
            }
        }
        if(c==n){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}