import java.util.*;
class Rotation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c,sum=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                c=(int)Math.sqrt(a[i]);
                if((c*c)==a[i]){
                    sum=sum+a[i];
                }
            }
        }
        System.out.print(sum);
    }
}