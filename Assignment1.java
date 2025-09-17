public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt for registration number
        System.out.print("Enter your registration number: ");
        String regNumber = scanner.nextLine();

        // Print the entered information
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNumber);

        scanner.close();
    }
}
