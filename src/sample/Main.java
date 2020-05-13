package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main extends Application {
    private String [][] gameTable = {{" "," "," "},{" "," "," "},{" "," "," "}};
    private Label status = new Label("YOUR TURN - GOOD LUCK!");
    private int compMoveColumn;
    private int compMoveRow;
    private int[] compMove = {0,0};
    private boolean isUserWinner = false;
    GridPane grid = new GridPane();

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


    @Override
    public void start(Stage primaryStage) throws Exception{

        status.setFont(new Font("Arial", 24));
        status.setTextFill(Color.web("#FFF"));

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true,true, true);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        //GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(80,20,10,10));
        grid.setHgap(150);
        grid.setVgap(150);
        //grid.setBackground(background);


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

                    if (list.contains(" ")) {
                        computerMove();
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

                    if (list.contains(" ")) {
                        computerMove();
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

                    if (list.contains(" ")) {
                        computerMove();
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

                    if (list.contains(" ")) {
                        computerMove();
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

                    if (list.contains(" ")) {
                        computerMove();
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

                    if (list.contains(" ")) {
                        computerMove();
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

                    if (list.contains(" ")) {
                        computerMove();
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

                    if (list.contains(" ")) {
                        computerMove();
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

                    if (list.contains(" ")) {
                        computerMove();
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
        gridPaneAll.setAlignment(Pos.TOP_CENTER);
        gridPaneAll.setPadding(new Insets(20,10,10,20));
        gridPaneAll.setHgap(10);
        gridPaneAll.setVgap(10);
        gridPaneAll.setBackground(background);

        Button newGame = new Button("New Game");
        newGame.setOnAction((e) -> {
            restartGame();
        });

        VBox vBox = new VBox(20,status, newGame);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding((new Insets(100)));

        gridPaneAll.add(grid,0,0);
        gridPaneAll.add(vBox,0,1);

        Scene scene = new Scene(gridPaneAll, 600, 700, Color.GREY);

        primaryStage.setTitle("TIC TAC TOE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
