class Student6 implements Cloneable {
    String name;
    int age;
}

class I extends Student6 {
    public static void main(String[] args) throws CloneNotSupportedException {
        I a = new I();
        a.name = "vidya";
        a.age = 23;

        G b = (G)a.clone();

        System.out.println(a);
        System.out.println(b);
    }
}