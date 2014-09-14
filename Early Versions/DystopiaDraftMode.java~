//Armor, Distance, Map, Directions, Weapons, Statistics, and other Items
//Possible inclusion of JOptionPane? Probably not, leave out
//import javax.swing.JOptionPane;
//import java.util.Random;
import java.util.Scanner;
public class Dystopia {
  public static int playerHP = 100;
  public static int maxPlayerHP = 100;
  public static int playerMP = 100;
  public static int maxPlayerMP = 100;
  public static int playerEXP = 0;
  public static int playerLVL = 1;
  public static Scanner input = new Scanner(System.in);
  public static String name;
  public static void main(String[] args) { //Execute main method: entrance to Dystopia
    System.out.println("Hello. What is your name today?");
    name = input.next();
    System.out.println("Hello, "+name+". You are a hero among your people, and have taken upon the task to travel to the dungeon of Dystopia and end its evil once and for all.");
    System.out.println("You are currently level "+playerLVL+" with "+maxPlayerHP+" maximum HP and "+maxPlayerMP+" maximum MP.");
    System.out.println("You stand at the entrance of Dystopia. Press 1 to enter or 2 to leave.");
    int entrance = input.nextInt();
    if (entrance == 1) {
      System.out.println("You enter the darkness of the dungeon.\nYou see something in the darkness!");
      Pick((int)(Math.random()*2));
    } else if (entrance == 2) {
      System.out.println("You leave the risks and the rewards of the dungeon behind, and return to the safety of your home in disgrace for your cowardice.");
    } else 
      System.out.println("INVALID NUMBER. PRESS 1 OR 2 ONLY. You do nothing. Please try again, this time with 1 to enter or 2 to leave.");
  }
  public static void Pick(int creature) { //Pick method: one of three creatures
    switch (creature) {
      case 0: //first case is goblin
        System.out.println("It's a Goblin! What do you want to do, fight or run?");
        System.out.println("Press 1 to fight or 2 to run.");
        int option1 = input.nextInt();
        if (option1 == 1) {
          int playerHPLeft = playerHP;
          int goblinHPLeft = 100;
          while ((playerHPLeft > 0)&&(goblinHPLeft > 0)) {
            System.out.println("Press 1 to attack the goblin, 2 to cast a spell, 3 to use an HP potion, and 4 to use a MP potion.");
            int element = input.nextInt();
            if (element == 1) {
              int temp = (int)(Math.random()*14+1);
              int crit1 = (int)(Math.random()*99+1);
              if ((crit1 > 0)&&(crit1 <= 15)) {
                System.out.println("You hit the goblin for a critical strike!");
                goblinHPLeft = CombatGoblin((temp*2),goblinHPLeft);
              } else 
                goblinHPLeft = CombatGoblin(temp,goblinHPLeft);
            } else if (element == 2) {
              if (playerLVL < 5) {
                System.out.println("You are too low level to know any spells.");
              } else if ((playerLVL >= 5)&&(playerLVL < 10)) {
                System.out.println("You can cast one spell.\nPress 1 to cast Fireball.");
                int cast = input.nextInt();
                if (playerMP >= 50) {
                  if (cast == 1) {
                    System.out.println("Fireball deals 25-45 damage to an enemy and 5-10 damage to you. Costs 50 MP.");
                    int castdamage = ((int)(Math.random()*15+25));
                    int selfdamage = ((int)(Math.random()*5+5));
                    goblinHPLeft = goblinHPLeft - castdamage;
                    playerHPLeft = playerHPLeft - selfdamage;
                    System.out.println("Your fireball deals "+castdamage+" damage to the goblin! You take "+selfdamage+" damage from the backlash, leaving you at "+playerHPLeft+" HP.");
                    playerMP = playerMP - 50;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The goblin burns! He has "+goblinHPLeft+" HP left.");
                  } else 
                    System.out.println("You do nothing.");
                } else
                  System.out.println("You do not have enough MP to cast fireball. You do nothing.");
              } else if ((playerLVL >= 10)&&(playerLVL < 15)) {
                System.out.println("You can cast two spells.\nPress 1 to cast Fireball or 2 to cast Shock Lance.");
                int cast2 = input.nextInt();
                switch (cast2) {
                  case 1:
                    if (playerMP >= 50) {
                    System.out.println("Fireball deals 25-45 damage to an enemy and 5-10 damage to you. Costs 50 MP.");
                    int castdamage = ((int)(Math.random()*25+30));
                    int selfdamage = ((int)(Math.random()*5+5));
                    goblinHPLeft = goblinHPLeft - castdamage;
                    playerHPLeft = playerHPLeft - selfdamage;
                    System.out.println("Your fireball deals "+castdamage+" damage to the goblin! You take "+selfdamage+" damage from the backlash, leaving you at "+playerHPLeft+" HP.");
                    playerMP = playerMP - 50;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The goblin burns! He has "+goblinHPLeft+" HP left.");
                  } else
                    System.out.println("You do not have enough MP to cast fireball.");
                    break;
                  case 2:
                    if (playerMP >= 75) {
                    System.out.println("Shock Lance deals 15-30 damage to an enemy, then shocks the enemy again for an additional 15-30 damage. Costs 75 MP.");
                    int castdamage = ((int)(Math.random()*15+15));
                    int castdamage2 = ((int)(Math.random()*15+15));
                    System.out.println("Your shock lance deals "+castdamage+" initial damage and "+castdamage2+" additional damage to the goblin!");
                    goblinHPLeft = goblinHPLeft - castdamage - castdamage2;
                    playerMP = playerMP - 75;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The goblin writhes as electricity arcs around his body! He has "+goblinHPLeft+" HP left.");
                  } else
                    System.out.println("You do not have enough MP to cast shock lance.");
                    break;
                  default:
                    System.out.println("You do nothing.");
                    break;
                }
              } else if (playerLVL >= 15) {
                System.out.println("You can cast three spells\nPress 1 to cast Fireball, 2 to cast Shock Lance, and 3 to cast Shard Spray.");
                int cast3 = input.nextInt();
                switch (cast3) {
                  case 1:
                    if (playerMP >= 50) {
                    System.out.println("Fireball deals 25-45 damage to an enemy and 5-10 damage to you. Costs 50 MP.");
                    int fireballdamage = ((int)(Math.random()*15+25));
                    int selfdamage = ((int)(Math.random()*5+5));
                    System.out.println("Your fireball deals "+fireballdamage+" damage to the goblin! You take "+selfdamage+" damage from the backlash, leaving you at "+playerHPLeft+" HP.");
                    goblinHPLeft = goblinHPLeft - fireballdamage;
                    playerHPLeft = playerHPLeft - selfdamage;
                    playerMP = playerMP - 50;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The goblin burns! He has "+goblinHPLeft+" HP left.");
                  } else 
                    System.out.println("You do not have enough MP to cast fireball.");
                    break;
                  case 2:
                    if (playerMP >= 75) {
                    System.out.println("Shock Lance deals 15-30 damage to an enemy, then shocks the enemy again for an additional 15-30 damage. Costs 75 MP.");
                    int sldamage = ((int)(Math.random()*15+15));
                    int sldamage2 = ((int)(Math.random()*15+15));
                    System.out.println("Your shock lance deals "+sldamage+" initial damage and "+sldamage2+" additional damage to the goblin!");
                    goblinHPLeft = goblinHPLeft - sldamage - sldamage2;
                    playerMP = playerMP - 75;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The goblin writhes as electricity arcs around his body! He has "+goblinHPLeft+" HP left.");
                  } else
                    System.out.println("You do not have enough MP to cast shock lance.");
                    break;
                  case 3:
                    if (playerMP >= 125) {
                    System.out.println("Shard Spray deals between 8-17 damage to an enemy four times. Costs 125 MP.");
                    int castdamage = ((int)(Math.random()*9+8));
                    int castdamage2 = ((int)(Math.random()*9+8));
                    int castdamage3 = ((int)(Math.random()*9+8));
                    int castdamage4 = ((int)(Math.random()*9+8));
                    System.out.println("Your shard spray deals "+castdamage+", "+castdamage2+", "+castdamage3+", and "+castdamage4+" damage to the goblin!");
                    goblinHPLeft = goblinHPLeft - castdamage - castdamage2 - castdamage3 - castdamage4;
                    playerMP = playerMP - 125;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The goblin screams in fury and pain as the shards rip through his body! He has "+goblinHPLeft+" HP left.");
                  } else
                    System.out.println("You do not have enough MP to cast shard spray.");
                    break;
                  default: 
                    System.out.println("You do nothing.");
                    break;
                }
              }
            } else if (element == 3) {
              int hpHealed = ((int)(Math.random()*30+20));
              if (playerHPLeft <= maxPlayerHP) {
                System.out.println("You drink an HP potion. It heals you for "+hpHealed+" hp.");
                playerHPLeft = playerHPLeft + hpHealed;
                if (playerHPLeft > maxPlayerHP) {
                  playerHPLeft = maxPlayerHP;
                  System.out.println("You cannot heal beyond your max HP.");
                }
                System.out.println("You now have "+playerHPLeft+" HP.");
              }
            } else if (element == 4) {
              int mpRestored = ((int)(Math.random()*30+20));
              if (playerMP <= maxPlayerMP) {
                System.out.println("You drink a MP potion. It restores "+mpRestored+" of your mp.");
                playerMP = playerMP + mpRestored;
                if (playerMP > maxPlayerMP) {
                  playerMP = maxPlayerMP;
                  System.out.println("You cannot restore more MP than your max MP.");
                }
                System.out.println("You now have "+playerMP+" MP.");
              }
            } else
              System.out.println("Press 1, 2 or 3 only! Your moment of hesitation left your defenses open!");
            int crit2 = (int)(Math.random()*99+1);
            int temp2 = (int)(Math.random()*14+1);
            if ((crit2 > 0)&&(crit2 <= 15)) {
              System.out.println("The goblin hits you for a critical strike!");
              playerHPLeft = CombatPlayer((temp2*2),playerHPLeft);
            } else
              playerHPLeft = CombatPlayer(temp2,playerHPLeft);
          }
          if (goblinHPLeft <= 0) {
            playerHP = playerHPLeft;
            System.out.println("The goblin died!");
            int goblinEXPgain = ((int)(Math.random()*50+50));
            playerEXP(goblinEXPgain);
            System.out.println("You continue down into the darkness...");
            Pick((int)(Math.random()*3));
          } else
            System.out.println("You died a heroic death, and your name will be forever remembered among the heroes that attempted the dangers of Dystopia.");
        } else if (option1 == 2) {
          System.out.println("You run back the way you came. The goblin chases you, but you give it the slip around one of the dark cavern corners."); 
          System.out.println("*******************************\n*******************************\n*******************************");
          System.out.println("You check if the coast is clear, then once again, you walk into the darkness. Suddenly, you hear a noise!");
          Pick((int)(Math.random()*3));
        } else
          System.out.println("You took too long to decide, so the goblin lunged out with his sword and impaled your heart.");
        break;
      case 1: //second case is troll
        System.out.println("It's a Troll! What do you want to do, fight or run?");
        System.out.println("Press 1 to fight or 2 to run.");
        int option2 = input.nextInt();
        if (option2 == 1) {
          int playerHPLeft2 = playerHP;
          int trollHPLeft = 150;
          while ((playerHPLeft2 > 0)&&(trollHPLeft > 0)) {
            System.out.println("Press 1 to attack the troll, 2 to cast a spell, 3 to use an HP potion, and 4 to use a MP potion.");
            int element2 = input.nextInt();
            if (element2 == 1) {
              int temp = (int)(Math.random()*14+1);
              int crit1 = (int)(Math.random()*99+1);
              if ((crit1 > 0)&&(crit1 <= 15)) {
                System.out.println("You hit the troll for a critical strike!");
                trollHPLeft = CombatTroll((temp*2), trollHPLeft);
              } else
              trollHPLeft = CombatTroll(temp,trollHPLeft);
            } else if (element2 == 2) {
              if (playerLVL < 5) {
                System.out.println("You are too low level to know any spells.");
              } else if ((playerLVL >= 5)&&(playerLVL < 10)) {
                System.out.println("You can cast one spell.\nPress 1 to cast Fireball.");
                int cast = input.nextInt();
                if (playerMP >= 50) {
                  if (cast == 1) {
                    System.out.println("Fireball deals 25-45 damage to an enemy and 5-10 damage to you. Costs 50 MP.");
                    int castdamage = ((int)(Math.random()*15+25));
                    int selfdamage = ((int)(Math.random()*5+5));
                    trollHPLeft = trollHPLeft - castdamage;
                    playerHPLeft2 = playerHPLeft2 - selfdamage;
                    System.out.println("Your fireball deals "+castdamage+" damage to the troll! You take "+selfdamage+" damage from the backlash, leaving you at "+playerHPLeft2+" HP.");
                    playerMP = playerMP - 50;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The troll burns! He has "+trollHPLeft+" HP left.");
                  } else 
                    System.out.println("You do nothing.");
                } else
                  System.out.println("You do not have enough MP to cast fireball. You do nothing.");
              } else if ((playerLVL >= 10)&&(playerLVL < 15)) {
                System.out.println("You can cast two spells.\nPress 1 to cast Fireball or 2 to cast Shock Lance.");
                int cast2 = input.nextInt();
                switch (cast2) {
                  case 1:
                    if (playerMP >= 50) {
                    System.out.println("Fireball deals 25-45 damage to an enemy and 5-10 damage to you. Costs 50 MP.");
                    int castdamage = ((int)(Math.random()*25+30));
                    int selfdamage = ((int)(Math.random()*5+5));
                    trollHPLeft = trollHPLeft - castdamage;
                    playerHPLeft2 = playerHPLeft2 - selfdamage;
                    System.out.println("Your fireball deals "+castdamage+" damage to the troll! You take "+selfdamage+" damage from the backlash, leaving you at "+playerHPLeft2+" HP.");
                    playerMP = playerMP - 50;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The troll burns! He has "+trollHPLeft+" HP left.");
                  } else
                    System.out.println("You do not have enough MP to cast fireball.");
                    break;
                  case 2:
                    if (playerMP >= 75) {
                    System.out.println("Shock Lance deals 15-30 damage to an enemy, then shocks the enemy again for an additional 15-30 damage. Costs 75 MP.");
                    int castdamage = ((int)(Math.random()*15+15));
                    int castdamage2 = ((int)(Math.random()*15+15));
                    System.out.println("Your shock lance deals "+castdamage+" initial damage and "+castdamage2+" additional damage to the troll!");
                    trollHPLeft = trollHPLeft - castdamage - castdamage2;
                    playerMP = playerMP - 75;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The troll writhes as electricity arcs around his body! He has "+trollHPLeft+" HP left.");
                  } else
                    System.out.println("You do not have enough MP to cast shock lance.");
                    break;
                  default:
                    System.out.println("You do nothing.");
                    break;
                }
              } else if (playerLVL >= 15) {
                System.out.println("You can cast three spells\nPress 1 to cast Fireball, 2 to cast Shock Lance, and 3 to cast Shard Spray.");
                int cast3 = input.nextInt();
                switch (cast3) {
                  case 1:
                    if (playerMP >= 50) {
                    System.out.println("Fireball deals 25-45 damage to an enemy and 5-10 damage to you. Costs 50 MP.");
                    int fireballdamage = ((int)(Math.random()*15+25));
                    int selfdamage = ((int)(Math.random()*5+5));
                    System.out.println("Your fireball deals "+fireballdamage+" damage to the troll! You take "+selfdamage+" damage from the backlash, leaving you at "+playerHPLeft2+" HP.");
                    trollHPLeft = trollHPLeft - fireballdamage;
                    playerHPLeft2 = playerHPLeft2 - selfdamage;
                    playerMP = playerMP - 50;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The troll burns! He has "+trollHPLeft+" HP left.");
                  } else 
                    System.out.println("You do not have enough MP to cast fireball.");
                    break;
                  case 2:
                    if (playerMP >= 75) {
                    System.out.println("Shock Lance deals 15-30 damage to an enemy, then shocks the enemy again for an additional 15-30 damage. Costs 75 MP.");
                    int sldamage = ((int)(Math.random()*15+15));
                    int sldamage2 = ((int)(Math.random()*15+15));
                    System.out.println("Your shock lance deals "+sldamage+" initial damage and "+sldamage2+" additional damage to the troll!");
                    trollHPLeft = trollHPLeft - sldamage - sldamage2;
                    playerMP = playerMP - 75;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The troll writhes as electricity arcs around his body! He has "+trollHPLeft+" HP left.");
                  } else
                    System.out.println("You do not have enough MP to cast shock lance.");
                    break;
                  case 3:
                    if (playerMP >= 125) {
                    System.out.println("Shard Spray deals between 8-17 damage to an enemy four times. Costs 125 MP.");
                    int castdamage = ((int)(Math.random()*9+8));
                    int castdamage2 = ((int)(Math.random()*9+8));
                    int castdamage3 = ((int)(Math.random()*9+8));
                    int castdamage4 = ((int)(Math.random()*9+8));
                    System.out.println("Your shard spray deals "+castdamage+", "+castdamage2+", "+castdamage3+", and "+castdamage4+" damage to the troll!");
                    trollHPLeft = trollHPLeft - castdamage - castdamage2 - castdamage3 - castdamage4;
                    playerMP = playerMP - 125;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The troll screams in fury and pain as the shards rip through his body! He has "+trollHPLeft+" HP left.");
                  } else
                    System.out.println("You do not have enough MP to cast shard spray.");
                    break;
                  default: 
                    System.out.println("You do nothing.");
                    break;
                }
              }
            }  else if (element2 == 3) {
              int hpHealed = ((int)(Math.random()*30+20));
              if (playerHPLeft2 <= maxPlayerHP) {
                System.out.println("You drink a potion. It heals you for "+hpHealed+" hp.");
                playerHPLeft2 = playerHPLeft2 + hpHealed;
                if (playerHPLeft2 > maxPlayerHP) {
                  playerHPLeft2 = maxPlayerHP;
                  System.out.println("You cannot heal beyond your max HP.");
                }
                System.out.println("You now have "+playerHPLeft2+" HP.");
              }
            } else if (element2 == 4) {
              int mpRestored = ((int)(Math.random()*30+20));
              if (playerMP <= maxPlayerMP) {
                System.out.println("You drink a MP potion. It restores "+mpRestored+" of your mp.");
                playerMP = playerMP + mpRestored;
                if (playerMP > maxPlayerMP) {
                  playerMP = maxPlayerMP;
                  System.out.println("You cannot restore more MP than your max MP.");
                }
                System.out.println("You now have "+playerMP+" MP.");
              }
            } else
              System.out.println("Press 1, 2 or 3 only! Your moment of hesitation left your defenses open!");
            int crit2 = (int)(Math.random()*99+1);
            int temp2 = (int)(Math.random()*19+1);
            if ((crit2 > 0)&&(crit2 <= 30)) {
              System.out.println("The troll hits you for a critical strike!");
              playerHPLeft2 = CombatPlayer((temp2*2),playerHPLeft2);
            } else
              playerHPLeft2 = CombatPlayer(temp2,playerHPLeft2);
          }
          if (trollHPLeft <= 0) {
            playerHP = playerHPLeft2;
            System.out.println("The troll died!");
            int trollEXPgain = ((int)(Math.random()*50+100));
            playerEXP(trollEXPgain);
            System.out.println("You continue down into the darkness...");
            Pick((int)(Math.random()*3));
          } else
            System.out.println("You died a heroic death, and your name will be forever remembered among the heroes that attempted the dangers of Dystopia.");
        } else if (option2 == 2) {
          System.out.println("You run back the way you came. The troll chases you, but you give it the slip around one of the dark cavern corners."); 
          System.out.println("*******************************\n*******************************\n*******************************");
          System.out.println("You check if the coast is clear, then once again, you walk into the darkness. Suddenly, you hear a noise!");
          Pick((int)(Math.random()*3));
        } else
          System.out.println("You took too long to decide, so the troll charged you and viciously ripped you to shreds with its claws.");
        break;
      case 2: //third case is imp
        System.out.println("It's an Imp! What do you want to do, fight or run?");
        System.out.println("Press 1 to fight or 2 to run.");
        int option3 = input.nextInt();
        if (option3 == 1) {
          int playerHPLeft3 = playerHP;
          int impHPLeft = 50;
          while ((playerHPLeft3 > 0)&&(impHPLeft > 0)) {
            System.out.println("Press 1 to attack the imp, 2 to cast a spell, 3 to use an HP potion, and 4 to use a MP potion.");
            int element3 = input.nextInt();
            if (element3 == 1) {
              int temp = (int)(Math.random()*14+1);
              int crit = (int)(Math.random()*99+1);
              if ((crit > 0)&&(crit <= 15)) {
                System.out.println("You hit the imp for a critical strike!");
                impHPLeft = CombatImp((temp*2),impHPLeft);
              } else
              impHPLeft = CombatImp(temp,impHPLeft);
            } else if (element3 == 2) {
              if (playerLVL < 5) {
                System.out.println("You are too low level to know any spells.");
              } else if ((playerLVL >= 5)&&(playerLVL < 10)) {
                System.out.println("You can cast one spell.\nPress 1 to cast Fireball.");
                int cast = input.nextInt();
                if (playerMP >= 50) {
                  if (cast == 1) {
                    System.out.println("Fireball deals 25-45 damage to an enemy and 5-10 damage to you. Costs 50 MP.");
                    int castdamage = ((int)(Math.random()*15+25));
                    int selfdamage = ((int)(Math.random()*5+5));
                    impHPLeft = impHPLeft - castdamage;
                    playerHPLeft3 = playerHPLeft3 - selfdamage;
                    System.out.println("Your fireball deals "+castdamage+" damage to the imp! You take "+selfdamage+" damage from the backlash, leaving you at "+playerHPLeft3+" HP.");
                    playerMP = playerMP - 50;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The imp burns! He has "+impHPLeft+" HP left.");
                  } else 
                    System.out.println("You do nothing.");
                } else
                  System.out.println("You do not have enough MP to cast fireball. You do nothing.");
              } else if ((playerLVL >= 10)&&(playerLVL < 15)) {
                System.out.println("You can cast two spells.\nPress 1 to cast Fireball or 2 to cast Shock Lance.");
                int cast2 = input.nextInt();
                switch (cast2) {
                  case 1:
                    if (playerMP >= 50) {
                    System.out.println("Fireball deals 25-45 damage to an enemy and 5-10 damage to you. Costs 50 MP.");
                    int castdamage = ((int)(Math.random()*25+30));
                    int selfdamage = ((int)(Math.random()*5+5));
                    impHPLeft = impHPLeft - castdamage;
                    playerHPLeft3 = playerHPLeft3 - selfdamage;
                    System.out.println("Your fireball deals "+castdamage+" damage to the imp! You take "+selfdamage+" damage from the backlash, leaving you at "+playerHPLeft3+" HP.");
                    playerMP = playerMP - 50;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The imp burns! He has "+impHPLeft+" HP left.");
                  } else
                    System.out.println("You do not have enough MP to cast fireball.");
                    break;
                  case 2:
                    if (playerMP >= 75) {
                    System.out.println("Shock Lance deals 15-30 damage to an enemy, then shocks the enemy again for an additional 15-30 damage. Costs 75 MP.");
                    int castdamage = ((int)(Math.random()*15+15));
                    int castdamage2 = ((int)(Math.random()*15+15));
                    System.out.println("Your shock lance deals "+castdamage+" initial damage and "+castdamage2+" additional damage to the imp!");
                    impHPLeft = impHPLeft - castdamage - castdamage2;
                    playerMP = playerMP - 75;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The imp writhes as electricity arcs around his body! He has "+impHPLeft+" HP left.");
                  } else
                    System.out.println("You do not have enough MP to cast shock lance.");
                    break;
                  default:
                    System.out.println("You do nothing.");
                    break;
                }
              } else if (playerLVL >= 15) {
                System.out.println("You can cast three spells\nPress 1 to cast Fireball, 2 to cast Shock Lance, and 3 to cast Shard Spray.");
                int cast3 = input.nextInt();
                switch (cast3) {
                  case 1:
                    if (playerMP >= 50) {
                    System.out.println("Fireball deals 25-45 damage to an enemy and 5-10 damage to you. Costs 50 MP.");
                    int fireballdamage = ((int)(Math.random()*15+25));
                    int selfdamage = ((int)(Math.random()*5+5));
                    System.out.println("Your fireball deals "+fireballdamage+" damage to the imp! You take "+selfdamage+" damage from the backlash, leaving you at "+playerHPLeft3+" HP.");
                    impHPLeft = impHPLeft - fireballdamage;
                    playerHPLeft3 = playerHPLeft3 - selfdamage;
                    playerMP = playerMP - 50;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The imp burns! He has "+impHPLeft+" HP left.");
                  } else 
                    System.out.println("You do not have enough MP to cast fireball.");
                    break;
                  case 2:
                    if (playerMP >= 75) {
                    System.out.println("Shock Lance deals 15-30 damage to an enemy, then shocks the enemy again for an additional 15-30 damage. Costs 75 MP.");
                    int sldamage = ((int)(Math.random()*15+15));
                    int sldamage2 = ((int)(Math.random()*15+15));
                    System.out.println("Your shock lance deals "+sldamage+" initial damage and "+sldamage2+" additional damage to the imp!");
                    impHPLeft = impHPLeft - sldamage - sldamage2;
                    playerMP = playerMP - 75;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The imp writhes as electricity arcs around his body! He has "+impHPLeft+" HP left.");
                  } else
                    System.out.println("You do not have enough MP to cast shock lance.");
                    break;
                  case 3:
                    if (playerMP >= 125) {
                    System.out.println("Shard Spray deals between 8-17 damage to an enemy four times. Costs 125 MP.");
                    int castdamage = ((int)(Math.random()*9+8));
                    int castdamage2 = ((int)(Math.random()*9+8));
                    int castdamage3 = ((int)(Math.random()*9+8));
                    int castdamage4 = ((int)(Math.random()*9+8));
                    System.out.println("Your shard spray deals "+castdamage+", "+castdamage2+", "+castdamage3+", and "+castdamage4+" damage to the imp!");
                    impHPLeft = impHPLeft - castdamage - castdamage2 - castdamage3 - castdamage4;
                    playerMP = playerMP - 125;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The imp screams in fury and pain as the shards rip through his body! He has "+impHPLeft+" HP left.");
                  } else
                    System.out.println("You do not have enough MP to cast shard spray.");
                    break;
                  default: 
                    System.out.println("You do nothing.");
                    break;
                }
              }
            }  else if (element3 == 3) {
              int hpHealed = ((int)(Math.random()*30+20));
              if (playerHPLeft3 <= maxPlayerHP) {
                System.out.println("You drink a potion. It heals you for "+hpHealed+" hp.");
                playerHPLeft3 = playerHPLeft3 + hpHealed;
                if (playerHPLeft3 > maxPlayerHP) {
                  playerHPLeft3 = maxPlayerHP;
                  System.out.println("You cannot heal beyond your max HP.");
                }
                System.out.println("You now have "+playerHPLeft3+" HP.");
              }
            } else if (element3 == 4) {
              int mpRestored = ((int)(Math.random()*30+20));
              if (playerMP <= maxPlayerMP) {
                System.out.println("You drink a MP potion. It restores "+mpRestored+" of your mp.");
                playerMP = playerMP + mpRestored;
                if (playerMP > maxPlayerMP) {
                  playerMP = maxPlayerMP;
                  System.out.println("You cannot restore more MP than your max MP.");
                }
                System.out.println("You now have "+playerMP+" MP.");
              }
            } else 
              System.out.println("Press 1, 2 or 3 only! Your moment of hesitation left your defenses open!");
            int crit2 = (int)(Math.random()*99+1);
            int temp2 = (int)(Math.random()*4+1);
            if ((crit2 > 0)&&(crit2 <= 75)) {
              System.out.println("The imp hits you for a critical strike!");
              playerHPLeft3 = CombatPlayer((temp2*2),playerHPLeft3);
            } else 
              playerHPLeft3 = CombatPlayer(temp2,playerHPLeft3);
          }
          if (impHPLeft <= 0) {
            playerHP = playerHPLeft3;
            System.out.println("The imp died!");
            int impEXPgain = ((int)(Math.random()*30+20));
            playerEXP(impEXPgain);
            System.out.println("You continue down into the darkness...");
            Pick((int)(Math.random()*3));
          } else
            System.out.println("You died a heroic death, and your name will be forever remembered among the heroes that attempted the dangers of Dystopia.");
        } else if (option3 == 2) {
          System.out.println("You run back the way you came. The imp chases you, but you give it the slip around one of the dark cavern corners."); 
          System.out.println("*******************************\n*******************************\n*******************************");
          System.out.println("You check if the coast is clear, then once again, you walk into the darkness. Suddenly, you hear a noise!");
          Pick((int)(Math.random()*3));
        } else
          System.out.println("You took too long to decide, so the imp snuck around you and slit your throat.");
        break;
      default:
        System.out.println("It was your imagination...\nYou continue into the depths.");
        System.out.println("*******************************\n*******************************\n*******************************");
        System.out.println("You turn a corner of the labyrinthine caverns and see an outline in the darkness...");
        Pick((int)(Math.random()*3));
        break;
    }
  } //the combatgoblin method that deals with player damage to goblin
  public static int CombatGoblin(int playerdamage, int goblinhp) {
    int dodge = (int)(Math.random()*99+1);
    if ((dodge > 0)&&(dodge <= 10)) {
      System.out.println("The goblin dodged your attack!");
      return goblinhp;
    } else {
      goblinhp = goblinhp - playerdamage;
      System.out.println("You strike the goblin for "+playerdamage+" damage! The goblin has "+goblinhp+" hp left.");
      return goblinhp;
    }
  } //the combattroll method that deals with player damage to troll
  public static int CombatTroll(int playerdamage, int trollhp) {
    int dodge = (int)(Math.random()*99+1);
    if ((dodge > 0)&&(dodge <= 5)) {
      System.out.println("The troll dodged your attack!");
      return trollhp;
    } else {
      trollhp = trollhp - playerdamage;
      System.out.println("You strike the troll for "+playerdamage+" damage! The troll has "+trollhp+" hp left.");
      return trollhp;
    }
  } //the combatimp method that deals with player damage to imp
  public static int CombatImp(int playerdamage, int imphp) {
    int dodge = (int)(Math.random()*99+1);
    if ((dodge > 0)&&(dodge <= 50)) {
      System.out.println("The imp dodged your attack!");
      return imphp;
    } else {
      imphp = imphp - playerdamage;
      System.out.println("You strike the imp for "+playerdamage+" damage! The imp has "+imphp+" hp left.");
      return imphp;
    }
  } //the combatplayer method that deals with enemy damage to player
  public static int CombatPlayer(int enemydamage, int playerhp) {
    int dodge = (int)(Math.random()*99+1);
    if ((dodge > 0)&&(dodge <= 15)) {
      System.out.println("You dodged the attack!");
      return playerhp;
    } else {
      playerhp = playerhp - enemydamage;
      System.out.println("Your adversary hits you for "+enemydamage+" damage! You have "+playerhp+" hp left.");
      return playerhp;
    }
  } //the playerEXP method deals with player experience points
  public static int playerEXP(int expGain) {
    System.out.println("You gained "+expGain+" EXP!");
    playerEXP = playerEXP + expGain;
    int expCap = 100;
    if (playerEXP >= expCap) {
      playerLVL++;
      System.out.println("You levelled up! You are now level "+playerLVL+"!");
      maxPlayerHP = maxPlayerHP + 25;
      maxPlayerMP = maxPlayerMP + 25;
      //playerHP = maxPlayerHP;
      playerMP = maxPlayerMP;
      System.out.println("You gained 25 max MP and HP! Your max HP and max MP are now "+maxPlayerHP+".");
      expCap = expCap + 50;
    }
    if (playerLVL >= 25) { //this ends the game at level 25
      System.out.println("You have grown in power such that you are capable of defeating and banishing the evil of Dystopia easily.");
      System.out.println("Your enemies flee before you, and as more of Dystopia empties, you claim the land for your people.");
      System.out.println("One day, these caverns and the land around it will become a thriving city, all a result of your heroic deeds.");
      System.out.println("Congratulations, you emerged from Dystopia victorious, with riches beyond your dreams!");
      System.out.println("Press 1 to leave.");
      int exit = input.nextInt();
      if (exit == 1) 
        System.exit(1);
    }
    return playerEXP;
  }
}