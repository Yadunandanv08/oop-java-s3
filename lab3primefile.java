import java.util.*;
import java.io.*;
public class lab3primefile {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        
        System.out.println("enter number");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n/2;i++)
            if(n%i==0){
                for(int j=2;j<=i/2;j++){
                    if(i%j==0){
                        count=1;
                     }
                    
                  }
                  if(count!=1){
                      try{
                        BufferedWriter bw=new BufferedWriter(new FileWriter("test.txt"));
                        bw.write(i);
                        bw.close();
                      }catch(IOException e){
                        e.printStackTrace();
                      }  
                 }      
            }
            try{
                 BufferedReader br=new BufferedReader(new FileReader("test.txt"));
                int t;
                 while((t=br.read())!=-1){
                    System.out.println(t);
                 }
                 br.close();

                      }catch(IOException e){
                        e.printStackTrace();
                      }  
              
        sc.close();
    }

}