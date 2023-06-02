import java.util.Scanner;
class Student{
 private String name;private int marks;
 Student(int marks,String name){
     this.marks=marks;
     this.name=name;
 }
 public void display()
 {
     System.out.println(name+" has got "+marks);
 }
}
class MarksOutOfBoundException extends Exception{
    @Override
    public String getMessage(){
        return "Mark's can't be greater than 100 ";
    }
}
public class Q3 {
    public static void main(String[] args) throws MarksOutOfBoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name ");
        String s=sc.nextLine();
        System.out.println("Enter your marks ");
        int n=sc.nextInt();
        if(n>100){
            throw new MarksOutOfBoundException();
        }
        else {
            Student w = new Student(n, s);
            w.display();
        }



    }
}
