import java.util.*;
import java.io.*;
public class labmecfile {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        String[] s=str.split("\\s");
        
        for(int i=0;i<s.length;i++){
            try{
                File f= new File("filename"+i+".txt");
                f.createNewFile();
                FileWriter fw= new FileWriter("filename"+i+".txt");
                fw.write(s[i]);
                fw.close();
            }catch(IOException e){
                    e.printStackTrace();
            }   
        }
       
        for(int i=0;i<s.length;i++){
            try{
               FileReader fr= new FileReader("filename"+i+".txt");
               BufferedReader br=new BufferedReader(new FileReader("filename"+i+".txt"));
               String st;
               while ( (st=br.readLine())!=null) {
                    System.out.println(st);
                   
               }
               br.close();
               fr.close();
                
            }catch(Exception e){
                    e.printStackTrace();
            }   
        }
        sc.close();
    }
    
}
