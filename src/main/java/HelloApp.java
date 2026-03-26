public class HelloApp {
    public static void main(String[] args) {

        // Assign name using default if no argument is given
        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello, " + name + "!");
    }
}