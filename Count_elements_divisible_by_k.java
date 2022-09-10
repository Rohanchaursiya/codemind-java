import java.util.Scanner;
class DivisibleByK
{
    public static void main(String args[])
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int[] arr=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%k==0){
                count+=1;
            }
        }
        System.out.println(count);
    }   
}        