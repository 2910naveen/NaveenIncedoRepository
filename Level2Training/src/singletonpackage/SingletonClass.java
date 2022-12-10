package singletonpackage;

class Singleton{
    private static Singleton obj = new Singleton();
    private static volatile int count=0;
    private Singleton() {
        
    }
    public static Singleton createObject() {
        count++;
        return obj;
    }
    public void showCount() {
        System.out.println(count + " objects called...!");
    }
}
public class SingletonClass {
    
    public static void main(String[] args) {
        Singleton obj1 = Singleton.createObject();
        obj1.showCount();
        
        Singleton obj2 = Singleton.createObject();
        obj2.showCount();
        
        Singleton obj3 = Singleton.createObject();
        obj3.showCount();
        
        Singleton obj4 = Singleton.createObject();
        obj4.showCount();
    }
}
