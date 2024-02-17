public class Warrior extends Novice {
    private String color;

    // Constructor
    public Warrior(String name, String classname, int health, String color) {
        super(name, classname, health); // Call superclass constructor
        this.color = color;
    }

    // Method to display warrior information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method to display basic information
        color = "Red";
        System.out.println("Color Changed: " + color);
    }
    // Method to reduce incoming damage by half
    @Override
    public void deleteHealth(int damage) {
        int halfDamage = damage / 2;
        super.deleteHealth(halfDamage);
    }
}
