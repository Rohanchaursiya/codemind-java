import java.util.Scanner;
class ElectricityBill{
    public static void main(String args[]){
        int units;
        Scanner sc=new Scanner(System.in);
        String CI=sc.nextLine();
        String CN=sc.nextLine();
        units=sc.nextInt();
        double b,uc=0,tb;
        if(units<200)
        {
            uc=1.20;
        }
        else if(units>=200 && units<400)
        {
            uc=1.50;
        }
         else if(units>=400 && units<600)
        {
            uc=1.80;
        }
         else if(units>=600)
        {
            uc=2.00;
        }
        b=units*uc;
        if(b>=400)
        {
            tb=b+(b*0.15);
            System.out.format("%.2f",tb);
        }
        else
        {
            tb=b+100;
            System.out.format("%.2f",tb);
        }
    }
}