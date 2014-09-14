import java.util.Random;
import java.text.DecimalFormat; 


public class Character{
  protected String strName;
  protected double dblHealth;
  protected double dblCritHit;
  protected double dblArmor;
  protected Random rndDamage;
  protected int intDefense;
  
  public Character(String name, double health, double criticalHit, double armor){
    //defaults
    
    strName = name;
    dblHealth = health;
    dblCritHit = criticalHit;
    dblArmor = armor; 
    intDefense = 0;
    rndDamage = new Random(); 
  } //end ctor
  
   public void Attack(Character c, int area) {
    
      //figure out how much damage
    int damage = rndDamage.nextInt(21);
    
    //check for crit hit
    if (rndDamage.nextDouble() <= dblCritHit)
    {
      damage *= 2;
      System.out.println(strName + " scores a critical hit!\r\nAttacks with " + damage + " power.");
    } else {
      System.out.println(strName + " attacks with " + damage + " power");
    } // end if
    
    //damage the player
    c.Damaged(damage, area);
    
  } // end Attack
  
  public void Damaged(double damage, int area) {
    
    //check if the area monster is attack is being defended
    if (area != intDefense) {
      
      //reduce based on armor
      damage = damage - (damage * dblArmor);
      damage = Round(damage);
      
      //take away from health
      dblHealth -= damage;
      dblHealth = Round(dblHealth);
      
      System.out.println(strName + "'s armor absorbs " + Round(damage * dblArmor) + " damage.\r\n" + strName + " received " + damage + " damage.\r\nHP: " + dblHealth);
      
    } else {
      
      System.out.println(strName + " successfully defended the attack!");
      
    } // end if
    
  } // end Damaged
  
  public void Defend(int area) {
    
    //set area to defend
    intDefense = area;
    
  } // end Defend
  
  private double Round(double d) {
    DecimalFormat round = new DecimalFormat("#.##");
    return Double.valueOf(round.format(d));
  }
  
  public boolean IsAlive() {
    
    return dblHealth > 0;
    
  } // end IsAlive
  
}

