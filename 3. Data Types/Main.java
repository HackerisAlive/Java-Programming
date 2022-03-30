class Main {
    public static void main(String[] args) {
        // Java Data Types:- Data types specify the different sizes and values that can be stored in the variable.
        // int a = 10;
        // int = Datatype,
        // a = Variable,
        // 10 = Value.
        // Types:- Primitive and Non-Primitive.
        // Primitive Data Types: - A primitive data type specifies the size and type of
        // variable values, and it has no additional methods.
        boolean h = true; // boolean 1 bit Stores true or false values
        byte a = 100; // byte 1 byte Stores whole numbers from -128 to 127
        short b = 5000; // short 2 bytes Stores whole numbers from -32, 768 to 32, 767
        char g = 'A'; // char 2 bytes Stores a single character/letter or ASCII values
        int c = 100000; // int 4 bytes Stores whole numbers from -2,147,483, 648 to 2,147,483, 647
        long d = 15000000000L; // long 8 bytes Stores whole numbers from -9,223, 372,036,854,775, 808 to 9,
                               // 223, 372,036,854, 775,807
        float e = 5.75f; // float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7
                         // decimal digits
        double f = 19.99; // double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal
                          // digits
        System.out.println(h);
        System.out.println(a);
        System.out.println(b);
        System.out.println(g);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // Scientific Numbers:- A floating point number can also be a scientific number
        // with an "e" to indicate the power of 10
        float f1 = 35e3f;
        double d1 = 12E4;
        System.out.println(f1);
        System.out.println(d1);

        // Non-Primitive Data Types: - Non-primitive data types are called reference
        // types because they refer to objects.
        int arr[] = { 3, 4, 6, 2, 7 }; // Arrays are used to store multiple values in a single variable, instead of
                                       // declaring separate variables for each value.
        for (int i : arr)
            System.out.println(i);

        String str = "Ayush"; // Strings are used for storing text.
        // A String variable contains a collection of characters surrounded by double
        // quotes
        System.out.println(str);
    }
}