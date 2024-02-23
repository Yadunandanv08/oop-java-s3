import java.util.*;
class bank{
    Scanner sc= new Scanner(System.in);
    int bal=10000;
    void credit(){
        System.out.println("enter amount");
        int amount=sc.nextInt();
        System.out.println("amount credited!");
        bal=bal+amount;
    }
    void getbal(){
        System.out.println(bal);
    }
    void debit(){
        System.out.println("enter amount");
        int amount=sc.nextInt();
        System.out.println("amount debited!");
        bal=bal-amount;
    }
}

class sbi extends bank{

}

class fed extends bank{

}

class can extends bank{

}

class labbank{
    public static void main(String args[]){
        sbi acc1= new sbi();
        acc1.credit();
        acc1.debit();
        acc1.getbal();
    }
}