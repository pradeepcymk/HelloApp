public class HelloApp {
    public static void main(String[] args) {

        // Step 1: Check if no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            // Step 2: Create StringBuilder
            StringBuilder nameBuilder = new StringBuilder();

            // Step 3: Loop through arguments
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Step 4: Remove trailing delimiter using substring
            if (nameBuilder.length() > 0) {
                String result = nameBuilder.substring(0, nameBuilder.length() - 2);

                // Step 5: Print output
                System.out.println("Hello, " + result + "!");
            }
        }
    }
}