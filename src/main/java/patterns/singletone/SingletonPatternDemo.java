package patterns.singletone;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.number = 3;
        System.out.println(object.number);
        SingleObject object2 = SingleObject.getInstance();
        object2.number = 4;
        System.out.println(object2.number);
        System.out.println(object.number);
    }
}
