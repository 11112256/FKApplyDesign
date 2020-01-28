package Game3X3;

public class board  {

   private int Dimension ;

  private int getgameboard[][] ;

   public board(int Dimension)
   {
     this.Dimension = Dimension ;
     getgameboard = new int[Dimension][Dimension];
      // System.out.println("board is created"+Dimension);
   }


    public int[][] getgameboard()
    {
        return this.getgameboard;
    }


    public void currentboard(board  newboard)
   {
     // need to check for null
     for(int i = 0; i < newboard.getgameboard.length ; i++)
     {
       for(int j = 0; j<newboard.getgameboard.length ; j++)
         getgameboard[i][j] = newboard.getgameboard[i][j];
     }
   }

 public void printboard(int gameboard[][]){

  StringBuilder st = new StringBuilder();


   //  System.out.println("d"+gameboard.length);
     for(int i =0 ; i < gameboard.length ; i++) {
       for (int j = 0; j < gameboard.length; j++) {
           //  System.out.print(this.gameboard[i][j]);
           st.append(this.getgameboard[i][j]);
       }
       st.append("\n");
     // System.out.println();
     }
   System.out.println(st.toString());

   }



 public boolean isFull()
 {
     int count =0;
     for(int i = 0; i< getgameboard.length; i++)
         for(int j = 0; j< getgameboard.length; j++)
             if(getgameboard[i][j]==0)
                 return false;

             return true ;
 }

 public void place(int i,int j,int value)
 {   //need to check the value must be 1 or 2
     this.getgameboard[i][j] = value ;
 }


   public boolean isValid(board b,int i , int j , int value){

       //System.out.println(b.gameboard[i][j]!=0);

       //System.out.println((b.gameboard[i][j] !=0  && i<0 && j >b.gameboard.length) + "checking" + i+ " "+j);
       if( b.getgameboard[i][j] != 0  || i<0 || j >b.getgameboard.length)
           return false;


    return true ;
   }


   public int getValueOfGameBoard(int i , int j){
       return  this.getgameboard()[i][j];
   }



}
