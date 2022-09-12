import java.util.Scanner;
class ElementsNotBetweenAandB
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
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<a || arr[i]>b){
                System.out.print(arr[i]+" ");
                count+=1;
            }
        }
        if(count==0){
            System.out.print("-1");
        }
        sc.close();
    }
}