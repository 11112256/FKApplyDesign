package newGame_nXn;

import newGame3X3.Player;
import newGame9X9.Controller;

import java.util.Scanner;

public class TicTacToe {


    public static void main(String args[])
    {
        System.out.println("Welcome in n X n TicTacToe");
        System.out.println("Enter the value of n ");
        System.out.println("Exapmle 3 for 3X3 game  and 9 for 9X9 game which consist 9 game of 3X3 ");
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

        Controller controller = new Controller(n,new Player(),new Player());
        controller.run();





    }


}
