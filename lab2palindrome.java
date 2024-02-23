import java.util.*;
public class lab2palindrome {
   static boolean checkpal(String k){
            int count=0;
            for(int i=0;i<k.length();i++){
                if(k.charAt(i)!=k.charAt(k.length()-i-1)){
                    count=1;
                    break;
                }
            }
                if(count==1)
                    return false;
                else 
                    return true;
        }
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String s= sc.nextLine();
        String[] arr=s.split(" ");
        for(String i:arr){
             if(i.length()==1)
                System.out.print(i);
           else if(checkpal(i)){
                for(int p=0;p<i.length();p++)
                    System.out.print("*");
                    System.out.print(" ");
            }
            
            
            else{
                System.out.print(i);
                System.out.print(" ");
            }
        }
        sc.close();
    }
}
