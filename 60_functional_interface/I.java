@FunctionalInterface
interface E10 {
    void pro();
}

public class I {
    public static void main(String[] args) {
       E10 e = new E10(); 
       e.pro();
    }
}


// I.java:8: error: E10 is abstract; cannot be instantiated
//        E10 e = new E10(); 
//                ^
// 1 error