import java.util.Scanner;

public class selectionsort {

    
                  
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
            int smallest=i;
            for(int j=i+1;j<size;j++){

                if(array[smallest]>array[j]){
                   smallest=j;
                }
    
        }

         int temp=array[smallest];
         array[smallest]=array[i];
         array[i] = temp;
              
    }

     //printing sorted array
     
     System.out.println("the sorted elements are");
     for(int i=0;i<size;i++){

              System.out.println(array[i]);
        }

     sc.close();
    }
    
}
