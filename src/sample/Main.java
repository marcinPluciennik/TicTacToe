package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.*;

public class Main extends Application {
    private String [][] gameTable = {{" "," "," "},{" "," "," "},{" "," "," "}};
    private Label level = new Label("Level: BEGINNER");
    private Label status = new Label("YOUR TURN- GOOD LUCK!");
    private int compMoveColumn;
    private int compMoveRow;
    private int[] compMove = {0,0};
    private boolean isUserWinner = false;
    private GridPane grid = new GridPane();
    private MenuBar menuBar;
    private Menu gameMenu;
    private Menu difficultyMenu;
    private MenuItem exitItem;
    private MenuItem newGameItem;
    private RadioMenuItem beginner;
    private RadioMenuItem normal;
    private RadioMenuItem expert;
    private boolean beginnerLevel = true;
    private boolean normalLevel = false;
    private boolean expertLevel = false;
    private String userName;
    private TextField name;
    private Label statusWelcomeWindow = new Label("Are you ready?");

    private Button button1 = new Button(" ");
    private Button button2 = new Button(" ");
    private Button button3 = new Button(" ");
    private Button button4 = new Button(" ");
    private Button button5 = new Button(" ");
    private Button button6 = new Button(" ");
    private Button button7 = new Button(" ");
    private Button button8 = new Button(" ");
    private Button button9 = new Button(" ");

    private Image imageback = new Image ("file:resources/back.png");

    private Image wheel = new Image ("file:resources/kolo.png");
    private ImageView wheelView1 = new ImageView(wheel);
    private ImageView wheelView2 = new ImageView(wheel);
    private ImageView wheelView3 = new ImageView(wheel);
    private ImageView wheelView4 = new ImageView(wheel);
    private ImageView wheelView5 = new ImageView(wheel);
    private ImageView wheelView6 = new ImageView(wheel);
    private ImageView wheelView7 = new ImageView(wheel);
    private ImageView wheelView8 = new ImageView(wheel);
    private ImageView wheelView9 = new ImageView(wheel);

    private Image cross = new Image ("file:resources/krzyzyk.png");
    private ImageView crossView1 = new ImageView(cross);
    private ImageView crossView2 = new ImageView(cross);
    private ImageView crossView3 = new ImageView(cross);
    private ImageView crossView4 = new ImageView(cross);
    private ImageView crossView5 = new ImageView(cross);
    private ImageView crossView6 = new ImageView(cross);
    private ImageView crossView7 = new ImageView(cross);
    private ImageView crossView8 = new ImageView(cross);
    private ImageView crossView9 = new ImageView(cross);

    public int random012(){
        int [] array = {0,1,2};
        int index = new Random().nextInt(array.length);
        System.out.println("Random: " + array[index]);
        return array[index];
    }

    public int random02() {
        int[] array = {0, 2};
        int x = new Random().nextInt(array.length);
        return array[x];
    }

