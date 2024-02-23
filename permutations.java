import java.util.*; 
public class permutations {
     
    public static void calcpermutation(String str,String permutation){
    if(str.length()==0){
        System.out.println(permutation);
        return;
    }
        for(int i=0;i<str.length();i++){
            char con=str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            calcpermutation(newstr, permutation+con);
        }
        
    }

    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        calcpermutation(str, "");

        sc.close();
    }
    
}
