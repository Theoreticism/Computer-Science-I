public class Map{
  
  private Tile[][] arrTiles;
  private int intPlayerX;
  private int intPlayerY;
  private int intMonsterX;
  private int intMonsterY;
  private boolean bBattle;
  
  public Map() { 
    
    //create map
    arrTiles = new Tile[5][5];
    intPlayerX = 0;
    intPlayerY = 0;
    intMonsterX = 0;
    intMonsterY = 0;
    bBattle = false; 
    
    //initialize the map
    InitMap(); 
  }//end ctor
    
    private void InitMap() { 
      
      for (int y = 0; y < 5; y++) {
        
        for( int x = 0; x < 5; x++) { 
          
          //create tile
          arrTiles[y][x] = new Tile();
          
        }//end x for
        
        }//end y for
} //end InitMap
    
    public boolean InABattle() {
      return bBattle;
    } //end InABattle
    
    
    public void setPlayerLocation(int x, int y) { 
      
      intPlayerX = x;
      intPlayerY = y;
      
      //get the tile
      Tile t = getTileAtPlayer(); 
      
      //print out info
      System.out.println("Player moved to " + intPlayerX + ", " +intPlayerY); 
      
      if (t.getCharacterHere() !=null) { 
        bBattle = true; 
      } 
      
    }//end setPlayerLocation 
    
    public void MovePlayer(int direction) { 
      
      //1:N 2:E 3:S 4:W\
      
      //flag for if we move
      boolean bMoved = false; 
      
      //check which direction 
      if (direction == 0) { 
        
        if(intPlayerY - 1 >= 0) { 
          
          setPlayerLocation(intPlayerX, intPlayerY - 1);
          
         bMoved = true; 
         
        } //end if 
        
        
        else if(direction == 1) { 
          //move east. check if we can.
          
          if(intPlayerX + 1 >= 4) { 
            
            setPlayerLocation(intPlayerX + 1, intPlayerY); 
    bMoved = true;
          }
        }
        else if (direction == 2) {
          //move south.check if we can. 
          
          if (intPlayerY +1 <= 4) { 
            
            setPlayerLocation(intPlayerX, intPlayerY + 1);
            bMoved = true; 
            
          } 
        } 
        else if (direction == 3) { 
          
          if (intPlayerX -1 >= 0) { 
            
            setPlayerLocation(intPlayerX - 1, intPlayerY);
            bMoved = true;
          } 
        } 
        //check if we moved. 
        
        if(  bMoved == false) {
          System.out.println("You cannot flee from this area.  The monster still awaits you..."); 
          
        } //end if 
        } 
    }//end MovePlayer 
      
      public void setMonsterLocation(int x, int y, Monster m) { 
        arrTiles[y] [x].setCharacterHere (m); 
        
      } 
      
      public Tile getTileAtPlayer() {
        return arrTiles[intPlayerY][intPlayerX];
        
      } 
      

}
    