import java.util.*;
public class lab4duplicate {
    public static void main(String args[]){
        int i,count=0;
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr= new int[7];
            System.out.println("enter elements");
            for(i=0;i<7;i++)
                arr[i]=sc.nextInt();
            for(i=0;i<7;i++){
                 count=0;
                for(int j=0;j<7;j++)
                    if(arr[i]==arr[j])
                        count++;  
                if(count>1){
                System.out.println(arr[i]+"repeats"+count+"times");
            }  
            
            }
             
            sc.close();
        }
            
    }
    
}
