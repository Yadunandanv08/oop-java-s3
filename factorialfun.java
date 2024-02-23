import java.util.*;
public class factorialfun {

    public static int fact(int n){
        int fact = 1;
        for(int i =n;i>0;i--){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

       int k= fact(n);
        System.out.println(k);
        sc.close();
    }
     
    
}
