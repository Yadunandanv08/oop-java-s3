import java.util.*;
public class insertionsort {

   public static void sort(int size,int arr[]){
         //sorting
          
         for(int i=0;i<size-1;i++){
            int selected = arr[i+1];
            int j=i;

            while(j>=0 && selected<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=selected;
               
            }

    }
    public static void main(String args[]){
        

        //array

         Scanner sc=new Scanner(System.in);

         System.out.println("enter array size");
         int size = sc.nextInt();

         int arr[]= new int[size];

         System.out.println("enter array elements");
         for(int i=0;i<size;i++)
             arr[i]=sc.nextInt();

        

            
         sort(size,arr);


         System.out.println("the sorted elements are");  
         for(int i=0;i<size;i++)
                 System.out.println(arr[i]);

           sc.close();
         }
          
         
}


    
    


