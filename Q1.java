import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your lucky number ");
        int n=sc.nextInt();
        if(n<0){
            throw new NumberFormatException("Negative number ");
        }
        System.out.println(n);



    }

}
