import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[4];
        System.out.println("Enter four colours ");
        for(int i=0;i<4;i++){
            arr[i]=sc.nextLine();
        }
        for(String a:arr){
            System.out.println(a);
        }
        try{
            Integer.parseInt(arr[0]);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        System.out.println("Enter one more colour ");
        String s=sc.nextLine();
        System.out.println("Enter indedx length ");
        int a=sc.nextInt();
        try{
            System.out.println(arr[a]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        for(String b:arr){
            System.out.println(b);
        }
    }
}
