import java.util.*;
abstract class marks{
    abstract void getPercent();
}
class studA extends marks{
    studA(int m1,int m2,int m3){

    }
    Scanner sc=new Scanner(System.in);
    void getPercent(){
         System.out.println("enter mark1");
        int m1=sc.nextInt();

        System.out.println("enter mark2");
        int m2=sc.nextInt();
  
        System.out.println("enter mark3");
        int m3=sc.nextInt();
        int percent=(m1+m2+m3)/3;
        System.out.println(percent);
    }
}
class studB extends marks{
    studB(int m1,int m2,int m3,int m4){

    }
     Scanner sc=new Scanner(System.in);
    void getPercent(){
        System.out.println("enter mark1");
        int m1=sc.nextInt();

        System.out.println("enter mark2");
        int m2=sc.nextInt();
  
        System.out.println("enter mark3");
        int m3=sc.nextInt();
       
        System.out.println("enter mark4");
        int m4=sc.nextInt();
        
        int percent=(m1+m2+m3+m4)/4;
        System.out.println(percent);
    }
}

public class lab1percent{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     int m1=0,m2=0,m3=0,m4=0;
         

        studA s1=new studA(m1,m2,m3);
        studB s2=new studB(m1,m2,m3,m4);
        s1.getPercent();
        s2.getPercent();
        

        sc.close();
    }
}