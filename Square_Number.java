import java.util.*;
class Square_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        /*for(int i=0;i<=(Math.sqrt(n));i++){
            for(int j=0;j<=(Math.sqrt(n));j++){
                if(i*i + j*j==n){
                    count=1;
                    break;
                }
            }
        }*/
        if(Math.sqrt(n)-(int)Math.sqrt(n) > 0){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}