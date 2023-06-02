
class Box<T>{
    private T name;
    public void set(T name){
        this.name=name;
    }
    public T get(){
        return name;
    }
}
public class Q6 {
    public static void main(String[] args) {
        Box<String>obj=new <String> Box();
        obj.set("ABC");
        Box<String>obj1,obj2;
        obj1=obj;
        obj2=obj;
        obj1.set("Mango");
        System.out.println(obj2.get());
        Box<Integer>ob2=new <Integer> Box();
        Box<Object>ob=new  Box<Object>();
        ob.set("Apple");
        System.out.println(ob.get());
        ob.set(12345);
        System.out.println(ob.get());





    }
}
