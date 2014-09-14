
                
                
                if (playerMP >= 50) {
                  if (cast2 == 1) {
                    System.out.println("Fireball deals 30-45 damage to an enemy and 5-10 damage to you. Costs 50 MP.");
                    int castdamage = ((int)(Math.random()*15+30));
                    int selfdamage = ((int)(Math.random()*5+5));
                    goblinHPLeft = goblinHPLeft - castdamage;
                    playerHPLeft = playerHPLeft - selfdamage;
                    System.out.println("Your fireball deals "+castdamage+" damage to the goblin! You take "+selfdamage+" damage from the backlash, leaving you at "+playerHPLeft+" HP.");
                    playerMP = playerMP - 50;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The goblin burns! He has "+goblinHPLeft+" HP left.");
                  } else 
                    System.out.println("You do nothing.");
                } else if (playerMP < 50) 
                  System.out.println("You do not have enough MP to cast fireball. You do nothing.");
                else if (playerMP >= 75) {
                  if (cast2 == 2) {
                    System.out.println("Shock Lance deals 15-30 damage to an enemy, then shocks the enemy again for an additional 15-30 damage. Costs 75 MP.");
                    int castdamage = ((int)(Math.random()*15+15));
                    int castdamage2 = ((int)(Math.random()*15+15));
                    System.out.println("Your shock lance deals "+castdamage+" initial damage and "+castdamage2+" additional damage to the goblin!");
                    goblinHPLeft = goblinHPLeft - castdamage - castdamage2;
                    playerMP = playerMP - 75;
                    System.out.println("You have "+playerMP+" MP left.");
                    System.out.println("The goblin writhes as electricity arcs around his body! He has "+goblinHPLeft+" HP left.");
                  } else
                    System.out.println("You do nothing.");
                } else if (playerMP < 75)
                  System.out.println("You do not have enough MP to cast shock lance. You do nothing.");