public class HelloApp {
    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        // If no arguments → default
        if (args.length == 0) {
            names.append("World");
        } else {
            // Enhanced for loop
            for (String name : args) {
                names.append(name).append(", ");
            }

            // Remove last comma and space
            names.setLength(names.length() - 2);
        }

        System.out.println("Hello, " + names + "!");
    }
}