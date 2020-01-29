package Game3X3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

public class game {
     board newboard;

   private Human player1 ;
   private Human player2;
     public game(int n,Human player1,Human player2)
    {
        this.newboard  =new board(n);
        this.player1 = player1 ;
        this.player2 = player2 ;
       // newboard.printboard(newboard.gameboard);
    }

    public game() {

    }

    public board getNewboard()
    {
        return this.newboard;
    }

    public Human getPlayer1()
    {
        return this.player1 ;
    }

    public Human getPlayer2()
    {
        return  this.player2 ;
    }
    public void run()
    {      newboard.printboard(newboard.getgameboard());

       // System.out.println("entering");
       // System.out.println(newboard.isFull());
        while(!newboard.isFull()){

            player1.move(newboard,1);
            if(player1.checker(newboard) ) {
                player1.setStatus("win");
                player2.setStatus("loss");

               break;
            }
             if(newboard.isFull()) {
                 player1.setStatus("draw");
                 player2.setStatus("draw");
                 System.out.println("match is draw");
           break;
             }
            player2.move(newboard,2);
            if(player2.checker(newboard) )
            {
                player2.setStatus("win");
                player1.setStatus("loss");
                break;
            }
            return;
        }

       // System.out.println(player1.getStatus());
        //System.out.println(player2.getStatus());
    }

    public void run(Human player1 , Computer player2)
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


    public void printRow(int row){

         for(int j=0;j<3 ;j++)
             System.out.print(this.newboard.getgameboard()[row][j]);


     }

    public String print3X3()
    {
//        System.out.println("a");

        StringBuilder st = new StringBuilder();
        for(int i =0 ; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                st.append(this.getNewboard().getgameboard()[i][j]);
            }
            st.append(System.getProperty("line.separator"));

        }

        return  st.toString() ;
    }


}
