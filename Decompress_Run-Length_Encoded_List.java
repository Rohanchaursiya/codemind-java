import java.util.*;
public class Run_Length{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j+=2){
            int f=a[j];
            int v=a[j+1];
            for(int i=0;i<f;i++){
                System.out.print(v+" ");
            }
        }
    }
}
