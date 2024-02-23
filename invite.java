import java.util.*;
public class invite {
    public static int noOfInvites(int n){
        
     if(n<=1){
     return 1;
       }
      
       
        
        //singles

        int singles=noOfInvites(n-1);
        
        //pairs

        int pairs= (n-1)*noOfInvites(n-2);

      return singles+pairs;
    
        
    }

    public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the number of people");
     int n=sc.nextInt();
    int total= noOfInvites(n);
    System.out.println(total);

    sc.close();


    }
    
}
