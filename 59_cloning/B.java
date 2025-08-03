class Student {
    String name;
    int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

}

class B{
    public static void main(String[] args) {
        // Deep copy
        Student a = new Student("vandu" , 20);
        Student y = new Student("vandu" , 20);

        System.out.println(a.name);
        System.out.println(y.name);

        y.name = "mona";

        System.out.println(a.name);
        System.out.println(y.name);

    }
}
