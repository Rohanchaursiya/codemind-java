import java.util.Scanner;
class Patttern{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                // if(i==j || i+j==n+1){
                //     System.out.print("x");
                // }
                // else{
                    System.out.print(j);
                //}
            }
            System.out.println();
        }
    }
}