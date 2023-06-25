import java.util.*;
public class Student{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s[]=new int[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int e[]=new int[n];
        for(int i=0;i<n;i++){
            e[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(q<=e[i] && q>=s[i]){
                c++;
            }
        }
        System.out.println(c);
    }
}