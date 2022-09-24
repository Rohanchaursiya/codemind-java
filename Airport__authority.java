import java.util.*;
class Airport{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int t;
        t=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]<=t){
                count+=1;
            }
            else{
                count+=2;
            }
        }
        System.out.print(count);
    }
}