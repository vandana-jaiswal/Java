@FunctionalInterface
interface BB {
    void pro(int a);
}

// class X2 implements BB {
//     public void pro(int a) {
//         System.out.println(a);
//     }
// }

class N {
    public static void main(String[] args) {
        BB x = (a)->{System.out.println(a);};

        x.pro(555);
    }    
}