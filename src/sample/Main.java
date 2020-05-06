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

    private Image imageback = new Image ("file:resources/back.png");
    private Image empty = new Image ("file:resources/empty.png");

    public int random012(){
        int [] array = {0,1,2};
        int index = new Random().nextInt(array.length);
        System.out.println("Random: " + array[index]);
        return array[index];
    }

    public void computerMove(){
        int x = random012();
        int y = random012();
        if (gameTable[x][y].equals(" ")){
            gameTable[x][y] = "O";
            compMove[0] = x;
            compMove[1] = y;
        }else {
            System.out.println("Szukam ponownie");
            computerMove();
        }
        compMoveRow = compMove[0];
        compMoveColumn = compMove[1];
        System.out.println(compMove[0] + " " + compMove[1]);
        System.out.println("compMoveColumn: " + compMoveColumn);
        System.out.println("compMoveRow: " + compMoveRow);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{

        status.setFont(new Font("Arial", 24));
        status.setTextFill(Color.web("#FFF"));

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true,true, true);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(80,20,10,10));
        grid.setHgap(150);
        grid.setVgap(150);
        //grid.setBackground(background);

        Button button1 = new Button(" ");
        Button button2 = new Button(" ");
        Button button3 = new Button(" ");
        Button button4 = new Button(" ");
        Button button5 = new Button(" ");
        Button button6 = new Button(" ");
        Button button7 = new Button(" ");
        Button button8 = new Button(" ");
        Button button9 = new Button(" ");

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
                gameTable[0][0] = "X";
                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                List<String> list = new ArrayList<>();
                for (int j = 0; j < gameTable.length; j++){
                    for (int k = 0; k < gameTable[j].length; k++){
                        list.add(gameTable[j][k]);
                    }
                }

                if (list.contains(" ")){
                    computerMove();
                    Button buttonO1 = new Button("O");
                    grid.add(buttonO1,compMoveColumn,compMoveRow);
                    for (int i =0; i<gameTable.length; i++){
                        System.out.println(Arrays.toString(gameTable[i]));
                    }
                }else{
                    status.setText("GAME OVER");
                }


            }
        });

        button2.setOnAction((e) -> {
            if (gameTable[0][1].equals(" ")){
                button2.setText("X");
                gameTable[0][1] = "X";
                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                List<String> list = new ArrayList<>();
                for (int j = 0; j < gameTable.length; j++){
                    for (int k = 0; k < gameTable[j].length; k++){
                        list.add(gameTable[j][k]);
                    }
                }

                if (list.contains(" ")){
                    computerMove();
                    Button buttonO2 = new Button("O");
                    grid.add(buttonO2,compMoveColumn,compMoveRow);
                    for (int i =0; i<gameTable.length; i++){
                        System.out.println(Arrays.toString(gameTable[i]));
                    }
                }else{
                    status.setText("GAME OVER");
                }
            }
        });

        button3.setOnAction((e) -> {
            if (gameTable[0][2].equals(" ")){
                button3.setText("X");
                gameTable[0][2] = "X";
                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                List<String> list = new ArrayList<>();
                for (int j = 0; j < gameTable.length; j++){
                    for (int k = 0; k < gameTable[j].length; k++){
                        list.add(gameTable[j][k]);
                    }
                }

                if (list.contains(" ")){
                    computerMove();
                    Button buttonO3 = new Button("O");
                    grid.add(buttonO3,compMoveColumn,compMoveRow);
                    for (int i =0; i<gameTable.length; i++){
                        System.out.println(Arrays.toString(gameTable[i]));
                    }
                }else{
                    status.setText("GAME OVER");
                }
            }
        });

        button4.setOnAction((e) -> {
            if (gameTable[1][0].equals(" ")){
                button4.setText("X");
                gameTable[1][0] = "X";
                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                List<String> list = new ArrayList<>();
                for (int j = 0; j < gameTable.length; j++){
                    for (int k = 0; k < gameTable[j].length; k++){
                        list.add(gameTable[j][k]);
                    }
                }

                if (list.contains(" ")){
                    computerMove();
                    Button buttonO4 = new Button("O");
                    grid.add(buttonO4,compMoveColumn,compMoveRow);
                    for (int i =0; i<gameTable.length; i++){
                        System.out.println(Arrays.toString(gameTable[i]));
                    }
                }else{
                    status.setText("GAME OVER");
                }
            }
        });

        button5.setOnAction((e) -> {
            if (gameTable[1][1].equals(" ")){
                button5.setText("X");
                gameTable[1][1] = "X";
                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                List<String> list = new ArrayList<>();
                for (int j = 0; j < gameTable.length; j++){
                    for (int k = 0; k < gameTable[j].length; k++){
                        list.add(gameTable[j][k]);
                    }
                }

                if (list.contains(" ")){
                    computerMove();
                    Button buttonO5 = new Button("O");
                    grid.add(buttonO5,compMoveColumn,compMoveRow);
                    for (int i =0; i<gameTable.length; i++){
                        System.out.println(Arrays.toString(gameTable[i]));
                    }
                }else{
                    status.setText("GAME OVER");
                }
            }
        });

        button6.setOnAction((e) -> {
            if (gameTable[1][2].equals(" ")){
                button6.setText("X");
                gameTable[1][2] = "X";
                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                List<String> list = new ArrayList<>();
                for (int j = 0; j < gameTable.length; j++){
                    for (int k = 0; k < gameTable[j].length; k++){
                        list.add(gameTable[j][k]);
                    }
                }

                if (list.contains(" ")){
                    computerMove();
                    Button buttonO6 = new Button("O");
                    grid.add(buttonO6,compMoveColumn,compMoveRow);
                    for (int i =0; i<gameTable.length; i++){
                        System.out.println(Arrays.toString(gameTable[i]));
                    }
                }else{
                    status.setText("GAME OVER");
                }
            }
        });

        button7.setOnAction((e) -> {
            if (gameTable[2][0].equals(" ")){
                button7.setText("X");
                gameTable[2][0] = "X";
                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                List<String> list = new ArrayList<>();
                for (int j = 0; j < gameTable.length; j++){
                    for (int k = 0; k < gameTable[j].length; k++){
                        list.add(gameTable[j][k]);
                    }
                }

                if (list.contains(" ")){
                    computerMove();
                    Button buttonO7 = new Button("O");
                    grid.add(buttonO7,compMoveColumn,compMoveRow);
                    for (int i =0; i<gameTable.length; i++){
                        System.out.println(Arrays.toString(gameTable[i]));
                    }
                }else{
                    status.setText("GAME OVER");
                }
            }
        });

        button8.setOnAction((e) -> {
            if (gameTable[2][1].equals(" ")){
                button8.setText("X");
                gameTable[2][1] = "X";
                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                List<String> list = new ArrayList<>();
                for (int j = 0; j < gameTable.length; j++){
                    for (int k = 0; k < gameTable[j].length; k++){
                        list.add(gameTable[j][k]);
                    }
                }

                if (list.contains(" ")){
                    computerMove();
                    Button buttonO8 = new Button("O");
                    grid.add(buttonO8,compMoveColumn,compMoveRow);
                    for (int i =0; i<gameTable.length; i++){
                        System.out.println(Arrays.toString(gameTable[i]));
                    }
                }else{
                    status.setText("GAME OVER");
                }
            }
        });

        button9.setOnAction((e) -> {
            if (gameTable[2][2].equals(" ")){
                button9.setText("X");
                gameTable[2][2] = "X";
                for (int i =0; i<gameTable.length; i++){
                    System.out.println(Arrays.toString(gameTable[i]));
                }

                List<String> list = new ArrayList<>();
                for (int j = 0; j < gameTable.length; j++){
                    for (int k = 0; k < gameTable[j].length; k++){
                        list.add(gameTable[j][k]);
                    }
                }

                if (list.contains(" ")){
                    computerMove();
                    Button buttonO9 = new Button("O");
                    grid.add(buttonO9,compMoveColumn,compMoveRow);
                    for (int i =0; i<gameTable.length; i++){
                        System.out.println(Arrays.toString(gameTable[i]));
                    }
                }else{
                    status.setText("GAME OVER");
                }
            }
        });

        GridPane gridPaneAll = new GridPane();
        gridPaneAll.setAlignment(Pos.TOP_CENTER);
        gridPaneAll.setPadding(new Insets(20,10,10,20));
        gridPaneAll.setHgap(10);
        gridPaneAll.setVgap(10);
        gridPaneAll.setBackground(background);

        Button newGame = new Button("New Game");

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
