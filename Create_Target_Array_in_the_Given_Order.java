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
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(e[i],s[i]);
        }
         for(int i=0;i<n;i++){
            System.out.print(li.get(i)+" ");
         }
       
    }
}