//the combatgoblin method that deals with player damage to goblin
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
  }