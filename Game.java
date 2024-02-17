public class Game {
    public static void main(String[] args) {   
        Player player1 = new Novice("John", "Novice", 100);
        player1.displayInfo();
        player1.deleteHealth(40);
        player1.displayInfo();

        Player player2 = new Warrior("Aragon", "Warrior", 100, "Red");
        player2.displayInfo();
        player2.deleteHealth(40);
        player2.displayInfo();
    }
}