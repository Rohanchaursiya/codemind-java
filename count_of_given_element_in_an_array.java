import java.util.Scanner;
class ElementSearch
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[10000];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k,count=0;
        k=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                count+=1;
            }
        }
        System.out.print(count);
    sc.close();
    }
}