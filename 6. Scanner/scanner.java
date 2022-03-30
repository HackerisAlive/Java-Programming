import java.util.Scanner;//In order to use the object of Scanner, we need to import java.util.Scanner package. 

class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Then, we need to create an object of the Scanner class.
        System.out.println("Enter Integer ");// We enter 25 but computer take it like 25\n
        int a = sc.nextInt(); // We can use the object to take input from the user.
        System.out.println("Entered Integer " + a);// The int a take 25 and In is not taken and it is in buffer
        System.out.println("\nEnter String");// When we are going to take String input
        String d = sc.nextLine();// The buffer In will entered over here 
        System.out.println("Entered String "+d);//And it will not print anything and skip to next line
        System.out.println("\nEnter Float ");// We enter 25 but computer take it like 25\n
        float b = sc.nextFloat();// And it will not take the In from buffer bcz float don't take string like in
        System.out.println("Entered Float " + b); // The float b take 25 and in is not taken and it is in buffer
        System.out.println("\nEnter Double ");// We enter 25 but computer take it like 25\n
        double e = sc.nextDouble();// And it will not take the \n from buffer bcz double don't take string like In
        System.out.println("Entered Double " + e);// The double e take 25 and In is not taken and it is in buffer
        System.out.println("\nEnter String");// When we are going to take String input
        String c = sc.nextLine();// The buffer In will entered over here
        System.out.println("Entered String " + c);// And it will not print anything and skip to next line
        System.out.println("\n**Easiest way to overcome this problem**");
        System.out.println("Enter Integer ");// We enter 25 but computer take it like 25\n
        int f = Integer.parseInt(sc.nextLine());// Here is the twist we take the input as String "25\n" and convert it
                                                // into Integer
        System.out.println("Entered Integer " + f);// And it will print 25 in Integer
        System.out.println("\nEnter String");// And now we will not get \n(new line) bcz it get converted from String to
                                           // Integer
        String g = sc.nextLine();// We enter HackerisAlive
        System.out.println("Entered String " + g);// And it will print HackerisAlive in String
    }
}
