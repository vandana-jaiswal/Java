public class Index {
    public static void main(String[] args) {
        Student a = Student.getInstance();
        Student b = Student.getInstance();
        Student c = Student.getInstance();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
}

//  Console ek inbuilt singleton class hai .