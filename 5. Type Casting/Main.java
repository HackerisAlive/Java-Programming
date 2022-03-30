class Main {
    public static void main(String[] args) {
        // Type casting:- Convert a value from one data type to another data type is known as type casting.

        // Types of Type Casting: -
        // Widening Type Casting: - Converting a lower data type into a higher one is
        // called widening type casting. It is also known as implicit conversion or
        // casting down. It is done automatically. It is safe because there is no chance
        // to lose data.

        // byte -> short -> char -> int -> Long -> float -> double
        // byte = 8 bits (1 byte) //if last bit is 1 then the number is negative
        // 128 64 32 16 8 4 2 1
        //   0  1  1  1 1 1 1 1 = 127
        //   1  0  0  0 0 0 0 0= -128
        byte a = 127;
        short b = a;
        System.out.println("byte = " + a + " After conversion in short = " + b);

        // Narrowing Type Casting: -Converting a higher data type into a lower one is
        // called narrowing type casting. It is also known as explicit conversion or
        // casting up. It is done manually by the programmer. If we do not perform
        // casting then the compiler reports a compile-time error. It is not safe
        // because there is chance to lose data.
        // double -> float -> Long -> int -> char -> short -> byte
        // short = 16 bits (2 byte)
        // 32768 16384 8192 4096 2048 1024 512 256 128 64 32 16 8 4 2 1
        //     0     1    0    0    0    0   0   0   1  0  0  0 0 0 0 1 = 16,513

        // byte = 8 bits (1 byte)
        // 128 64 32 16 8 4 2 1
        //   1  0  0  0 0 0 0 1 = -128 + 1 = -127 (it is the easiest way to find negative number in computer it use Two's Complement)

        // Two's Complement Representation
        // 128 64 32 16 8 4 2 1
        //   1  0  0  0 0 0 0 1
        // (Using Two's Complement Representation)

        // Two's Complement = One's Complement + 1
        // 0 1 1 1 1 1 1 0 (One's Complement) = -126 (- is present over here bcz in byte binary 1 is present on 128 place & if last bit is 1 then the number is negative)
        //               1 (+1)
        // 0 1 1 1 1 1 1 1 =-127

        short c = 16513;
        byte d = (byte) c;
        System.out.println("short = " + c + " After conversion in byte = " + d);
    }
}