package GenralGame;
    import Game9X9.*;

    import Game3X3.* ;

    import java.util.Scanner;

public class MainClass {



public static void main(String args[])

{

    Scanner sc =new Scanner(System.in);
    System.out.println("enter the value of n on nXn grid");
    int n = sc.nextInt();
    if(n%3!=0)
        System.out.println("please enter the muptiple of three");
    else
    {
        game_nXn g = new game_nXn(n);
        board check = new board(n/3);
        g.run(check);
    }

}


}
