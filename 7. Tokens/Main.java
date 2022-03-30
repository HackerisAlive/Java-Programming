class Main {
    public static void main(String args[]) {
        //Java Tokens:- A token is the smallest element of a program that is meaningful to the compiler. Tokens can be classified as follows: 
        /* Keywords: - These are the pre-defined reserved words in a programming language. Each keyword has a meaning or each keyword perform a specific operation. We cannot use keywords as variable name. These are written in lower case. 
         * Identifiers:- Java Identifiers are the user defined names of classes, variables, methods, array, packages and interfaces. It uses letters, underscores, digits and $ sign. We cannot use keywords as identifiers because those are reserved for special use. 
         * Separators/Special Symbols:- Special symbols in Java are a few characters which have special meaning known to Java compiler and cannot be used for any other purpose. 
         * Literal/Constants:- A literal is a constant value that can be classified as integer literals, string literals, and boolean literals. 
         * Operators: - An operator is a special symbol that tells the compiler to perform a specific mathematical or logical operation on one or more operands where an operand can be an expression. */

        int edu1 = 112; //Int literal edu =122; 
        float edu2 = 31.10f; //Float literal edu2 = 31.10; 
        char edu3 = 'e'; //char literal edu3 = 'e'; 
        String edu4 = "Edureka"; //String literal edu4 = "Edureka"; 
        boolean edu5 = true; //Boolean literal edu5 = true; 
        System.out.println("HackerisAlive "+ (edu1 + edu2)); // Arithmetic Operators + is used.
        
        //Tokens from above Program: - 
        /*Keywords: - class, public static void, int, float, char, boolean 
         *Identifiers: - Main, main, edul, edu2, edu3, edu4, edu5 
         *Separators/Special Symbols:- [] () {} ; * = , . 
         *Operators: - Arithmetic +, -, /, *, %
                       Unary ++, --, ! 
                       Assignment = , +=, -= , *= , /= , %= , ^= 
                       Relational =, != , < >, <= , >= 
                       Logical && , || 
                       Ternary Condition) ? (Statement1) : (Statement2); 
                       Bitwise &, |, ^, ~ 
                       Shift << ,>> , >>>
        */
    }
}