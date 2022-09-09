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
        int odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0)
            odd++;
        }
    if(odd<=2)
    System.out.print("YES");
    else
    System.out.print("NO");
        
        
    sc.close();
    }
}