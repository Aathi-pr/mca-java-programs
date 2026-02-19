import java.util.Scanner;

public class StringMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take two strings initially
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int choice;

        do {
            System.out.println("\n--- STRING OPERATIONS MENU ---");
            System.out.println("1. Length");
            System.out.println("2. Concatenation");
            System.out.println("3. Extraction");
            System.out.println("4. Comparison");
            System.out.println("5. Modification");
            System.out.println("6. Search");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1: // Length
                    System.out.println("Length of first string: " + s1.length());
                    System.out.println("Length of second string: " + s2.length());
                    break;

                case 2: // Concatenation
                    System.out.println("Concatenated String: " + s1.concat(s2));
                    break;

                case 3: // Extraction (substring from first string)
                    System.out.print("Enter starting index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter ending index: ");
                    int end = sc.nextInt();

                    System.out.println("Extracted String: " +
                            s1.substring(start, end));
                    break;

                case 4: // Comparison
                    if (s1.equals(s2)) {
                        System.out.println("Strings are equal");
                    } else {
                        System.out.println("Strings are not equal");
                    }
                    break;

                case 5: // Modification (replace in first string)
                    System.out.print("Enter word to replace in first string: ");
                    String oldWord = sc.nextLine();
                    System.out.print("Enter new word: ");
                    String newWord = sc.nextLine();

                    s1 = s1.replace(oldWord, newWord);
                    System.out.println("Modified first string: " + s1);
                    break;

                case 6: // Search (search in first string)
                    System.out.print("Enter word to search in first string: ");
                    String search = sc.nextLine();

                    if (s1.contains(search)) {
                        System.out.println("Word found");
                    } else {
                        System.out.println("Word not found");
                    }
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}

