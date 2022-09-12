import java.util.Scanner;
class AverageIsInArray
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[100];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int avg;
        avg=(int)sum/n;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==avg){
                count+=1;
            }
        }
        if(count!=0){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    sc.close();
    }
}