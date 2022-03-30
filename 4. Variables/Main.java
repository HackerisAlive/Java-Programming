class Main {
    // Variable:- A variable is the name of a reserved area allocated in memory. In
    // other words, it is a name of the memory location. It is a combination of
    // "vary + able" which means its value can be changed.

    // Static Variable:- A variable that is declared as static is called a static
    // variable. It cannot be local. You can create a single copy of the static
    // variable and share it among all the instances of the class. Memory allocation
    // for static variables happens only once when the class is loaded in the
    // memory.
    static int a = 10;

    // Instance Variable: - A variable declared inside the class but outside the
    // body of the method, is called an instance variable.
    int b = 20;

    public static void main(String[] args) {
        // Local Variable: - A variable declared inside the body of the method is called
        // local variable. You can use this variable only within that method and the
        // other methods in the class aren't even aware that the variable exists.
        int c = 30;
        
        Main m = new Main();
        System.out.println("Static Variable: - " + a);
        System.out.println("Instance Variable: - " + m.b);
        System.out.println("Local Variable: - " + c);
    }
}
