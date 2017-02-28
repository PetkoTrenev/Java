package noencapsulation;

/**
 * Created by Petko-PC on 2/20/2017.
 */
public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0){
            System.out.println("Player knocked out.");
            // reduce lives of player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
