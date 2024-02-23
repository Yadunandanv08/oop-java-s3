import java.util.*;
import java.io.*;
public class labpal {

   static boolean pal(String str){
        int flag=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                flag++;
                break;
            }
            
        }
        if(flag==0)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str =sc.nextLine();
        String[] s=str.split(" ");

        StringBuilder fin= new StringBuilder();
        try{
        for(int i=0;i<s.length;i++){
          
            File f= new File("pal.txt");
            FileWriter w = new FileWriter(f);
            
            if(pal(s[i])){
                StringBuilder sb= new StringBuilder(s[i]);
                for(int j=0;j<s[i].length();j++){
                    sb.setCharAt(j,'*');
                }
            
                fin.append(sb+" ");
                }
            else{
                    fin.append(s[i]+" ");
                }
                
            
                String k =fin.toString();
                w.write(k);
                w.close();
                
            
           
        }
    }catch(IOException e){
        e.printStackTrace();
    }
        
        sc.close();
        

    }
    
}
