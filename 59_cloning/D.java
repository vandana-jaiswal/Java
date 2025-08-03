class Student {
    String name;
    int age;

}

class D{
    public static void main(String[] args) {
      
        Student a = new Student();
        Student b = (Student)a.clone();

    }
}

// D.java:11: error: clone() has protected access in Object
//         Student b = (Student)a.clone();
//                               ^
// 1 error