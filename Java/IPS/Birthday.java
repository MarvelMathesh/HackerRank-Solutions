/**
 * Create a simple Java class named 'Person' with attributes 'name' and 'age'.
 * Implement a parameterized constructor to initialize these attributes.
 * Additionally, add a method named 'birthday' that increments the age in the main program,
 * create an instance of the 'Person' class, display the initial details, call the 'birthday' method,
 * and display the updated details.
 */
public class Birthday {

    // Attributes
    private String name;
    private int age;

    // Parameterized constructor
    public Birthday(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display details method
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Birthday method
    public void birthday() {
        age++;
    }

    // Main program example
    public static void main(String[] args) {
        // Create a Person object
        Birthday person = new Birthday("Mathesh", 18);

        // Display initial details
        System.out.println("Initial details:");
        person.displayDetails();

        // Celebrate birthday
        person.birthday();

        // Display updated details
        System.out.println("Updated details after birthday:");
        person.displayDetails();
    }
}