    public void computerMove(){
        if (gameTable[0][0].equals("O") && gameTable[0][1].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else if (gameTable[0][0].equals("O") && gameTable[0][2].equals("O") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
            compMove[0] = 0;
            compMove[1] = 1;
        } else if (gameTable[0][1].equals("O") && gameTable[0][2].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
            compMove[0] = 0;
            compMove[1] = 0;
        } else if (gameTable[1][0].equals("O") && gameTable[1][1].equals("O") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
            compMove[0] = 1;
            compMove[1] = 2;
        } else if (gameTable[1][2].equals("O") && gameTable[1][1].equals("O") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
            compMove[0] = 1;
            compMove[1] = 0;
        } else if (gameTable[2][0].equals("O") && gameTable[2][1].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[2][0].equals("O") && gameTable[2][2].equals("O") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
            compMove[0] = 2;
            compMove[1] = 1;
        } else if (gameTable[2][2].equals("O") && gameTable[2][1].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 2;
            compMove[1] = 0;
        } else if (gameTable[0][0].equals("O") && gameTable[1][0].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 2;
            compMove[1] = 0;
        } else if (gameTable[0][0].equals("O") && gameTable[2][0].equals("O") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
            compMove[0] = 1;
            compMove[1] = 0;
        } else if (gameTable[2][0].equals("O") && gameTable[1][0].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
            compMove[0] = 0;
            compMove[1] = 0;
        } else if (gameTable[0][1].equals("O") && gameTable[1][1].equals("O") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
            compMove[0] = 2;
            compMove[1] = 1;
        } else if (gameTable[1][1].equals("O") && gameTable[2][1].equals("O") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
            compMove[0] = 0;
            compMove[1] = 1;
        } else if (gameTable[0][2].equals("O") && gameTable[1][2].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[0][2].equals("O") && gameTable[2][2].equals("O") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
            compMove[0] = 1;
            compMove[1] = 2;
        } else if (gameTable[2][2].equals("O") && gameTable[1][2].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else if (gameTable[0][0].equals("O") && gameTable[1][1].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[1][1].equals("O") && gameTable[2][2].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[1][2] = "O";
            compMove[0] = 1;
            compMove[1] = 2;
        } else if (gameTable[0][2].equals("O") && gameTable[1][1].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 2;
            compMove[1] = 0;
        } else if (gameTable[0][1].equals("O") && gameTable[2][1].equals("O") && gameTable[1][1].equals(" ")) {
            gameTable[1][1] = "O";
            compMove[0] = 1;
            compMove[1] = 1;
        } else if (gameTable[2][0].equals("O") && gameTable[1][1].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        }else {
            int x = random012();
            int y = random012();
            if (gameTable[x][y].equals(" ")) {
                gameTable[x][y] = "O";
                compMove[0] = x;
                compMove[1] = y;
            } else {
                System.out.println("Szukam ponownie");
                computerMove();
            }
        }
        compMoveRow = compMove[0];
        compMoveColumn = compMove[1];
        System.out.println(compMove[0] + " " + compMove[1]);
        System.out.println("compMoveColumn: " + compMoveColumn);
        System.out.println("compMoveRow: " + compMoveRow);
    }

    public void computerMoveNormal() {
        if (gameTable[1][1].equals(" ")) {
            gameTable[1][1] = "O";
            compMove[0] = 1;
            compMove[1] = 1;
        } else if (!gameTable[1][1].equals(" ") && gameTable[0][0].equals(" ") && gameTable[0][1].equals(" ") &&
                gameTable[0][2].equals(" ") && gameTable[1][0].equals(" ") && gameTable[1][2].equals(" ") &&
                gameTable[2][0].equals(" ") && gameTable[2][1].equals(" ") && gameTable[2][2].equals(" ")) {
            int x = random012();
            int y = random012();
            if (gameTable[x][y].equals(" ")) {
                gameTable[x][y] = "O";
                compMove[0] = x;
                compMove[1] = y;
            } else {
                computerMoveNormal();
            }
        }
        compMoveRow = compMove[0];
        compMoveColumn = compMove[1];
        System.out.println(compMove[0] + " " + compMove[1]);
        System.out.println("compMoveColumn: " + compMoveColumn);
        System.out.println("compMoveRow: " + compMoveRow);

    }

    public void computerMoveNormal2() {
        if (gameTable[0][0].equals("O") && gameTable[0][1].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else if (gameTable[0][0].equals("O") && gameTable[0][2].equals("O") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
            compMove[0] = 0;
            compMove[1] = 1;
        } else if (gameTable[0][1].equals("O") && gameTable[0][2].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
            compMove[0] = 0;
            compMove[1] = 0;
        } else if (gameTable[1][0].equals("O") && gameTable[1][1].equals("O") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
            compMove[0] = 1;
            compMove[1] = 2;
        } else if (gameTable[1][2].equals("O") && gameTable[1][1].equals("O") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
            compMove[0] = 1;
            compMove[1] = 0;
        } else if (gameTable[2][0].equals("O") && gameTable[2][1].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[2][0].equals("O") && gameTable[2][2].equals("O") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
            compMove[0] = 2;
            compMove[1] = 1;
        } else if (gameTable[2][2].equals("O") && gameTable[2][1].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 2;
            compMove[1] = 0;
        } else if (gameTable[0][0].equals("O") && gameTable[1][0].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else if (gameTable[0][0].equals("O") && gameTable[2][0].equals("O") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
            compMove[0] = 1;
            compMove[1] = 0;
        } else if (gameTable[2][0].equals("O") && gameTable[1][0].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
            compMove[0] = 0;
            compMove[1] = 0;
        } else if (gameTable[0][1].equals("O") && gameTable[1][1].equals("O") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
            compMove[0] = 2;
            compMove[1] = 1;
        } else if (gameTable[1][1].equals("O") && gameTable[2][1].equals("O") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
            compMove[0] = 0;
            compMove[1] = 1;
        } else if (gameTable[0][2].equals("O") && gameTable[1][2].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[0][2].equals("O") && gameTable[2][2].equals("O") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
            compMove[0] = 0;
            compMove[1] = 1;
        } else if (gameTable[2][2].equals("O") && gameTable[1][2].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else if (gameTable[0][0].equals("O") && gameTable[1][1].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[1][1].equals("O") && gameTable[2][2].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[1][2] = "O";
            compMove[0] = 1;
            compMove[1] = 2;
        } else if (gameTable[0][2].equals("O") && gameTable[1][1].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 2;
            compMove[1] = 0;
        } else if (gameTable[2][0].equals("O") && gameTable[1][1].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else if (gameTable[0][0].equals("X") && gameTable[0][1].equals("X") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else if (gameTable[0][0].equals("X") && gameTable[0][2].equals("X") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
            compMove[0] = 0;
            compMove[1] = 1;
        } else if (gameTable[0][1].equals("X") && gameTable[0][2].equals("X") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
            compMove[0] = 0;
            compMove[1] = 0;
        } else if (gameTable[1][0].equals("X") && gameTable[1][1].equals("X") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
            compMove[0] = 1;
            compMove[1] = 2;
        } else if (gameTable[1][2].equals("X") && gameTable[1][1].equals("X") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
            compMove[0] = 1;
            compMove[1] = 0;
        } else if (gameTable[2][0].equals("X") && gameTable[2][1].equals("X") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[2][0].equals("X") && gameTable[2][2].equals("X") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
            compMove[0] = 2;
            compMove[1] = 1;
        } else if (gameTable[2][2].equals("X") && gameTable[2][1].equals("X") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 2;
            compMove[1] = 0;
        } else if (gameTable[0][0].equals("X") && gameTable[1][0].equals("X") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 2;
            compMove[1] = 0;
        } else if (gameTable[0][0].equals("X") && gameTable[2][0].equals("X") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
            compMove[0] = 1;
            compMove[1] = 0;
        } else if (gameTable[2][0].equals("X") && gameTable[1][0].equals("X") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
            compMove[0] = 0;
            compMove[1] = 0;
        } else if (gameTable[0][1].equals("X") && gameTable[1][1].equals("X") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
            compMove[0] = 2;
            compMove[1] = 1;
        } else if (gameTable[1][1].equals("X") && gameTable[2][1].equals("X") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
            compMove[0] = 0;
            compMove[1] = 1;
        } else if (gameTable[0][2].equals("X") && gameTable[1][2].equals("X") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[0][2].equals("X") && gameTable[2][2].equals("X") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
            compMove[0] = 1;
            compMove[1] = 2;
        } else if (gameTable[2][2].equals("X") && gameTable[1][2].equals("X") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else if (gameTable[0][0].equals("X") && gameTable[1][1].equals("X") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[1][1].equals("X") && gameTable[2][2].equals("X") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
            compMove[0] = 0;
            compMove[1] = 0;
        } else if (gameTable[0][2].equals("X") && gameTable[1][1].equals("X") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 2;
            compMove[1] = 0;
        } else if (gameTable[2][0].equals("X") && gameTable[1][1].equals("X") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else {
            int x = random012();
            int y = random012();
            if (gameTable[x][y].equals(" ")) {
                gameTable[x][y] = "O";
                compMove[0] = x;
                compMove[1] = y;
            } else {
                System.out.println("Szukam ponownie");
                computerMoveNormal2();
            }
        }
        compMoveRow = compMove[0];
        compMoveColumn = compMove[1];
        System.out.println(compMove[0] + " " + compMove[1]);
        System.out.println("compMoveColumn: " + compMoveColumn);
        System.out.println("compMoveRow: " + compMoveRow);
    }

    public void computerMoveExpert() {
        if (gameTable[1][1].equals(" ")) {
            gameTable[1][1] = "O";
            compMove[0] = 1;
            compMove[1] = 1;
        } else if (gameTable[1][1].equals("X") && gameTable[0][0].equals(" ") && gameTable[0][1].equals(" ") &&
                gameTable[0][2].equals(" ") && gameTable[1][0].equals(" ") && gameTable[1][2].equals(" ") &&
                gameTable[2][0].equals(" ") && gameTable[2][1].equals(" ") && gameTable[2][2].equals(" ")) {
            int x = random02();
            int y = random02();
            gameTable[x][y] = "O";
            compMove[0] = x;
            compMove[1] = y;
        }
        compMoveRow = compMove[0];
        compMoveColumn = compMove[1];
        System.out.println(compMove[0] + " " + compMove[1]);
        System.out.println("compMoveColumn: " + compMoveColumn);
        System.out.println("compMoveRow: " + compMoveRow);
    }

    public void computerMoveExpert2() {
        if (gameTable[0][0].equals("O") && gameTable[0][1].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else if (gameTable[0][0].equals("O") && gameTable[0][2].equals("O") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
            compMove[0] = 0;
            compMove[1] = 1;
        } else if (gameTable[0][1].equals("O") && gameTable[0][2].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
            compMove[0] = 0;
            compMove[1] = 0;
        } else if (gameTable[1][0].equals("O") && gameTable[1][1].equals("O") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
            compMove[0] = 1;
            compMove[1] = 2;
        } else if (gameTable[1][2].equals("O") && gameTable[1][1].equals("O") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
            compMove[0] = 1;
            compMove[1] = 0;
        } else if (gameTable[2][0].equals("O") && gameTable[2][1].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[2][0].equals("O") && gameTable[2][2].equals("O") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
            compMove[0] = 2;
            compMove[1] = 1;
        } else if (gameTable[2][2].equals("O") && gameTable[2][1].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 2;
            compMove[1] = 0;
        } else if (gameTable[0][0].equals("O") && gameTable[1][0].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 2;
            compMove[1] = 0;
        } else if (gameTable[0][0].equals("O") && gameTable[2][0].equals("O") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
            compMove[0] = 1;
            compMove[1] = 0;
        } else if (gameTable[2][0].equals("O") && gameTable[1][0].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
            compMove[0] = 0;
            compMove[1] = 0;
        } else if (gameTable[0][1].equals("O") && gameTable[1][1].equals("O") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
            compMove[0] = 2;
            compMove[1] = 1;
        } else if (gameTable[1][1].equals("O") && gameTable[2][1].equals("O") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
            compMove[0] = 0;
            compMove[1] = 1;
        } else if (gameTable[0][2].equals("O") && gameTable[1][2].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[0][2].equals("O") && gameTable[2][2].equals("O") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
            compMove[0] = 1;
            compMove[1] = 2;
        } else if (gameTable[2][2].equals("O") && gameTable[1][2].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else if (gameTable[0][0].equals("O") && gameTable[1][1].equals("O") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[1][1].equals("O") && gameTable[2][2].equals("O") && gameTable[0][0].equals(" ")) {
            gameTable[1][2] = "O";
            compMove[0] = 1;
            compMove[1] = 2;
        } else if (gameTable[0][2].equals("O") && gameTable[1][1].equals("O") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 2;
            compMove[1] = 0;
        } else if (gameTable[2][0].equals("O") && gameTable[1][1].equals("O") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else if (gameTable[0][0].equals("X") && gameTable[0][1].equals("X") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else if (gameTable[0][0].equals("X") && gameTable[0][2].equals("X") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
            compMove[0] = 0;
            compMove[1] = 1;
        } else if (gameTable[0][1].equals("X") && gameTable[0][2].equals("X") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
            compMove[0] = 0;
            compMove[1] = 0;
        } else if (gameTable[1][0].equals("X") && gameTable[1][1].equals("X") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
            compMove[0] = 1;
            compMove[1] = 2;
        } else if (gameTable[1][2].equals("X") && gameTable[1][1].equals("X") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
            compMove[0] = 1;
            compMove[1] = 0;
        } else if (gameTable[2][0].equals("X") && gameTable[2][1].equals("X") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[2][0].equals("X") && gameTable[2][2].equals("X") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
            compMove[0] = 2;
            compMove[1] = 1;
        } else if (gameTable[2][2].equals("X") && gameTable[2][1].equals("X") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 2;
            compMove[1] = 0;
        } else if (gameTable[0][0].equals("X") && gameTable[1][0].equals("X") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 2;
            compMove[1] = 0;
        } else if (gameTable[0][0].equals("X") && gameTable[2][0].equals("X") && gameTable[1][0].equals(" ")) {
            gameTable[1][0] = "O";
            compMove[0] = 1;
            compMove[1] = 0;
        } else if (gameTable[2][0].equals("X") && gameTable[1][0].equals("X") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
            compMove[0] = 0;
            compMove[1] = 0;
        } else if (gameTable[0][1].equals("X") && gameTable[1][1].equals("X") && gameTable[2][1].equals(" ")) {
            gameTable[2][1] = "O";
            compMove[0] = 2;
            compMove[1] = 1;
        } else if (gameTable[1][1].equals("X") && gameTable[2][1].equals("X") && gameTable[0][1].equals(" ")) {
            gameTable[0][1] = "O";
            compMove[0] = 0;
            compMove[1] = 1;
        } else if (gameTable[0][2].equals("X") && gameTable[1][2].equals("X") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[0][2].equals("X") && gameTable[2][2].equals("X") && gameTable[1][2].equals(" ")) {
            gameTable[1][2] = "O";
            compMove[0] = 1;
            compMove[1] = 2;
        } else if (gameTable[2][2].equals("X") && gameTable[1][2].equals("X") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else if (gameTable[0][0].equals("X") && gameTable[1][1].equals("X") && gameTable[2][2].equals(" ")) {
            gameTable[2][2] = "O";
            compMove[0] = 2;
            compMove[1] = 2;
        } else if (gameTable[1][1].equals("X") && gameTable[2][2].equals("X") && gameTable[0][0].equals(" ")) {
            gameTable[0][0] = "O";
            compMove[0] = 0;
            compMove[1] = 0;
        } else if (gameTable[0][2].equals("X") && gameTable[1][1].equals("X") && gameTable[2][0].equals(" ")) {
            gameTable[2][0] = "O";
            compMove[0] = 2;
            compMove[1] = 0;
        } else if (gameTable[2][0].equals("X") && gameTable[1][1].equals("X") && gameTable[0][2].equals(" ")) {
            gameTable[0][2] = "O";
            compMove[0] = 0;
            compMove[1] = 2;
        } else if (gameTable[1][1].equals("X") && gameTable[0][0].equals(" ") && gameTable[0][1].equals(" ") &&
                gameTable[0][2].equals(" ") && gameTable[1][0].equals(" ") && gameTable[1][2].equals(" ") &&
                gameTable[2][0].equals(" ") && gameTable[2][1].equals(" ") && gameTable[2][2].equals(" ")) {
            int x = random02();
            int y = random02();
            gameTable[x][y] = "O";
            compMove[0] = x;
            compMove[1] = y;
        }else if (gameTable[0][0].equals(" ") || gameTable[0][1].equals(" ") ||
                gameTable[0][2].equals(" ") || gameTable[1][0].equals(" ") || gameTable[1][2].equals(" ") ||
                gameTable[2][0].equals(" ") || gameTable[2][1].equals(" ") || gameTable[2][2].equals(" ")){
            int x = random02();
            int y = random02();
            if (gameTable[x][y].equals(" ")){
                gameTable[x][y] = "O";
                compMove[0] = x;
                compMove[1] = y;
            }else{
                System.out.println("Szukam ponownie");
                computerMoveExpert2();
            }
        }else {
            int x = random012();
            int y = random012();
            if (gameTable[x][y].equals(" ")) {
                gameTable[x][y] = "O";
                compMove[0] = x;
                compMove[1] = y;
            } else {
                System.out.println("Szukam ponownie");
                computerMoveExpert2();
            }
        }
        compMoveRow = compMove[0];
        compMoveColumn = compMove[1];
        System.out.println(compMove[0] + " " + compMove[1]);
        System.out.println("compMoveColumn: " + compMoveColumn);
        System.out.println("compMoveRow: " + compMoveRow);
    }


    public void userWins() {
        if ((gameTable[0][0].equals("X") && gameTable[0][1].equals("X") && gameTable[0][2].equals("X")) ||
                (gameTable[1][0].equals("X") && gameTable[1][1].equals("X") && gameTable[1][2].equals("X")) ||
                (gameTable[2][0].equals("X") && gameTable[2][1].equals("X") && gameTable[2][2].equals("X")) ||
                (gameTable[0][0].equals("X") && gameTable[1][0].equals("X") && gameTable[2][0].equals("X")) ||
                (gameTable[0][1].equals("X") && gameTable[1][1].equals("X") && gameTable[2][1].equals("X")) ||
                (gameTable[0][2].equals("X") && gameTable[1][2].equals("X") && gameTable[2][2].equals("X")) ||
                (gameTable[0][0].equals("X") && gameTable[1][1].equals("X") && gameTable[2][2].equals("X")) ||
                (gameTable[0][2].equals("X") && gameTable[1][1].equals("X") && gameTable[2][0].equals("X"))) {
            status.setText("CONGRATULATION, YOU WON!");
            isUserWinner = true;
            buttonDisable();
        }
    }

    public void computerWins(){
        if((gameTable[0][0].equals("O") && gameTable[0][1].equals("O") && gameTable[0][2].equals("O")) ||
                (gameTable[1][0].equals("O") && gameTable[1][1].equals("O") && gameTable[1][2].equals("O") ) ||
                (gameTable[2][0].equals("O") && gameTable[2][1].equals("O") && gameTable[2][2].equals("O") ) ||
                (gameTable[0][0].equals("O") && gameTable[1][0].equals("O") && gameTable[2][0].equals("O") ) ||
                (gameTable[0][1].equals("O") && gameTable[1][1].equals("O") && gameTable[2][1].equals("O") ) ||
                (gameTable[0][2].equals("O") && gameTable[1][2].equals("O") && gameTable[2][2].equals("O") ) ||
                (gameTable[0][0].equals("O") && gameTable[1][1].equals("O") && gameTable[2][2].equals("O") ) ||
                (gameTable[0][2].equals("O") && gameTable[1][1].equals("O") && gameTable[2][0].equals("O") )){
            status.setText("GAME OVER, YOU LOSE!");
            buttonDisable();
        }
    }

    public void tie(){
        List<String> list = new ArrayList<>();
        for (int j = 0; j < gameTable.length; j++){
            for (int k = 0; k < gameTable[j].length; k++){
                list.add(gameTable[j][k]);
            }
        }

        if (list.contains(" ")){

        }else if ((gameTable[0][0].equals("X") && gameTable[0][1].equals("X") && gameTable[0][2].equals("X")) ||
                (gameTable[1][0].equals("X") && gameTable[1][1].equals("X") && gameTable[1][2].equals("X")) ||
                (gameTable[2][0].equals("X") && gameTable[2][1].equals("X") && gameTable[2][2].equals("X")) ||
                (gameTable[0][0].equals("X") && gameTable[1][0].equals("X") && gameTable[2][0].equals("X")) ||
                (gameTable[0][1].equals("X") && gameTable[1][1].equals("X") && gameTable[2][1].equals("X")) ||
                (gameTable[0][2].equals("X") && gameTable[1][2].equals("X") && gameTable[2][2].equals("X")) ||
                (gameTable[0][0].equals("X") && gameTable[1][1].equals("X") && gameTable[2][2].equals("X")) ||
                (gameTable[0][2].equals("X") && gameTable[1][1].equals("X") && gameTable[2][0].equals("X"))) {
            status.setText("CONGRATULATION, YOU WON!");
            buttonDisable();
        }else{
            status.setText("GAME OVER, TIE!");
            buttonDisable();
        }
    }

    public void buttonDisable(){
        button1.setDisable(true);
        button2.setDisable(true);
        button3.setDisable(true);
        button4.setDisable(true);
        button5.setDisable(true);
        button6.setDisable(true);
        button7.setDisable(true);
        button8.setDisable(true);
        button9.setDisable(true);
    }

    public void buttonAnable(){
        button1.setDisable(false);
        button1.setText(" ");
        button2.setDisable(false);
        button2.setText(" ");
        button3.setDisable(false);
        button3.setText(" ");
        button4.setDisable(false);
        button4.setText(" ");
        button5.setDisable(false);
        button5.setText(" ");
        button6.setDisable(false);
        button6.setText(" ");
        button7.setDisable(false);
        button7.setText(" ");
        button8.setDisable(false);
        button8.setText(" ");
        button9.setDisable(false);
        button9.setText(" ");
    }

    public void restartGame(){
        for (int j = 0; j < gameTable.length; j++) {
            for (int k = 0; k < gameTable[j].length; k++) {
                gameTable[j][k] = " ";
            }
        }
        for (int i =0; i<gameTable.length; i++){
            System.out.println(Arrays.toString(gameTable[i]));
        }

        grid.getChildren().clear();

        grid.add(button1, 0,0);
        button1.setText(" ");
        grid.add(button2, 1,0);
        button2.setText(" ");
        grid.add(button3, 2,0);
        button3.setText(" ");
        grid.add(button4, 0,1);
        button4.setText(" ");
        grid.add(button5, 1,1);
        button5.setText(" ");
        grid.add(button6, 2,1);
        button6.setText(" ");
        grid.add(button7, 0,2);
        button7.setText(" ");
        grid.add(button8, 1,2);
        button8.setText(" ");
        grid.add(button9, 2,2);
        button9.setText(" ");

        buttonAnable();
        isUserWinner = false;
        status.setText("YOUR TURN - GOOD LUCK!");
    }

    private void buildGameMenu(Stage primaryStage){
        gameMenu = new Menu("File");

        newGameItem = new MenuItem("New game");
        newGameItem.setOnAction((e) -> {
            restartGame();
        });

        exitItem = new MenuItem("Quit game");
        exitItem.setOnAction((e) -> {
            primaryStage.close();
        });

        gameMenu.getItems().add(newGameItem);
        gameMenu.getItems().add(exitItem);
    }

    private void buildDifficultyMenu(){
        difficultyMenu = new Menu("Difficulty");

        beginner = new RadioMenuItem("Beginner");
        normal = new RadioMenuItem("Normal");
        expert = new RadioMenuItem("Expert");

        beginner.setSelected(true);

        ToggleGroup difficultyToggleGroup = new ToggleGroup();
        beginner.setToggleGroup(difficultyToggleGroup);
        normal.setToggleGroup(difficultyToggleGroup);
        expert.setToggleGroup(difficultyToggleGroup);

        beginner.setOnAction((e) -> {
            beginnerLevel = true;
            normalLevel = false;
            expertLevel = false;
            level.setText("Level: BEGINNER");

        });

        normal.setOnAction((e) -> {
            normalLevel = true;
            beginnerLevel = false;
            expertLevel = false;
            level.setText("Level: NORMAL");
        });

        expert.setOnAction((e) -> {
            normalLevel = false;
            beginnerLevel = false;
            expertLevel = true;
            level.setText("Level: EXPERT");

        });

        difficultyMenu.getItems().add(beginner);
        difficultyMenu.getItems().add(normal);
        difficultyMenu.getItems().add(expert);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        level.setFont(new Font( "Arial",20));
        level.setTextFill(Color.web("#000"));

        status.setFont(new Font("Arial", 20));
        status.setTextFill(Color.web("#000"));

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true,true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        Background background = new Background(backgroundImage);

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(150);
        grid.setVgap(150);

        grid.add(button1, 0,0);
        grid.add(button2, 1,0);
        grid.add(button3, 2,0);
        grid.add(button4, 0,1);
        grid.add(button5, 1,1);
        grid.add(button6, 2,1);
        grid.add(button7, 0,2);
        grid.add(button8, 1,2);
        grid.add(button9, 2,2);

        button1.setOnAction((e) -> {
            if (gameTable[0][0].equals(" ")){
                button1.setText("X");
                button1.setDisable(true);
                gameTable[0][0] = "X";
                crossView1.setFitHeight(20);
                crossView1.setFitWidth(20);
                grid.add(crossView1,0,0);

                tie();
                userWins();

                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                if (!isUserWinner) {
                    List<String> list = new ArrayList<>();
                    for (int j = 0; j < gameTable.length; j++) {
                        for (int k = 0; k < gameTable[j].length; k++) {
                            list.add(gameTable[j][k]);
                        }
                    }

                    int occurrencesX = Collections.frequency(list, "X");

                    if (list.contains(" ")) {
                        if (beginnerLevel) {
                            computerMove();
                        }else if (normalLevel) {
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveNormal();
                            } else {
                                computerMoveNormal2();
                            }
                        }else if (expertLevel){
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveExpert();
                            } else {
                                computerMoveExpert2();
                            }
                        }
                        wheelView1.setFitWidth(20);
                        wheelView1.setFitHeight(20);
                        grid.add(wheelView1, compMoveColumn, compMoveRow);
                        for (int i = 0; i < gameTable.length; i++) {
                            System.out.println(Arrays.toString(gameTable[i]));
                        }
                    }
                }
                computerWins();
                tie();
            }
        });

        button2.setOnAction((e) -> {
            if (gameTable[0][1].equals(" ")){
                button2.setText("X");
                button2.setDisable(true);
                gameTable[0][1] = "X";
                crossView2.setFitHeight(20);
                crossView2.setFitWidth(20);
                grid.add(crossView2,1,0);

                tie();
                userWins();

                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                if (!isUserWinner) {
                    List<String> list = new ArrayList<>();
                    for (int j = 0; j < gameTable.length; j++) {
                        for (int k = 0; k < gameTable[j].length; k++) {
                            list.add(gameTable[j][k]);
                        }
                    }

                    int occurrencesX = Collections.frequency(list, "X");

                    if (list.contains(" ")) {
                        if (beginnerLevel) {
                            computerMove();
                        }else if (normalLevel) {
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveNormal();
                            } else {
                                computerMoveNormal2();
                            }
                        }else if (expertLevel){
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveExpert();
                            } else {
                                computerMoveExpert2();
                            }
                        }
                        wheelView2.setFitWidth(20);
                        wheelView2.setFitHeight(20);
                        grid.add(wheelView2, compMoveColumn, compMoveRow);
                        for (int i = 0; i < gameTable.length; i++) {
                            System.out.println(Arrays.toString(gameTable[i]));
                        }
                    }
                }
                computerWins();
                tie();
            }
        });

        button3.setOnAction((e) -> {
            if (gameTable[0][2].equals(" ")){
                button3.setText("X");
                button3.setDisable(true);
                gameTable[0][2] = "X";
                crossView3.setFitHeight(20);
                crossView3.setFitWidth(20);
                grid.add(crossView3,2,0);

                tie();
                userWins();

                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                if (!isUserWinner) {
                    List<String> list = new ArrayList<>();
                    for (int j = 0; j < gameTable.length; j++) {
                        for (int k = 0; k < gameTable[j].length; k++) {
                            list.add(gameTable[j][k]);
                        }
                    }

                    int occurrencesX = Collections.frequency(list, "X");

                    if (list.contains(" ")) {
                        if (beginnerLevel) {
                            computerMove();
                        }else if (normalLevel) {
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveNormal();
                            } else {
                                computerMoveNormal2();
                            }
                        }else if (expertLevel){
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveExpert();
                            } else {
                                computerMoveExpert2();
                            }
                        }
                        wheelView3.setFitWidth(20);
                        wheelView3.setFitHeight(20);
                        grid.add(wheelView3, compMoveColumn, compMoveRow);
                        for (int i = 0; i < gameTable.length; i++) {
                            System.out.println(Arrays.toString(gameTable[i]));
                        }
                    }
                }
                computerWins();
                tie();
            }
        });

        button4.setOnAction((e) -> {
            if (gameTable[1][0].equals(" ")){
                button4.setText("X");
                button4.setDisable(true);
                gameTable[1][0] = "X";
                crossView4.setFitHeight(20);
                crossView4.setFitWidth(20);
                grid.add(crossView4,0,1);

                tie();
                userWins();

                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                if (!isUserWinner) {
                    List<String> list = new ArrayList<>();
                    for (int j = 0; j < gameTable.length; j++) {
                        for (int k = 0; k < gameTable[j].length; k++) {
                            list.add(gameTable[j][k]);
                        }
                    }

                    int occurrencesX = Collections.frequency(list, "X");

                    if (list.contains(" ")) {
                        if (beginnerLevel) {
                            computerMove();
                        }else if (normalLevel) {
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveNormal();
                            } else {
                                computerMoveNormal2();
                            }
                        }else if (expertLevel){
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveExpert();
                            } else {
                                computerMoveExpert2();
                            }
                        }
                        wheelView4.setFitWidth(20);
                        wheelView4.setFitHeight(20);
                        grid.add(wheelView4, compMoveColumn, compMoveRow);
                        for (int i = 0; i < gameTable.length; i++) {
                            System.out.println(Arrays.toString(gameTable[i]));
                        }
                    }
                }
                computerWins();
                tie();
            }
        });

        button5.setOnAction((e) -> {
            if (gameTable[1][1].equals(" ")){
                button5.setText("X");
                button5.setDisable(true);
                gameTable[1][1] = "X";
                crossView5.setFitHeight(20);
                crossView5.setFitWidth(20);
                grid.add(crossView5,1,1);

                tie();
                userWins();

                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                if (!isUserWinner) {
                    List<String> list = new ArrayList<>();
                    for (int j = 0; j < gameTable.length; j++) {
                        for (int k = 0; k < gameTable[j].length; k++) {
                            list.add(gameTable[j][k]);
                        }
                    }

                    int occurrencesX = Collections.frequency(list, "X");

                    if (list.contains(" ")) {
                        if (beginnerLevel) {
                            computerMove();
                        }else if (normalLevel) {
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveNormal();
                            } else {
                                computerMoveNormal2();
                            }
                        }else if (expertLevel){
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveExpert();
                            } else {
                                computerMoveExpert2();
                            }
                        }
                        wheelView5.setFitWidth(20);
                        wheelView5.setFitHeight(20);
                        grid.add(wheelView5, compMoveColumn, compMoveRow);
                        for (int i = 0; i < gameTable.length; i++) {
                            System.out.println(Arrays.toString(gameTable[i]));
                        }
                    }
                }
                computerWins();
                tie();
            }
        });

        button6.setOnAction((e) -> {
            if (gameTable[1][2].equals(" ")){
                button6.setText("X");
                button6.setDisable(true);
                gameTable[1][2] = "X";
                crossView6.setFitHeight(20);
                crossView6.setFitWidth(20);
                grid.add(crossView6,2,1);

                tie();
                userWins();

                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                if (!isUserWinner) {
                    List<String> list = new ArrayList<>();
                    for (int j = 0; j < gameTable.length; j++) {
                        for (int k = 0; k < gameTable[j].length; k++) {
                            list.add(gameTable[j][k]);
                        }
                    }

                    int occurrencesX = Collections.frequency(list, "X");

                    if (list.contains(" ")) {
                        if (beginnerLevel) {
                            computerMove();
                        }else if (normalLevel) {
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveNormal();
                            } else {
                                computerMoveNormal2();
                            }
                        }else if (expertLevel){
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveExpert();
                            } else {
                                computerMoveExpert2();
                            }
                        }
                        wheelView6.setFitWidth(20);
                        wheelView6.setFitHeight(20);
                        grid.add(wheelView6, compMoveColumn, compMoveRow);
                        for (int i = 0; i < gameTable.length; i++) {
                            System.out.println(Arrays.toString(gameTable[i]));
                        }
                    }
                }
                computerWins();
                tie();
            }
        });

        button7.setOnAction((e) -> {
            if (gameTable[2][0].equals(" ")){
                button7.setText("X");
                button7.setDisable(true);
                gameTable[2][0] = "X";
                crossView7.setFitHeight(20);
                crossView7.setFitWidth(20);
                grid.add(crossView7,0,2);

                tie();
                userWins();

                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                if (!isUserWinner) {
                    List<String> list = new ArrayList<>();
                    for (int j = 0; j < gameTable.length; j++) {
                        for (int k = 0; k < gameTable[j].length; k++) {
                            list.add(gameTable[j][k]);
                        }
                    }

                    int occurrencesX = Collections.frequency(list, "X");

                    if (list.contains(" ")) {
                        if (beginnerLevel) {
                            computerMove();
                        }else if (normalLevel) {
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveNormal();
                            } else {
                                computerMoveNormal2();
                            }
                        }else if (expertLevel){
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveExpert();
                            } else {
                                computerMoveExpert2();
                            }
                        }
                        wheelView7.setFitWidth(20);
                        wheelView7.setFitHeight(20);
                        grid.add(wheelView7, compMoveColumn, compMoveRow);
                        for (int i = 0; i < gameTable.length; i++) {
                            System.out.println(Arrays.toString(gameTable[i]));
                        }
                    }
                }
                computerWins();
                tie();
            }
        });

        button8.setOnAction((e) -> {
            if (gameTable[2][1].equals(" ")){
                button8.setText("X");
                button8.setDisable(true);
                gameTable[2][1] = "X";
                crossView8.setFitHeight(20);
                crossView8.setFitWidth(20);
                grid.add(crossView8,1,2);

                tie();
                userWins();

                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                if (!isUserWinner) {
                    List<String> list = new ArrayList<>();
                    for (int j = 0; j < gameTable.length; j++) {
                        for (int k = 0; k < gameTable[j].length; k++) {
                            list.add(gameTable[j][k]);
                        }
                    }

                    int occurrencesX = Collections.frequency(list, "X");

                    if (list.contains(" ")) {
                        if (beginnerLevel) {
                            computerMove();
                        }else if (normalLevel) {
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveNormal();
                            } else {
                                computerMoveNormal2();
                            }
                        }else if (expertLevel){
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveExpert();
                            } else {
                                computerMoveExpert2();
                            }
                        }
                        wheelView8.setFitWidth(20);
                        wheelView8.setFitHeight(20);
                        grid.add(wheelView8, compMoveColumn, compMoveRow);
                        for (int i = 0; i < gameTable.length; i++) {
                            System.out.println(Arrays.toString(gameTable[i]));
                        }
                    }
                }
                computerWins();
                tie();
            }
        });

        button9.setOnAction((e) -> {
            if (gameTable[2][2].equals(" ")){
                button9.setText("X");
                button9.setDisable(true);
                gameTable[2][2] = "X";
                crossView9.setFitHeight(20);
                crossView9.setFitWidth(20);
                grid.add(crossView9,2,2);

                tie();
                userWins();

                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                if (!isUserWinner) {
                    List<String> list = new ArrayList<>();
                    for (int j = 0; j < gameTable.length; j++) {
                        for (int k = 0; k < gameTable[j].length; k++) {
                            list.add(gameTable[j][k]);
                        }
                    }

                    int occurrencesX = Collections.frequency(list, "X");

                    if (list.contains(" ")) {
                        if (beginnerLevel) {
                            computerMove();
                        }else if (normalLevel) {
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveNormal();
                            } else {
                                computerMoveNormal2();
                            }
                        }else if (expertLevel){
                            if (occurrencesX == 1 || occurrencesX == 0) {
                                computerMoveExpert();
                            } else {
                                computerMoveExpert2();
                            }
                        }
                        wheelView9.setFitWidth(20);
                        wheelView9.setFitHeight(20);
                        grid.add(wheelView9, compMoveColumn, compMoveRow);
                        for (int i = 0; i < gameTable.length; i++) {
                            System.out.println(Arrays.toString(gameTable[i]));
                        }
                    }
                }
                computerWins();
                tie();
            }
        });

        GridPane gridPaneAll = new GridPane();
        gridPaneAll.setAlignment(Pos.CENTER);
        gridPaneAll.setPadding(new Insets(95,10,10,5));
        gridPaneAll.setHgap(10);
        gridPaneAll.setVgap(10);
        gridPaneAll.setBackground(background);

        Button newGame = new Button("New Game");
        newGame.setOnAction((e) -> {
            restartGame();
        });

        VBox vBox = new VBox(20,level, status, newGame);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding((new Insets(100)));

        gridPaneAll.add(grid,0,0);
        gridPaneAll.add(vBox,0,1);

        menuBar = new MenuBar();

        buildGameMenu(primaryStage);
        buildDifficultyMenu();

        menuBar.getMenus().add(gameMenu);
        menuBar.getMenus().add(difficultyMenu);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        borderPane.setCenter(gridPaneAll);


        Scene scene = new Scene(borderPane, 600, 750);

        primaryStage.setTitle("TIC TAC TOE");
        primaryStage.setScene(scene);
        primaryStage.show();

        //---------------------------------
        Label enterYourName = new Label("ENTER YOUR NAME:");
        name = new TextField();

        statusWelcomeWindow.setFont(new Font("Arial", 15));

        Button save = new Button("Save");
        save.setOnAction((e) -> {
            userName = name.getText();
            if (userName.length() > 0 && userName.length() <= 10){
                Stage newWindow = (Stage) save.getScene().getWindow();
                newWindow.close();
            }else if(userName.length() > 10){
                statusWelcomeWindow.setText("Sorry! 1-10 characters!");
                name.clear();
            }else{
                statusWelcomeWindow.setText("Sorry! 1-10 characters!");
            }

        });

        Button clear = new Button("Clear");
        clear.setOnAction((e) -> {
            name.clear();
        });

        VBox enterUserName = new VBox(10, enterYourName, name, statusWelcomeWindow, save, clear);
        enterUserName.setAlignment(Pos.CENTER);
        enterUserName.setPadding(new Insets(10));

        Scene scene2 = new Scene(enterUserName, 250, 250);
        Stage newWindow = new Stage();
        newWindow.setTitle("Welcome!");
        newWindow.setScene(scene2);
        newWindow.initModality(Modality.WINDOW_MODAL);
        newWindow.initOwner(primaryStage);
        newWindow.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
