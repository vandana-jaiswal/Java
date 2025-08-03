class Student {
    String name;
    int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

}

class A{
    public static void main(String[] args) {
        // Shallow copy
        Student a = new Student("vandu" , 20);
        Student y = a;

        System.out.println(a.name);
        System.out.println(y.name);

        y.name = "mona";

        System.out.println(a.name);
        System.out.println(y.name);

    }
}