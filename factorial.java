import java.util.*;
public class factorial {
    
    public static int fact(int n){
        if (n==0 || n==1)
            return 1;
        
     int factnm1=fact(n-1);
     int facto = n*factnm1; 
      
       return facto; 
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the digit");
        int n = sc.nextInt();
       
        System.out.println("the factorial is");
        System.out.println(fact(n));         
        sc.close();
    }
    
}