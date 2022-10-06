import java.util.*;
class Compare_Triplates{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a0,a1,a2;
        a0=sc.nextInt();
        a1=sc.nextInt();
        a2=sc.nextInt();
        int b0,b1,b2;
        b0=sc.nextInt();
        b1=sc.nextInt();
        b2=sc.nextInt();
        int as=0,bs=0;
        if(a0>b0){
            as+=1;
        }
        else if (a0<b0){
            bs+=1;
        }
        if(a1>b1){
            as+=1;
        }
        else if(a1<b1){
            bs+=1;
        }
        if(a2>b2){
            as+=1;
        }
        else if(a2<b2){
            bs+=1;
        }
        System.out.print(as+" "+bs);
    }
}