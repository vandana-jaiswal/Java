class Student {
    String name;
    int age;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    } 

}

class G{
    public static void main(String[] args) throws CloneNotSupportedException {
      
        Student a = new Student();
        Student b = (Student)a.clone();

    }
}


// Exception in thread "main" java.lang.CloneNotSupportedException: Student
//         at java.base/java.lang.Object.clone(Native Method)
//         at Student.clone(G.java:6)
//         at G.main(G.java:15)
// PS D:\java_prac\59_cloning> 

//  Student class clonable nhi hai
