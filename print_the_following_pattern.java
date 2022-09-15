import java.util.Scanner;
class Patttern{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                // if(i==j || i+j==n+1){
                //     System.out.print(i+" ");
                // }
                // else{
                    System.out.print((char)(i+64)+" ");
               // }
            }
            System.out.println();
        }
    }
}