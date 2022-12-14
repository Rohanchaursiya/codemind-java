import java.util.*;
class Tables{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int r=sc.nextInt();
        for(int i=1;i<=r;i+=2){
            System.out.println(m+" x "+i+" = "+m*i);
        }
    }
}