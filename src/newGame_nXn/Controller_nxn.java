package newGame_nXn;

import newGame3X3.Board;
import newGame3X3.Controller;
import newGame3X3.Player;

public class Controller_nxn {

    private Player player1;
    private Player player2;
    private Board chart;


    private newGame3X3.Controller ThreeCrossThree [][] ;

    public Controller[][] getThreeCrossThree() {
        return ThreeCrossThree;
    }

    public void setThreeCrossThree(Controller[][] threeCrossThree) {
        ThreeCrossThree = threeCrossThree;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Board getChart() {
        return chart;
    }

    public void setChart(Board chart) {
        this.chart = chart;
    }

    public Controller_nxn(int n,Player player1 , Player player2)
    {

        System.out.println();
        this.ThreeCrossThree = new newGame3X3.Controller[n][n];
        this.player1 = player1;
        this.player2 = player2;
        this.chart = new Board(n);

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                ThreeCrossThree[i][j] = new newGame3X3.Controller(n, new Player(), new Player());

            }

    }







}
