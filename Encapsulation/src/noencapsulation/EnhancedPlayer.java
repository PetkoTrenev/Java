package noencapsulation;

/**
 * Created by Petko-PC on 2/20/2017.
 */
public class EnhancedPlayer {

    // Encapsulation
    // Even after the name change it runs because of the getter !!!
    private String fullName;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;

        // Validation of a parameter, more control
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints <= 0){
            System.out.println("Player knocked out.");
            // reduce lives of player
        }
    }

    public int getHealth () {
        return this.hitPoints;
    }


}
