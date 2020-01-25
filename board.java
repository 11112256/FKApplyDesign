import java.sql.SQLOutput;

public class board  {

   int Dimension ;

   int gameboard [][] ;

   public board(int Dimension)
   {
     this.Dimension = Dimension ;
     gameboard = new int[Dimension][Dimension];
       System.out.println("board is created"+Dimension);
   }




    public void currentboard(board  newboard)
   {
     // need to check for null
     for(int i =0 ;i < newboard.gameboard.length ; i++)
     {
       for(int j =0 ; j<newboard.gameboard.length ; j++)
         gameboard[i][j] = newboard.gameboard[i][j];
     }
   }

 public void printboard(int gameboard[][]){

   //  System.out.println("d"+gameboard.length);
     for(int i =0 ; i < gameboard.length ; i++) {
       for (int j = 0; j < gameboard.length; j++)
         System.out.print(this.gameboard[i][j]);
      System.out.println();
     }
  // System.out.println();

   }

 public boolean isFull()
 {
     int count =0;
     for(int i =0 ; i< gameboard.length; i++)
         for(int j =0 ; j< gameboard.length;j++)
             if(gameboard[i][j]==0)
                 return false;

             return true ;
 }

 public void place(int i,int j,int value)
 {   //need to check the value must be 1 or 2
     this.gameboard[i][j] = value ;
 }


   public boolean isValid(board b,int i , int j , int value){

       //System.out.println(b.gameboard[i][j]!=0);

       //System.out.println((b.gameboard[i][j] !=0  && i<0 && j >b.gameboard.length) + "checking" + i+ " "+j);
       if( b.gameboard[i][j] != 0  || i<0 || j >b.gameboard.length)
           return false;


    return true ;
   }


}
