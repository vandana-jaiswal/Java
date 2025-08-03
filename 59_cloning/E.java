class Student {
    String name;
    int age;

    public Object clone(){
        return super.clone();
    } 

}

class E{
    public static void main(String[] args) {
      
        Student a = new Student();
        Student b = (Student)a.clone();

    }
}

// E.java:6: error: unreported exception CloneNotSupportedException; must be caught or declared to be thrown
//         return super.clone();
//                           ^
// 1 error
