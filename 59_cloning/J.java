class Student implements Cloneable{
    String name;
    int age;
    @Override
    public Object clone() {
        Object obj = null;
        try{
          obj =   super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return obj;
       
    } 

}

class J{
    public static void main(String[] args) {
      
        Student a = new Student();
        Student b = (Student)a.clone();
        System.out.println(b);
        System.out.println(a);

    }
}
