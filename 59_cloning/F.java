class Student {
    String name;
    int age;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    } 

}

class F{
    public static void main(String[] args) {
      
        Student a = new Student();
        Student b = (Student)a.clone();

    }
}

// F.java:15: error: unreported exception CloneNotSupportedException; must be caught or declared to be thrown
//         Student b = (Student)a.clone();
//                                     ^
// 1 error