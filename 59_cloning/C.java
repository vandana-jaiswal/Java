class Student {
    String name;
    int age;

}

class C{
    public static void main(String[] args) {
      
        Student a = new Student();
        Student b = a.clone();

    }
}


// C.java:11: error: clone() has protected access in Object
//         Student b = a.clone();
//                      ^
// C.java:11: error: incompatible types: Object cannot be converted to Student
//         Student b = a.clone();
//                            ^