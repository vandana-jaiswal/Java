// functional interface

@FunctionalInterface
interface B {
    void pro();
    void info();
}


// B1.java:3: error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
//   B is not a functional interface
//     multiple non-overriding abstract methods found in interface B
// 1 error