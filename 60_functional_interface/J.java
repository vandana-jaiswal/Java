@FunctionalInterface
interface E10 {
    void pro();
}

class AA implements E10{
    public void pro(){
        System.out.println("hellooo");
    }
}

public class J {
    public static void main(String[] args) {
       AA e = new AA(); 
       e.pro();
    }
}