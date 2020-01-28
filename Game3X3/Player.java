package Game3X3;

public abstract  class Player {

    //public move()
 //  private String status ;



    public void move( board b ,int value)
    {
    };
    public boolean checker(board b)
    {
        //boolean flag = false ;

        for(int i =0 ; i < b.getgameboard().length ; i++){

            if(b.getgameboard()[i][0]!=0 && (b.getgameboard()[i][0]==b.getgameboard()[i][1]) && (b.getgameboard()[i][2]==b.getgameboard()[i][0]))
            {
                if(b.getgameboard()[i][0]==1)
                    System.out.println("player 1 wins");
                else
                    System.out.println("player 2 wins");
                return true;
            }
        }
        for(int j =0 ; j< b.getgameboard().length ; j++){
            if(b.getgameboard()[0][j]!=0 && (b.getgameboard()[0][j]==b.getgameboard()[1][j]) && (b.getgameboard()[2][j]==b.getgameboard()[0][j]))
            {
                if(b.getgameboard()[0][j]==1)
                    System.out.println("player 1 wins");
                else
                    System.out.println("player 2 wins");
                return true;
            }
        }
        if(b.getgameboard()[0][0]!=0 && (b.getgameboard()[0][0]==b.getgameboard()[1][1]) && (b.getgameboard()[2][2]==b.getgameboard()[0][0]))
        {
            if(b.getgameboard()[0][0]==1)
                System.out.println("player 1 wins");
            else
                System.out.println("player 2 wins");
            return true;
        }
        if(b.getgameboard()[0][2]!=0 && (b.getgameboard()[0][2]==b.getgameboard()[1][1]) && (b.getgameboard()[2][0]==b.getgameboard()[0][2]))
        {
            if(b.getgameboard()[0][2]==1)
                System.out.println("player 1 wins");
            else
                System.out.println("player 2 wins");
            return true;
        }
       // System.out.println("match draw");
        return false;

    }



}
