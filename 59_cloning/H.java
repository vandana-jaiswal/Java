class Student implements Cloneable{
    String name;
    int age;
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    } 

}

class H{
    public static void main(String[] args) throws CloneNotSupportedException {
      
        Student a = new Student();
        Student b = (Student)a.clone();
        System.out.println(b);
        System.out.println(a);

    }
}
