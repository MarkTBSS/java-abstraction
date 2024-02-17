public class Novice {
    private String name;
    private String classname;
    private int health;
    // Constructor
    public Novice(String name, String classname, int health) {
        this.name = name;
        this.classname = classname;
        this.health = health;
    }
    public void displayInfo() {
        System.out.println("Player Name: " + name);
        System.out.println("Player Classname: " + classname);
        System.out.println("Player Health: " + health);
    }
    // Method to display player information
    public void deleteHealth(int damage) {
        if (damage >= health) {
            health = 0;
        } else {
            health -= damage;
        }
    }
}