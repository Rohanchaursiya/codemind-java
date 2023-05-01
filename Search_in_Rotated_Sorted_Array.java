import java.util.*;
public class Search_In_Rotated{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(a[i]==target){
                System.out.println(i);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("-1");
        }
    }
}