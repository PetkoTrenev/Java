package noencapsulation;

/**
 * Created by Petko-PC on 2/20/2017.
 */
public class PlayerTester {
    public static void main(String[] args) {

        /*
        // Public fields all accessible everywhere
        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        // No control ! ! !
        *//*
        * Control should be handled
        * with the presence of private fields
        * *//*
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        */

        EnhancedPlayer enhancedplayer = new EnhancedPlayer("Gosho Goshkov", 50, "sword");
        System.out.println("Initial health is " + enhancedplayer.getHealth());

        EnhancedPlayer enhancedplayer2 = new EnhancedPlayer("Gosho Goshkov", 0, "sword");
        System.out.println("Initial health is " + enhancedplayer2.getHealth());
    }
}
