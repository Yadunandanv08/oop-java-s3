import java.util.*;
public class bubblesort{

      public static void main(String args[]){
         
        
        //array

        Scanner sc = new Scanner(System.in);
        

        System.out.println("enter array size");
        int size = sc.nextInt();
        

        int array[] = new int[size];

        System.out.println("enter array elements");
        for(int i=0;i<size;i++){

              array[i]= sc.nextInt();
        }

         //sorting 
         
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){

                if(array[j+1]<array[j]){
               int temp = array[j];
               array[j] = array[j+1];
               array[j+1] = temp;
                }
                   

            }

              
        }

        //printing sorted array

        System.out.println("the sorted elements are");
         for(int i=0;i<size;i++){

              System.out.println(array[i]);
        }

     sc.close(); 
    }
        
        
        
}       




          


         
       