import java.util.Scanner;
class ThePandemic{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==2){
            System.out.print("1");
        }
        else if(n==1){
            System.out.print("0");
        }
        else{
            System.out.print("2");
        }
    }
}