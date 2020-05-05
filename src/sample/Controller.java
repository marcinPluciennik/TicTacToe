package sample;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Controller {
    private String [][] gameTable = {{" "," "," "},{" "," "," "},{" "," "," "}};

    public void printGame(){
        for (int i = 0; i < gameTable.length; i++){
            System.out.println(Arrays.toString(gameTable[i]));
        }
    }

    public String[][] getGameTable() {
        return gameTable;
    }

    public void userMove() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x coordinate (0,1,2): ");
        int x = s.nextInt();
        if (x < 0 || x > 2) {
            System.out.println("Wrong coordinate, must be 0, 1 or 2!");
            userMove();
        }

        System.out.print("Enter y coordinate (0,1,2): ");
        int y = s.nextInt();
        if (y < 0 || y > 2) {
            System.out.println("Wrong coordinate, must be 0, 1 or 2!");
            userMove();
        }

        if (gameTable[x][y].equals(" ")){
            gameTable[x][y] = "X";
        }else{
            System.out.println("Error - it's not allowed move! Try again!");
            userMove();
        }
    }
    public int randomX0or2(){
        int [] array = {0,2};
        int x = new Random().nextInt(array.length);
        return array[x];
    }

    public int randomY0or2(){
        int [] array = {0,2};
        int y = new Random().nextInt(array.length);
        return array[y];
    }


    public void computerMove1(){
        if (gameTable[1][1].equals(" ")){
            gameTable[1][1] = "O";
        }else{
            int x = randomX0or2();
            int y = randomY0or2();
            if (gameTable[x][y].equals(" ")){
                gameTable[x][y] = "O";
            }else {
                computerMove1();
            }
            gameTable[x][y] = "O";
        }
    }

    public int randomX012(){
        int [] array = {0,1,2};
        int x = new Random().nextInt(array.length);
        return array[x];
    }

    public int randomY012(){
        int [] array = {0,1,2};
        int y = new Random().nextInt(array.length);
        return array[y];
    }

    public void computerMove2(){
        int x = randomX012();
        int y = randomY012();

        if (gameTable[x][y].equals(" ")){
            gameTable[x][y] = "O";
        }else{
            computerMove2();
        }
    }
}
