import java.util.Scanner;
class CanRobberEscape
{
    public static void main(String args[])
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        int sum=0;
        for(int i=0;i<k;i++){
           sum+=arr[i];
        }
        System.out.println(sum);
    sc.close();
    }
}