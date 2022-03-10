package pkg2dgameengine;

import GameLibrary.*;

/**
 *
 * @author Liam Hayden
 * 
 * Date: 20/01/2022 - 19/02/2022 - 22/02/2022
 */
public class Main {
    
    public static void main(String[] args) {
        // create enemy
        Enemy enemy1 = new Enemy();
        
        // set enemy1 properties
        enemy1.setName("Speed o' Sound Sonic");
        enemy1.setAliveStatus(true);
        enemy1.setVisibleStatus(true);
        enemy1.setXLocation(3);
        enemy1.setYLocation(7);
        
        // create player
        Player player1 = new Player();
        
        // set player1 properties
        player1.setName("Saitama");
        player1.setAliveStatus(true);
        player1.setVisibleStatus(true);
        player1.setXLocation(13);
        player1.setYLocation(7);
        
        // Print enemy1 properties
        System.out.println("Name: " + enemy1.getName());
        enemy1.printLocations();
        
        // print player1 properties
        System.out.println("Name: " + player1.getName());
        player1.printLocations();
        
        // enemy jumps
        enemy1.jump();
        System.out.println("*Enemy jumps*\n" + "The enemy is now located at: ");
        // print new loation
        enemy1.printLocations();
        
        // player jumps
        player1.jump();
        System.out.println("*Player jumps*\n" + "The player is now located at: ");
        // print new location
        player1.printLocations();
        
        // enemy attack
        enemy1.attack();
        System.out.println("*Enemy attacks*\n" + "The enemy is now located at: ");
        // location
        enemy1.printLocations();
        
        // player retreat
        player1.retreat();
        System.out.println("*Player retreats*\n" + "The player is now located at: ");
        // location
        player1.printLocations();
        
        // PART 2
        
        // create vectors
        Vector PlayerVect1 = new Vector(player1.getXLocation(), player1.getYLocation());
        
        // create vector using scaler
        Vector PlayerVect2 = PlayerVect1.multipleVector(7);
        
        // print components
        System.out.println("PlayerVect2 details: ");
        PlayerVect2.printVectorDetails();
        
        // create Enemy vector
        Vector EnemyVect1 = new Vector(enemy1.getXLocation(), enemy1.getYLocation());
        
        // create new Player vector
        Vector PlayerVect3 = PlayerVect2.addTwoVectors(PlayerVect2, EnemyVect1);
                
        // print components
        System.out.println("PlayerVect3 details: ");
        PlayerVect3.printVectorDetails();
    }
    
}

