public class Troll {
  int healthPoints = 150;
  int damage = (int)(Math.random()*10);
  public int howMuchDamageTaken(int dt) {
    return healthPoints - dt;
  }
  public int damage() {
    return damage;
  }
}