import java.util.Scanner;
class Bank{
    private long account_no;private String name;private int balance;
    Bank(long acc,String name,int balance){
        this.account_no=acc;
        this.name=name;
        this.balance=balance;
    }
    void display(){
        System.out.println("Name:-"+name);
        System.out.println("Account no:-"+account_no);
        System.out.println("Balance:-"+balance);
    }
}
class InvalidBalanceException extends Exception{
    public String getMessage(){
        return "Balance cannot be less than 0";
    }
}
public class HW1 {
    public static void main(String[] args) throws InvalidBalanceException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name ");
        String s=sc.nextLine();
        System.out.println("Enter bank account no ");
        long bankacc=sc.nextLong();
        System.out.println("Enter Balance:-");
        int balance=sc.nextInt();
        Bank b=new Bank(bankacc,s,balance);
        b.display();
        System.out.println("Enter amount to withdraw ");
        int withdraw=sc.nextInt();
        balance=balance-withdraw;
        if(balance<=0){
            throw new InvalidBalanceException();
        }
        System.out.println("Remaining balance "+balance);
    }

}
