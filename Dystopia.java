//Armor, Distance, Map, Directions, Weapons, Statistics, and other Items
//Final boss or named mobs with special effects | 
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
  public static int expCap = 150;
  public static int playerLVL = 1;
  public static int golemcounter = 1;
  public static int lichMP = 100;
  public static int strength = 1;
  public static int intelligence = 1;
  public static int agility = 1;
  public static Scanner input = new Scanner(System.in);
  public static String name;
  public static void main(String[] args) { //Execute main method: entrance to Dystopia
    System.out.println("Hello. What is your name today?");
    name = input.next();
    System.out.println("Hello, "+name+". You are a hero among your people, and have taken upon the task to travel to the dungeon of Dystopia and end its evil once and for all.");
    System.out.println("You are currently level "+playerLVL+" with "+maxPlayerHP+" maximum HP and "+maxPlayerMP+" maximum MP.");
    System.out.println("You have "+strength+" strength, "+intelligence+" intelligence, and "+agility+" agility. Strength affects your weapon damage, intelligence affects your spell damage, and agility affects your dodge and critical chance.");
    System.out.println("You stand at the entrance of Dystopia. Press 1 to enter or 2 to leave.");
    int entrance = input.nextInt();
    if (entrance == 1) {
      System.out.println("You enter the darkness of the dungeon.\nYou see something in the darkness!");
      if (playerLVL < 10) {
        Pick((int)(Math.random()*4));
      } else if ((playerLVL >= 10)&&(playerLVL <= 25)) {
        Pick((int)(Math.random()*7));
      }
    } else if (entrance == 2) {
      System.out.println("You leave the risks and the rewards of the dungeon behind, and return to the safety of your home in disgrace for your cowardice.");
    } else 
      System.out.println("INVALID NUMBER. PRESS 1 OR 2 ONLY. You do nothing. Please try again, this time with 1 to enter or 2 to leave.");
  }
  public static void Pick(int creature) { //Pick method: one of three creatures
    switch (creature) {
      case 0: //first case is goblin
        combat("goblin",115,playerHP);
        break;
      case 1: //second case is troll
        combat("troll",150,playerHP);
        break;
      case 2: //third case is imp
        combat("imp",75,playerHP);
        break;
      case 3: //fourth case is orc
        combat("orc",100,playerHP);
        break;
      case 4: //fifth case is demon
        combat("demon",250,playerHP);
        break;
      case 5: //sixth case is lich
        combat("lich",200,playerHP);
        break;
      case 6: //seventh case is golem
        combat("golem",300,playerHP);
        break;
    }
  } //the combatplayer method that deals with enemy damage to player
  public static int CombatPlayer(int enemydamage, int playerhp) {
    int dodge = (int)(Math.random()*99+1);
    if ((dodge > 0)&&(dodge <= agilityModifierDodge(agility))) {
      System.out.println("You dodged the attack!");
      return playerhp;
    } else {
      playerhp = playerhp - enemydamage;
      System.out.println("Your adversary hits you for "+enemydamage+" damage! You have "+playerhp+" hp left.");
      return playerhp;
    }
  } //the combatenemy method that deals with player damage to enemies
  public static int CombatEnemy(String name2, int playerDamage, int enemyHealth) {
    if (name2 == "goblin") {
      int dodge = (int)(Math.random()*99+1);
      if ((dodge > 0)&&(dodge <= 10)) {
        System.out.println("The goblin dodged your attack!");
        return enemyHealth;
      } else {
        enemyHealth = enemyHealth - playerDamage;
        System.out.println("You strike the goblin for "+playerDamage+" damage! The goblin has "+enemyHealth+" hp left.");
        return enemyHealth;
      }
    } else if (name2 == "troll") {
      int dodge = (int)(Math.random()*99+1);
      if ((dodge > 0)&&(dodge <= 5)) {
        System.out.println("The troll dodged your attack!");
        return enemyHealth;
      } else {
        enemyHealth = enemyHealth - playerDamage;
        System.out.println("You strike the troll for "+playerDamage+" damage! The troll has "+enemyHealth+" hp left.");
        return enemyHealth;
      }
    } else if (name2 == "imp") {
      int dodge = (int)(Math.random()*99+1);
      if ((dodge > 0)&&(dodge <= 50)) {
        System.out.println("The imp dodged your attack!");
        return enemyHealth;
      } else {
        enemyHealth = enemyHealth - playerDamage;
        System.out.println("You strike the imp for "+playerDamage+" damage! The imp has "+enemyHealth+" hp left.");
        return enemyHealth;
      }
    } else if (name2 == "orc") {
      int dodge = (int)(Math.random()*99+1);
      if ((dodge > 0)&&(dodge <= 25)) {
        System.out.println("The orc dodged your attack!");
        return enemyHealth;
      } else {
        enemyHealth = enemyHealth - playerDamage;
        System.out.println("You strike the orc for "+playerDamage+" damage! The orc has "+enemyHealth+" hp left.");
        return enemyHealth;
      }
    } else if (name2 == "demon") {
      int dodge = (int)(Math.random()*99+1);
      if ((dodge > 0)&&(dodge <= 8)) {
        System.out.println("The demon dodged your attack!");
        return enemyHealth;
      } else {
        enemyHealth = enemyHealth - playerDamage;
        System.out.println("You strike the demon for "+playerDamage+" damage! The demon has "+enemyHealth+" hp left.");
        return enemyHealth;
      }
    } else if (name2 == "lich") {
      int dodge = (int)(Math.random()*99+1);
      if ((dodge > 0)&&(dodge <= 30)) {
        System.out.println("Suddenly, the lich is surrounded by impenetrable darkness, making it impossible to tell where the lich is!");
        return enemyHealth;
      } else {
        enemyHealth = enemyHealth - playerDamage;
        System.out.println("You strike the lich for "+playerDamage+" damage! The lich has "+enemyHealth+" hp left.");
        return enemyHealth;
      } 
    } else if (name2 == "golem") {
      int dodge = (int)(Math.random()*99+1);
      if ((dodge > 0)&&(dodge <= 20)) {
        System.out.println("The golem's rock hide partially liquefies, absorbing the impact of your strike!");
        return enemyHealth;
      } else {
        enemyHealth = enemyHealth - playerDamage;
        System.out.println("You strike the golem for "+playerDamage+" damage! The golem has "+enemyHealth+" hp left.");
        return enemyHealth;
      }
    } else return enemyHealth;
  } //the method that manages enemy damage and critical strikes
  public static int damageAndCrit(String symbol) {
    if (symbol == "goblin") {
      int crit = (int)(Math.random()*99+1);
      int temp = (int)(Math.random()*14+1);
      if ((crit > 0)&&(crit <= 15)) {
        System.out.println("The "+symbol+" hits you for a critical strike!");
        return (temp*2);
      } else {
        return temp;
      }
    } else if (symbol == "troll") {
      int crit = (int)(Math.random()*99+1);
      int temp = (int)(Math.random()*20+5);
      if ((crit > 0)&&(crit <= 10)) {
        System.out.println("The "+symbol+" hits you for a critical strike!");
        return (temp*2);
      } else {
        return temp;
      }
    } else if (symbol == "imp") {
      int crit = (int)(Math.random()*99+1);
      int temp = (int)(Math.random()*4+1);
      if ((crit > 0)&&(crit <= 50)) {
        System.out.println("The "+symbol+" hits you for a critical strike!");
        return (temp*2);
      } else {
        return temp;
      }
    } else if (symbol == "orc") {
      int crit = (int)(Math.random()*99+1);
      int temp = (int)(Math.random()*8+3);
      if ((crit > 0)&&(crit <= 25)) {
        System.out.println("The "+symbol+" hits you for a critical strike!");
        return (temp*2);
      } else {
        return temp;
      }
    } else if (symbol == "demon") {
      int crit = (int)(Math.random()*99+1);
      int temp = (int)(Math.random()*16+8);
      if ((crit > 0)&&(crit <= 8)) {
        System.out.println("The "+symbol+" hits you for a critical strike!");
        return (temp*2);
      } else {
        return temp;
      }
    } else if (symbol == "lich") {
      int crit = (int)(Math.random()*99+1);
      int temp = (int)(Math.random()*50+50);
      System.out.println("The lich draws in the remnants of its shadow power, empowering his physical attacks to an incredible degree!");
      if ((crit > 0)&&(crit <= 5)) {
        System.out.println("Time seems to slow down. The lich's hands pulse with dark power as it sees an opening in your defenses...");
        return (temp*2);
      } else {
        return temp;
      }
    } else if (symbol == "golem") {
      int crit = (int)(Math.random()*99+1);
      int temp = (int)(Math.random()*30+10);
      if ((crit > 0)&&(crit <= 8)) {
        System.out.println("The golem crouches slightly as a huge force gathers around its stone fist. Suddenly, it unleashes the stored power all at once!");
        return (temp*2);
      } else {
        return temp;
      }
    } else return 0;
  }
  public static void combat(String name,int enemyHP,int remainingPlayerHP) {
    System.out.println("It's a "+name+"! What do you want to do, fight or run?");
    System.out.println("Press 1 to fight or 2 to run.");
    int option1 = input.nextInt();
    if (option1 == 1) {
      while ((remainingPlayerHP > 0)&&(enemyHP > 0)) {
        System.out.println("Press 1 to attack the "+name+", 2 to cast a spell, 3 to use an HP potion, and 4 to use a MP potion.");
        int element = input.nextInt();
        if (element == 1) {
          int temp = strengthModifier(strength);
          int crit1 = (int)(Math.random()*99+1);
          if ((crit1 > 0)&&(crit1 <= agilityModifierCrit(agility))) {
            System.out.println("You hit the "+name+" for a critical strike!");
            enemyHP = CombatEnemy(name,(temp*2),enemyHP);
          } else {
            enemyHP = CombatEnemy(name,temp,enemyHP);
          }
        } else if (element == 2) {
          if (playerLVL < 5) {
            System.out.println("You are too low level to know any spells.");
          } else if ((playerLVL >= 5)&&(playerLVL < 10)) {
            System.out.println("You can cast one spell.\nPress 1 to cast Fireball.");
            int cast = input.nextInt();
            spellCastFiveToTen(cast,enemyHP,remainingPlayerHP,name);
          } else if ((playerLVL >= 10)&&(playerLVL < 15)) {
            System.out.println("You can cast two spells.\nPress 1 to cast Fireball or 2 to cast Shock Lance.");
            int cast2 = input.nextInt();
            spellCastTenToFifteen(cast2,enemyHP,remainingPlayerHP,name);
          } else if ((playerLVL >= 15)&&(playerLVL < 20)) {
            System.out.println("You can cast three spells\nPress 1 to cast Fireball, 2 to cast Shock Lance, and 3 to cast Shard Spray.");
            int cast3 = input.nextInt();
            spellCastFifteenToTwenty(cast3,enemyHP,remainingPlayerHP,name);
          } else if (playerLVL >= 20) {
            System.out.println("You can cast five spells\nPress 1 to cast Fireball, 2 to cast Shock Lance, 3 to cast Shard Spray, 4 to cast Holy Word and 5 to cast Healing Energy.");
            int cast4 = input.nextInt();
            spellCastTwentyPlus(cast4,enemyHP,remainingPlayerHP,name);
          }
        } else if (element == 3) {
          //int hpHealed = ((int)(Math.random()*30+20));
          int hpHealed = (maxPlayerHP/5);
          if (remainingPlayerHP <= maxPlayerHP) {
            System.out.println("You drink an HP potion. It heals you for "+hpHealed+" hp.");
            remainingPlayerHP = remainingPlayerHP + hpHealed;
            if (remainingPlayerHP > maxPlayerHP) {
              remainingPlayerHP = maxPlayerHP;
              System.out.println("You cannot heal beyond your max HP.");
            }
            System.out.println("You now have "+remainingPlayerHP+" HP.");
          }
        } else if (element == 4) {
          int mpRestored = (maxPlayerMP/4);
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
        if (name != "lich") {
          remainingPlayerHP = CombatPlayer(damageAndCrit(name),remainingPlayerHP);
        }
        if (name == "demon") {
          System.out.println("The demon's fire burns you for 5 damage!");
          remainingPlayerHP = remainingPlayerHP - 5;
          System.out.println("You have "+remainingPlayerHP+" HP left.");
        } else if (name == "lich") {
          if (lichMP > 0) {
            int lichcast = 0;
            if (lichMP > 0) {
              lichcast = ((int)(Math.random()*10+10));
              remainingPlayerHP = remainingPlayerHP - lichcast;
              lichMP = lichMP - 10;
            }
            System.out.println("The lich mutters a few ancient words of incredible power!");
            System.out.println("Your vision blurs and you scream as a bolt of searing agony tears through your body, dealing "+lichcast+" damage!");
            System.out.println("You have "+remainingPlayerHP+" HP left.");
          } else if (lichMP == 0) {
            CombatPlayer(damageAndCrit("lich"),remainingPlayerHP);
          }
        } else if (name == "golem") {
          if (golemcounter > 0) {
            int golemcrush = (int)(Math.random()*5+50);
            int avoidchance = (int)(Math.random()*99+1);
            System.out.println("The golem leaps, smashing the ground with incredible force!");
            if (avoidchance <= 50) {
              remainingPlayerHP = remainingPlayerHP - (golemcrush/2);
              System.out.println("You cross your arm and sword just in time to deflect some of the force of the shockwave! It deals half damage ("+(golemcrush/2)+") to you!");
              System.out.println("You have "+remainingPlayerHP+" HP left.");
            } else {
              remainingPlayerHP = remainingPlayerHP - golemcrush;
              System.out.println("You take the full force of the shockwave! It deals "+golemcrush+" damage to you!");
              System.out.println("You have "+remainingPlayerHP+" HP left.");
            }
            golemcounter = 0;
          }
        }
      }
      if (enemyHP <= 0) {
        playerHP = remainingPlayerHP;
        System.out.println("The "+name+" died!");
        playerEXP(experienceGain(name));
        playerMP = maxPlayerMP;
        lichMP = 100;
        golemcounter = 1;
        System.out.println("You continue down into the darkness...");
        if (playerLVL < 10) {
          Pick((int)(Math.random()*4));
        } else if ((playerLVL >= 10)&&(playerLVL <= 25)) {
          Pick((int)(Math.random()*7));
        }
      } else
        System.out.println("You died a heroic death, and your name will be forever remembered among the heroes that attempted the dangers of Dystopia.");
    } else if (option1 == 2) {
      System.out.println("You run back the way you came. The "+name+" chases you, but you give it the slip around one of the dark cavern corners."); 
      System.out.println("*******************************\n*******************************\n*******************************");
      System.out.println("You check if the coast is clear, then once again, you walk into the darkness. Suddenly, you hear a noise!");
      if (playerLVL < 10) {
        Pick((int)(Math.random()*4));
      } else if ((playerLVL >= 10)&&(playerLVL <= 25)) {
        Pick((int)(Math.random()*7));
      }
    } else
      System.out.println("You took too long to decide, so the "+name+" lunged out with his sword and impaled your heart.");
  } //method to deal with the spellcasts between level five and level ten
  public static void spellCastFiveToTen(int number, int enemyHPRemaining, int playerHPRemaining, String enemyName) {
    if (playerMP >= (playerLVL*5)) {
      if (number == 1) {
        System.out.println("Fireball deals damage to an enemy and damage to you.");
        int castdamage = intelligenceFireballModifier(intelligence);
        int selfdamage = fireballSelfDamageModifier(intelligence);
        enemyHPRemaining = enemyHPRemaining - castdamage;
        playerHPRemaining = playerHPRemaining - selfdamage;
        playerMP = playerMP - (playerLVL*5);
        System.out.println("Your fireball deals "+castdamage+" damage to the "+enemyName+"! You take "+selfdamage+" damage from the backlash, leaving you at "+playerHPRemaining+" HP.");
        System.out.println("You have "+playerMP+" MP left.");
        System.out.println("The "+enemyName+" burns! He has "+enemyHPRemaining+" HP left.");
      } else 
        System.out.println("You do nothing.");
    } else
      System.out.println("You do not have enough MP to cast fireball.");
  } //method to deal with the spellcasts between level ten and level fifteen
  public static void spellCastTenToFifteen(int number, int enemyHPRemaining, int playerHPRemaining, String enemyName) {
    switch (number) {
      case 1:
        if (playerMP >= (playerLVL*5)) {
        System.out.println("Fireball deals damage to an enemy and damage to you.");
        int castdamage = intelligenceFireballModifier(intelligence);
        int selfdamage = fireballSelfDamageModifier(intelligence);
        enemyHPRemaining = enemyHPRemaining - castdamage;
        playerHPRemaining = playerHPRemaining - selfdamage;
        playerMP = playerMP - (playerLVL*5);
        System.out.println("Your fireball deals "+castdamage+" damage to the "+enemyName+"! You take "+selfdamage+" damage from the backlash, leaving you at "+playerHPRemaining+" HP.");
        System.out.println("You have "+playerMP+" MP left.");
        System.out.println("The "+enemyName+" burns! He has "+enemyHPRemaining+" HP left.");
      } else
        System.out.println("You do not have enough MP to cast fireball.");
      break;
      case 2:
        if (playerMP >= (playerLVL*7)) {
        System.out.println("Shock Lance deals damage to an enemy, then shocks the enemy again for additional damage.");
        int castdamage = intelligenceShockLanceModifier(intelligence);
        int castdamage2 = intelligenceShockLanceModifier(intelligence);
        System.out.println("Your shock lance deals "+castdamage+" initial damage and "+castdamage2+" additional damage to the "+enemyName+"!");
        enemyHPRemaining = enemyHPRemaining - castdamage - castdamage2;
        playerMP = playerMP - (playerLVL*7);
        System.out.println("You have "+playerMP+" MP left.");
        System.out.println("The "+enemyName+" writhes as electricity arcs around his body! The "+enemyName+" has "+enemyHPRemaining+" HP left.");
      } else
        System.out.println("You do not have enough MP to cast shock lance.");
      break;
      default:
        System.out.println("You do nothing.");
        break;
    }
  } //method to deal with spellcasts from level fifteen and up
  public static void spellCastFifteenToTwenty(int number, int enemyHPRemaining, int playerHPRemaining, String enemyName) {
    switch (number) {
      case 1:
        if (playerMP >= (playerLVL*5)) {
        System.out.println("Fireball deals damage to an enemy and damage to you.");
        int castdamage = intelligenceFireballModifier(intelligence);
        int selfdamage = fireballSelfDamageModifier(intelligence);
        System.out.println("Your fireball deals "+castdamage+" damage to the "+enemyName+"! You take "+selfdamage+" damage from the backlash, leaving you at "+playerHPRemaining+" HP.");
        enemyHPRemaining = enemyHPRemaining - castdamage;
        playerHPRemaining = playerHPRemaining - selfdamage;
        playerMP = playerMP - (playerLVL*5);
        System.out.println("You have "+playerMP+" MP left.");
        System.out.println("The "+enemyName+" burns!  The "+enemyName+" has "+enemyHPRemaining+" HP left.");
      } else 
        System.out.println("You do not have enough MP to cast fireball.");
      break;
      case 2:
        if (playerMP >= (playerLVL*7)) {
        System.out.println("Shock Lance deals damage to an enemy, then shocks the enemy again for additional damage.");
        int castdamage = intelligenceShockLanceModifier(intelligence);
        int castdamage2 = intelligenceShockLanceModifier(intelligence);
        System.out.println("Your shock lance deals "+castdamage+" initial damage and "+castdamage2+" additional damage to the "+enemyName+"!");
        enemyHPRemaining = enemyHPRemaining - castdamage - castdamage2;
        playerMP = playerMP - (playerLVL*7);
        System.out.println("You have "+playerMP+" MP left.");
        System.out.println("The "+enemyName+" writhes as electricity arcs around his body!  The "+enemyName+" has "+enemyHPRemaining+" HP left.");
      } else
        System.out.println("You do not have enough MP to cast shock lance.");
      break;
      case 3:
        if (playerMP >= (playerLVL*9)) {
        System.out.println("Shard Spray deals damage to an enemy four times.");
        int castdamage = intelligenceShockLanceModifier(intelligence);
        int castdamage2 = intelligenceShockLanceModifier(intelligence);
        int castdamage3 = intelligenceShockLanceModifier(intelligence);
        int castdamage4 = intelligenceShockLanceModifier(intelligence);
        System.out.println("Your shard spray deals "+castdamage+", "+castdamage2+", "+castdamage3+", and "+castdamage4+" damage to the goblin!");
        enemyHPRemaining = enemyHPRemaining - castdamage - castdamage2 - castdamage3 - castdamage4;
        playerMP = playerMP - (playerLVL*9);
        System.out.println("You have "+playerMP+" MP left.");
        System.out.println("The "+enemyName+" screams in fury and pain as the shards rip through his body!  The "+enemyName+" has "+enemyHPRemaining+" HP left.");
      } else
        System.out.println("You do not have enough MP to cast shard spray.");
      break;
      default: 
        System.out.println("You do nothing.");
        break;
    }   
  } //strength weapon damage modifier
  public static void spellCastTwentyPlus(int number, int enemyHPRemaining, int playerHPRemaining, String enemyName) {
    switch (number) {
      case 1:
        if (playerMP >= (playerLVL*5)) {
        System.out.println("Fireball deals damage to an enemy and damage to you.");
        int castdamage = intelligenceFireballModifier(intelligence);
        int selfdamage = fireballSelfDamageModifier(intelligence);
        System.out.println("Your fireball deals "+castdamage+" damage to the "+enemyName+"! You take "+selfdamage+" damage from the backlash, leaving you at "+playerHPRemaining+" HP.");
        enemyHPRemaining = enemyHPRemaining - castdamage;
        playerHPRemaining = playerHPRemaining - selfdamage;
        playerMP = playerMP - (playerLVL*5);
        System.out.println("You have "+playerMP+" MP left.");
        System.out.println("The "+enemyName+" burns!  The "+enemyName+" has "+enemyHPRemaining+" HP left.");
      } else 
        System.out.println("You do not have enough MP to cast fireball.");
      break;
      case 2:
        if (playerMP >= (playerLVL*7)) {
        System.out.println("Shock Lance deals damage to an enemy, then shocks the enemy again for additional damage.");
        int castdamage = intelligenceShockLanceModifier(intelligence);
        int castdamage2 = intelligenceShockLanceModifier(intelligence);
        System.out.println("Your shock lance deals "+castdamage+" initial damage and "+castdamage2+" additional damage to the "+enemyName+"!");
        enemyHPRemaining = enemyHPRemaining - castdamage - castdamage2;
        playerMP = playerMP - (playerLVL*7);
        System.out.println("You have "+playerMP+" MP left.");
        System.out.println("The "+enemyName+" writhes as electricity arcs around his body!  The "+enemyName+" has "+enemyHPRemaining+" HP left.");
      } else
        System.out.println("You do not have enough MP to cast shock lance.");
      break;
      case 3:
        if (playerMP >= (playerLVL*9)) {
        System.out.println("Shard Spray deals damage to an enemy four times.");
        int castdamage = intelligenceShockLanceModifier(intelligence);
        int castdamage2 = intelligenceShockLanceModifier(intelligence);
        int castdamage3 = intelligenceShockLanceModifier(intelligence);
        int castdamage4 = intelligenceShockLanceModifier(intelligence);
        System.out.println("Your shard spray deals "+castdamage+", "+castdamage2+", "+castdamage3+", and "+castdamage4+" damage to the "+enemyName+"!");
        enemyHPRemaining = enemyHPRemaining - castdamage - castdamage2 - castdamage3 - castdamage4;
        playerMP = playerMP - (playerLVL*9);
        System.out.println("You have "+playerMP+" MP left.");
        System.out.println("The "+enemyName+" screams in fury and pain as the shards rip through his body!  The "+enemyName+" has "+enemyHPRemaining+" HP left.");
      } else
        System.out.println("You do not have enough MP to cast shard spray.");
      break;
      case 4:
        if (playerMP >= (playerLVL*11)) {
        System.out.println("Holy Word deals damage to a non-evil enemy, and three times that damage to an evil enemy.");
        if ((enemyName != "demon")&&(enemyName != "lich")&&(enemyName != "imp")) {
          int castdamage = intelligenceHolyWordModifier(intelligence);
          enemyHPRemaining = enemyHPRemaining - castdamage;
          System.out.println("Your holy word deals "+castdamage+" damage to the "+enemyName+"!");
          System.out.println("The "+enemyName+" flinches as the holy power sears its soul!  The "+enemyName+" has "+enemyHPRemaining+" HP left.");
          playerMP = playerMP - (playerLVL*11);
          System.out.println("You have "+playerMP+" MP left.");
        } else {
          int castdamage = (intelligenceHolyWordModifier(intelligence)*3);
          enemyHPRemaining = enemyHPRemaining - castdamage;
          System.out.println("Your holy word deals three times damage ("+castdamage+") to the "+enemyName+"!");
          System.out.println("The "+enemyName+" screams as the holy power burns its essence in holy flame! The "+enemyName+" has "+enemyHPRemaining+" HP left.");
          playerMP = playerMP - (playerLVL*11);
          System.out.println("You have "+playerMP+" MP left.");
        }
      } else
        System.out.println("You do not have enough MP to cast holy word.");
        break;
      case 5:
        if (playerMP >= (playerLVL*10)) {
        System.out.println("Healing Energy heals you for a large amount of HP based on your level.");
        int healing = intelligenceHealingEnergyModifier(intelligence);
        playerHPRemaining = playerHPRemaining + healing;
        System.out.println("Your healing energy heals you for "+healing+" HP!");
        System.out.println("You have "+playerHPRemaining+" HP left.");
        playerMP = playerMP - (playerLVL*10);
        System.out.println("You have "+playerMP+" MP left.");
      } else
        System.out.println("You do not have enough MP to cast healing energy.");
        break;
      default: 
        System.out.println("You do nothing.");
        break;
    }   
  } 
  public static int strengthModifier(int str) {
    if (str == 1) return (int)(Math.random()*14+1);
    else if (str == 2) return (int)(Math.random()*19+1);
    else if (str == 3) return (int)(Math.random()*20+5);
    else if (str == 4) return (int)(Math.random()*25+5);
    else if (str == 5) return (int)(Math.random()*25+10);
    else if (str == 6) return (int)(Math.random()*30+10);
    else if (str == 7) return (int)(Math.random()*30+15);
    else if (str == 8) return (int)(Math.random()*35+15);
    else if (str == 9) return (int)(Math.random()*35+20);
    else return (int)(Math.random()*40+20);
  } //agility dodge modifier
  public static int agilityModifierDodge(int agi) {
    if (agi == 1) return 5;
    else if (agi == 2) return 5;
    else if (agi == 3) return 5;
    else if (agi == 4) return 10;
    else if (agi == 5) return 10;
    else if (agi == 6) return 10;
    else if (agi == 7) return 15;
    else if (agi == 8) return 15;
    else if (agi == 9) return 15;
    else return 20;
  } //agility critical modifier
  public static int agilityModifierCrit(int agi2) {
    if (agi2 == 1) return 5;
    else if (agi2 == 2) return 5;
    else if (agi2 == 3) return 5;
    else if (agi2 == 4) return 5;
    else if (agi2 == 5) return 10;
    else if (agi2 == 6) return 10;
    else if (agi2 == 7) return 10;
    else if (agi2 == 8) return 10;
    else if (agi2 == 9) return 15;
    else return 15;
  } //damage modifier for Fireball spell
  public static int intelligenceFireballModifier(int intel) {
    if (intel == 1) return ((int)(Math.random()*15+15));
    else if (intel == 2) return ((int)(Math.random()*18+15));
    else if (intel == 3) return ((int)(Math.random()*18+21));
    else if (intel == 4) return ((int)(Math.random()*21+21));
    else if (intel == 5) return ((int)(Math.random()*21+24));
    else if (intel == 6) return ((int)(Math.random()*24+24));
    else if (intel == 7) return ((int)(Math.random()*24+27));
    else if (intel == 8) return ((int)(Math.random()*27+27));
    else if (intel == 9) return ((int)(Math.random()*27+30));
    else return ((int)(Math.random()*30+30));
  } //damage modifier for the self damage in fireball
  public static int fireballSelfDamageModifier(int intel) {
    if (intel == 1) return ((int)(Math.random()*10+5));
    else if (intel == 2) return ((int)(Math.random()*12+5));
    else if (intel == 3) return ((int)(Math.random()*12+7));
    else if (intel == 4) return ((int)(Math.random()*14+7));
    else if (intel == 5) return ((int)(Math.random()*14+9));
    else if (intel == 6) return ((int)(Math.random()*16+9));
    else if (intel == 7) return ((int)(Math.random()*16+11));
    else if (intel == 8) return ((int)(Math.random()*18+11));
    else if (intel == 9) return ((int)(Math.random()*18+13));
    else return ((int)(Math.random()*20+13));
  } //damage modifier for Shock Lance spell
  public static int intelligenceShockLanceModifier(int intel) {
    if (intel == 1) return ((int)(Math.random()*10+10));
    else if (intel == 2) return ((int)(Math.random()*12+10));
    else if (intel == 3) return ((int)(Math.random()*12+12));
    else if (intel == 4) return ((int)(Math.random()*14+12));
    else if (intel == 5) return ((int)(Math.random()*14+14));
    else if (intel == 6) return ((int)(Math.random()*16+14));
    else if (intel == 7) return ((int)(Math.random()*16+16));
    else if (intel == 8) return ((int)(Math.random()*18+16));
    else if (intel == 9) return ((int)(Math.random()*18+18));
    else return ((int)(Math.random()*20+18));
  } //damage modifier for Shard Spray spell
  public static int intelligenceShardSprayModifier(int intel) {
    if (intel == 1) return ((int)(Math.random()*4+7));
    else if (intel == 2) return ((int)(Math.random()*7+7));
    else if (intel == 3) return ((int)(Math.random()*7+10));
    else if (intel == 4) return ((int)(Math.random()*10+10));
    else if (intel == 5) return ((int)(Math.random()*10+13));
    else if (intel == 6) return ((int)(Math.random()*13+13));
    else if (intel == 7) return ((int)(Math.random()*13+16));
    else if (intel == 8) return ((int)(Math.random()*16+16));
    else if (intel == 9) return ((int)(Math.random()*16+19));
    else return ((int)(Math.random()*19+19));
  } //damage modifier for holy word on creatures
  public static int intelligenceHolyWordModifier(int intel) {
    if (intel == 1) return ((int)(Math.random()*20+20));
    else if (intel == 2) return ((int)(Math.random()*22+20));
    else if (intel == 3) return ((int)(Math.random()*22+22));
    else if (intel == 4) return ((int)(Math.random()*24+22));
    else if (intel == 5) return ((int)(Math.random()*24+24));
    else if (intel == 6) return ((int)(Math.random()*26+24));
    else if (intel == 7) return ((int)(Math.random()*26+26));
    else if (intel == 8) return ((int)(Math.random()*28+26));
    else if (intel == 9) return ((int)(Math.random()*28+28));
    else return ((int)(Math.random()*30+28));
  } 
  public static int intelligenceHealingEnergyModifier(int intel) {
    if (intel == 1) return ((int)(Math.random()*50+50));
    else if (intel == 2) return ((int)(Math.random()*50+70));
    else if (intel == 3) return ((int)(Math.random()*70+70));
    else if (intel == 4) return ((int)(Math.random()*70+90));
    else if (intel == 5) return ((int)(Math.random()*90+90));
    else if (intel == 6) return ((int)(Math.random()*90+110));
    else if (intel == 7) return ((int)(Math.random()*110+110));
    else if (intel == 8) return ((int)(Math.random()*110+130));
    else if (intel == 9) return ((int)(Math.random()*130+130));
    else return ((int)(Math.random()*130+150));
  } //returns the experience gain for each type of creature
  public static int experienceGain(String creaturename) {
    if (creaturename == "goblin") return (int)(Math.random()*25+50);
    else if (creaturename == "troll") return (int)(Math.random()*50+75);
    else if (creaturename == "imp") return (int)(Math.random()*25+25);
    else if (creaturename == "orc") return (int)(Math.random()*40+60);
    else if (creaturename == "demon") return (int)(Math.random()*50+125);
    else if (creaturename == "lich") return (int)(Math.random()*50+175);
    else if (creaturename == "golem") return (int)(Math.random()*50+225);
    else return 0;
  } //increases the experience cap per levelup
  public static int experienceCap(int level) {
    if (level == 2) return 200;
    else if (level == 3) return 225;
    else if (level == 4) return 250;
    else if (level == 5) return 275;
    else if (level == 6) return 300;
    else if (level == 7) return 325;
    else if (level == 8) return 350;
    else if (level == 9) return 375;
    else if (level == 10) return 400;
    else if ((level > 10)&&(level <= 20)) return level*40;
    else if ((level > 20)&&(level <= 25)) return level*45;
    else return level*50;
  } 
  public static void attributes(int choice) {
    switch (choice) {
      case 1:
        if (strength < 10) {
        strength++;
        System.out.println("Your strength is now level "+strength+"!");
      } else {
        System.out.println("Your strength is already at max level!\nPick another attribute.");
        attributes(input.nextInt());
      }
      break;
      case 2:
        if (intelligence < 10) {
        intelligence++;
        System.out.println("Your intelligence is now level "+intelligence+"!");
      } else {
        System.out.println("Your intelligence is already at max level!\nPick another attribute.");
        attributes(input.nextInt());
      }
      break;
      case 3:
        if (agility < 10) {
        agility++;
        System.out.println("Your agility is now level "+agility+"!");
      } else {
        System.out.println("Your agility is already at max level!\nPick another attribute.");
        attributes(input.nextInt());
      }
      break;
    }
  } //the playerEXP method deals with player experience points
  public static int playerEXP(int expGain) {
    System.out.println("You gained "+expGain+" EXP!");
    playerEXP = playerEXP + expGain;
    if (playerEXP >= expCap) {
      playerLVL++;
      System.out.println("You levelled up! You are now level "+playerLVL+"!");
      playerEXP = playerEXP - expCap;
      maxPlayerHP = maxPlayerHP + 25;
      maxPlayerMP = maxPlayerMP + 40;
      playerHP = maxPlayerHP;
      playerMP = maxPlayerMP;
      System.out.println("You gained 25 max HP and 40 max MP! Your max HP is now "+maxPlayerHP+" and your max MP is now "+maxPlayerMP+".");
      System.out.println("Choose one stat to level up: Press 1 for strength, 2 for intelligence, or 3 for agility. You can only level a stat to level 10.");
      if ((strength < 10)||(intelligence < 10)||(agility < 10)) {
        int choice = input.nextInt();
        attributes(choice);
      }
      expCap = experienceCap(playerLVL);
    }
    if (playerLVL >= 30) { //this ends the game at level 30
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