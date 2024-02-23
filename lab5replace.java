import java.util.*;
public class lab5replace {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        System.out.println("enter key");
        String key=sc.nextLine();
        System.out.println("enter replacement");
        String n=sc.nextLine();
        System.out.println(s.replace(key, n));
        sc.close();
    }
}
