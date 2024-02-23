import java.util.*;
import java.io.*;
public class paltoken {
    static boolean ispal(String str){
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
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number string:");
        String str=sc.nextLine();
        StringTokenizer st=new StringTokenizer(str," ");
        try{
            File f=new File("pal.txt");
            FileWriter fw= new FileWriter(f);
            while(st.hasMoreTokens()){
                String w;
                if(ispal(w=st.nextToken())){
                    fw.write(w+" ");
                }
            }
            fw.close();
            FileReader fr=new FileReader(f);
            int n;
            while((n=fr.read())!=-1){
                System.out.print((char)n);
            }
            fr.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        sc.close();
    }
}
