import java.util.Scanner;
class PronicNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i=0,c=0;
        n=sc.nextInt();
        while(n!=0){
            if(c==n){
                System.out.print("YES");
                break;
            }
            else if(c>n){
                System.out.print("NO");
                break;
            }
            c=i*(i+1);
            i++;
        }
    }
}