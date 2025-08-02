@FunctionalInterface
interface E10 {
    void pro();
}

// class AA implements E10{
//     public void pro(){
//         System.out.println("hellooo");
//     }
// }

public class L {
    public static void main(String[] args) {
       E10 e = ()->{System.out.println("hurere");};
       e.pro();
    }
}