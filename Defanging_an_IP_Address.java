import java.util.Scanner;
class DefangingIP{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str=s.replace(".","[.]");
        System.out.print(str);
    }
}
