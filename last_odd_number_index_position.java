import java.util.Scanner;
class CanRobberEscape
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]%2!=0){
                System.out.print(i);
                break;
            }
        }
    sc.close();
    }
}