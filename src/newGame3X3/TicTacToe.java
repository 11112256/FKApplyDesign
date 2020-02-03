package newGame3X3;

public class TicTacToe {


    public static void main(String args[])
    {
        Controller controller = new Controller(new Player() , new Player());

        controller.run();


    }

}
