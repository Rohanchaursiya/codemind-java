import java.util.Scanner;
class PrimeinInterval{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                c++;
            }
            if(c==2)
            System.out.println(i);
        }
    }
}