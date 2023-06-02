import java.util.Scanner;

public class Q5 {
    public static int count=0;
    public static <T> int count(T[] array, T item){

     for(int i=0;i< array.length;i++){
         if(item==array[i]){
             count++;
         }
     }
     return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer array[]=new Integer[5];
        System.out.println("Enter elements :-");
        for(int i=0;i<5;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter element to be counted ");
        int n=sc.nextInt();
        count(array,n);
        System.out.println(n+" occurred "+count+" time ");



    }
}
