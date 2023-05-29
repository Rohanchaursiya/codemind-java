import java.util.*;
public class String_Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t--!=0){
            String s=sc.nextLine();
            boolean isDecimal = true;
            for (char c:s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    isDecimal=false;
                    break;
                }
            }
            if(isDecimal==true){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
        
    }
}