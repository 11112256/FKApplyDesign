

public abstract  class Player {

    //public move()

    public void move( board b ,int value)
    {
    };
    public boolean checker(board b)
    {
        //boolean flag = false ;

        for(int i =0 ; i < b.gameboard.length ; i++){
            if(b.gameboard[i][0]!=0 && (b.gameboard[i][0]==b.gameboard[i][1]) && (b.gameboard[i][2]==b.gameboard[i][0]))
            {
                if(b.gameboard[i][0]==1)
                    System.out.println("player 1 wins");
                else
                    System.out.println("player 2 wins");
                return true;
            }
        }
        for(int j =0 ; j< b.gameboard.length ; j++){
            if(b.gameboard[0][j]!=0 && (b.gameboard[0][j]==b.gameboard[1][j]) && (b.gameboard[2][j]==b.gameboard[0][j]))
            {
                if(b.gameboard[0][j]==1)
                    System.out.println("player 1 wins");
                else
                    System.out.println("player 2 wins");
                return true;
            }
        }
        if(b.gameboard[0][0]!=0 && (b.gameboard[0][0]==b.gameboard[1][1]) && (b.gameboard[2][2]==b.gameboard[0][0]))
        {
            if(b.gameboard[0][0]==1)
                System.out.println("player 1 wins");
            else
                System.out.println("player 2 wins");
            return true;
        }
        if(b.gameboard[0][2]!=0 && (b.gameboard[0][2]==b.gameboard[1][1]) && (b.gameboard[2][0]==b.gameboard[0][2]))
        {
            if(b.gameboard[0][2]==1)
                System.out.println("player 1 wins");
            else
                System.out.println("player 2 wins");
            return true;
        }
        return false;

    }



}
