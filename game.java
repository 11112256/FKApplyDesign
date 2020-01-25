

public class game {
     board newboard;


     public game(int n)
    {
        newboard  =new board(n);
        newboard.printboard(newboard.gameboard);
    }

    public void humanTouman(Human player1 , Human player2)
    {
       // System.out.println("entering");
       // System.out.println(newboard.isFull());
        while(!newboard.isFull()){

            player1.move(newboard,1);
            if(player1.checker(newboard) || newboard.isFull())
                break;
            player2.move(newboard,2);
            if(player2.checker(newboard) )
                break;
        }

    }

    public void humanTocomputer(Human player1 , Computer player2)
    {
        while(!newboard.isFull()){

            player1.move(newboard,1);
            if(player1.checker(newboard) || newboard.isFull())
                break;
            player2.move(newboard,2);
            if(player2.checker(newboard) )
                break;
        }

    }

}
