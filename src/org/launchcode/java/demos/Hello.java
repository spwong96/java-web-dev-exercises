import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String name = input.next();
        input.close();

        System.out.println("Hello, " + name + "!");
    }
}