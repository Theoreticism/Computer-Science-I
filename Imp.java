public class Imp {
  int healthPoints = 50;
  int damage = (int)(Math.random()*3);
  public int howMuchDamageTaken(int dt) {
    return healthPoints - dt;
  }
  public int damage() {
    return damage;
  }
}