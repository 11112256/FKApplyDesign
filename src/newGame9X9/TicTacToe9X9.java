package newGame9X9;

import newGame3X3.Player;

public class TicTacToe9X9 {



    public static void main(String args [])
    {
        System.out.println("welcome in 9X9 Tic Tac Toe");
        Controller controller = new Controller(9,new Player(),new Player());
        controller.run();

    }

}
