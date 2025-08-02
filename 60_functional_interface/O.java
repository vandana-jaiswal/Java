interface FF {
    void pro();
    // void info();
}

class O {
    public static void main(String[] args) {
        FF x = () -> System.out.println("Jay Ho");
    }    
}

// lambda expression bhi tabhi use kar payenge agar interface functionla interface ho taki vo labda
// me use hone wali ek hi method hogi to vo aumatic use pahchan lega