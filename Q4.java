import java.util.Scanner;
public class Q4 {
    public static <E>void printArray( E[] inputArray){
        for(E e:inputArray){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer[] a =new Integer[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        printArray(a);
    }
}
