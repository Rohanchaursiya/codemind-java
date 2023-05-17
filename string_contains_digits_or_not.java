// import java.util.*;
// public class Digit_or_Not{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t--!=0){
//             String str=sc.nextLine();
            
//             int count=0;
//             for(int i=0;i<str.length();i++){
//                 // if(str.charAt(i)>=0 && str.charAt(i)<=9)
//                 if(Character.isDigit(str.charAt(i))) {
//                     count=1;
//                      System.out.println("Yes");
//                      break;
//                 }
//             }
//             if(count==0){
//                 System.out.println("No");
//             }
//             // }else{
//             //     System.out.println("No");
//             // }
//         }
//     }
// }




import java.util.*;
public class Digit_or_Not{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
             String str=sc.next();
       
       
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
            sum+=(str.charAt(i)-'0');
        }
        }
        if(sum!=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        }

    }
}