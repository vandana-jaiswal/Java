public class Index {
    public static void main(String[] args) {
        Student a = new Student("Ram", 34);
        System.out.println(a);

        String name = a.getName();
        System.out.println(name);

        int age = a.getAge();
        System.out.println(age);


        // we cant change the name and age field data once it created 


        Student b = new Student("golu", 36);
        System.out.println(b);
    }
}
