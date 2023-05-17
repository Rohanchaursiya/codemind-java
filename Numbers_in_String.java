import java.util.*;
public class Numbers_in_String{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       
       
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                sum+=str.charAt(i)-'0';
            }
            // if(Character.isDigit(str.charAt(i))) 
            // sum=sum+Character.getNumericValue(str.charAt(i));
     // }
        }
        //if(count!=0){
            System.out.println(sum);
        // }else{
        //     System.out.println("-1");
        // }
        
    }
}