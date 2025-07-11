import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        // Batch reactor simulator

        System.out.println("Helloooo! Nice to meet you! I'm Meemaw, a chemical engineer here to help!");
        System.out.println("I'm going to set up a stirred-tank reactor that converts substances over time!");
        System.out.println("The reaction is A → B + C. What is reactant A?");

        Scanner scanner = new Scanner(System.in); // Create Scanner object
        String A = scanner.nextLine(); // Read entire line of input

        System.out.println("Cool! And what is product B you want to get? Please input something possible. I'm too lazy to deal with your mistakes for you, bruh.");
        String B = scanner.nextLine();

        System.out.println("Great! And what is product C you want to get?");
        String C = scanner.nextLine();

        System.out.println("Awesome! So we have the reaction: " + A + " → " + B + " + " + C);
        System.out.println("Confirm to continue with the selection? (Yes/No)");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("Yes")) {
            System.out.println("Sweet, let's start the batch reactor >:)");
            System.out.println("So we have the reaction: " + A + " → " + B + " + " + C);

        } else {
            if (confirmation.equalsIgnoreCase("No")) {
                System.out.println("That's fine! Let me reconfirm with you.");
                System.out.println("Be careful this time, because I'm not going to ask you again!");
                System.out.println("What is reactant A?");
                A = scanner.nextLine();
                System.out.println("What is product B?");
                B = scanner.nextLine();
                System.out.println("What is product C?");
                C = scanner.nextLine();
                System.out.println("Let's goooo, finally! We have the reaction: " + A + " → " + B + " + " + C);
            }
            else {
                while (!confirmation.equalsIgnoreCase("Yes") && !confirmation.equalsIgnoreCase("No"))
                {
                System.out.println("I'm mostly illiterate, bro. Type Yes or No.");
                confirmation = scanner.nextLine(); // Another prompt for confirmation
                if (confirmation.equalsIgnoreCase("Yes")) {
                    System.out.println("Sweet, let's start the batch reactor >:)");
                    break; // Exit the loop if confirmed

                } else if (confirmation.equalsIgnoreCase("No")) {
                    System.out.println("That's fine! Let me reconfirm with you.");
                    System.out.println("Be careful this time, because I'm not going to ask you again!");
                    System.out.println("What is reactant A?");
                    A = scanner.nextLine();
                    System.out.println("What is product B?");
                    B = scanner.nextLine();
                    System.out.println("What is product C?");
                    C = scanner.nextLine();
                    System.out.println("Let's goooo, finally! We have the reaction: " + A + " → " + B + " + " + C);
                    break; // Exit the loop if confirmed
                }
            }
        }
        }
            // Reactor logic here
            System.out.println("Unimolecular reactions, like the one you just put in, are usually first order.");
            System.out.println("If you're not sure about the order of your reaction, please experiment.");
            System.out.println("Conduct experiments with different initial concentrations of " + A +".");
            System.out.println("Measure the initial rate of reaction and compare how the rate changes with concentration.");
            System.out.println("If doubling " + A + " doubles the rate, then indeed it's first order.");
            System.out.println("If it quadruples the rate, then it's second order.");
            System.out.println("If it doesn't change the rate, then it's zero order.");
            System.out.println("There are other orders too, but they're really uncommon. Feel free to consult online resources before continuing!");
            System.out.println("I can help you run zero, first, and second order reactions in this space.");
            System.out.println("Please input the order of your reaction (0, 1, or 2) :D");
            int order = scanner.nextInt(); // Read the order of the reaction
                while (!scanner.hasNextInt()) {
                    // error message
                }

            scanner.close(); // Close scanner

    }
}