public class Goblin {
  int healthPoints = 100;
  int damage = (int)(Math.random()*5);
  public int howMuchDamageTaken(int dt) {
    return healthPoints - dt;
  }
  public int damage() {
    return damage;
  }
}