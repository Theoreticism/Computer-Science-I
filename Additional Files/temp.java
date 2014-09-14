if ((playerLVL >= 5)&&(playerLVL < 10)) {
  System.out.println("You can cast one spell.\nPress 1 to cast Fireball.");
  int cast = input.nextInt();
  if (cast == 1) {
    System.out.println("Fireball deals 30-50 damage to an enemy and 5-10 damage to you.");
    //int castdamage = ((int)(Math.random()*20+30));
    //int selfdamage = ((int)(Math.random()*5+5));
    //enemyhp = enemyhp - castdamage;
    //playerHPLeft = playerHPLeft - selfdamage;
  }
} else if ((playerLVL >= 10)&&(playerLVL < 15)) {
  System.out.println("You can cast two spells.\nPress 1 to cast Fireball or 2 to cast Shock Lance.");
  int cast2 = input.nextInt();
  if (cast2 == 1) {
    System.out.println("Fireball deals 30-50 damage to an enemy and 5-10 damage to you.");
    //int castdamage = ((int)(Math.random()*20+30));
    //enemyhp = enemyhp - castdamage;
  } else if (cast2 == 2) {
    System.out.println("Shock Lance deals 15-25 damage to an enemy twice.");
    //int castdamage = ((int)((Math.random()*10+15)*2));
    //enemyhp = enemyhp - castdamage;
  }
} else if ((playerLVL >= 15)&&(playerLVL < 20)) {
  System.out.println("You can cast three spells\nPress 1 to cast Fireball, 2 to cast Shock Lance, and 3 to cast Shard Spray.");
  int cast3 = input.nextInt();
  switch (cast3) {
    case 1:
      System.out.println("Fireball deals 30-50 damage to an enemy and 5-10 damage to you. Costs 10 MP.");
    //int castdamage = ((int)(Math.random()*20+30));
    //enemyhp = enemyhp - castdamage;
      break;
    case 2:
      System.out.println("Shock Lance deals 15-25 damage to an enemy twice. Costs 25 MP.");
    //int castdamage = ((int)((Math.random()*10+15)*2));
    //enemyhp = enemyhp - castdamage;
      break;
    case 3:
      System.out.println("Shard Spray deals 7-14 damage to an enemy five times. Costs 50 MP.");
    //int castdamage = ((int)((Math.random()*7+7)*5));
    //enemyhp = enemyhp - castdamage;
      break;
    default: 
      System.out.println("Invalid number! Press 1, 2 or 3 only! Your moment of confusion opened up your defenses!");
      break;
  }
}








if (playerLVL >= 25) {
  System.out.println("You have grown in power such that you are capable of defeating and banishing the evil of Dystopia easily.");
  System.out.println("Your enemies flee before you, and as more of Dystopia empties, you claim the land for your people.");
  System.out.println("One day, these caverns and the land around it will become a thriving city, all a result of your heroic deeds.");
  System.out.println("Congratulations, you emerged from Dystopia victorious, with riches beyond your dreams!");
}