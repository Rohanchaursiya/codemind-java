import java.util.Scanner;
class Patttern{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}