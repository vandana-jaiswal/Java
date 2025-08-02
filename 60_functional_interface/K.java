@FunctionalInterface
interface E10 {
    void pro();
}

// class AA implements E10{
//     public void pro(){
//         System.out.println("hellooo");
//     }
// }

public class K {
    public static void main(String[] args) {
       E10 e = new E10(){
                public void pro(){
                    System.out.println("hiiii");
                }
       };
       e.pro();
    }
}