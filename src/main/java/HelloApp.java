public class HelloApp {
    public static void main(String[] args) {

        String names;

        // If arguments are provided → join them
        if (args.length > 0) {
            names = String.join(", ", args);
        } else {
            names = "World";
        }

        System.out.println("Hello, " + names + "!");
    }
}