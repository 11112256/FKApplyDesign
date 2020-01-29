package newGame3X3;

public class TicTacToe {


    public static void main(String args[])
    {
        Controller controller = new Controller(3,new Player() , new Player());

        controller.run();


    }

}
