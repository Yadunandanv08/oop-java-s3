import java.util.*;
public class fibonacci {
    public static int fibo( int a, int b, int n){
        if(n==0){
           return 1;
        }
        int c=a+b;
        System.out.println(c);
        return fibo(b,c, n-1);
    }

    public static void main(String args[]){
       
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the digit");
        int n=sc.nextInt();

        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        
            fibo(a, b, n-2);
        
       sc.close();
    }
    
}
