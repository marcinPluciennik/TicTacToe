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
import javafx.stage.Stage;

public class Main extends Application {

    private Image imageback = new Image ("file:resources/back.png");
    private Image empty = new Image ("file:resources/empty.png");


    @Override
    public void start(Stage primaryStage) throws Exception{
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true,true, true);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20,10,10,20));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setBackground(background);

        ImageView empty1 = new ImageView(empty);
        ImageView empty2 = new ImageView(empty);
        ImageView empty3 = new ImageView(empty);
        ImageView empty4 = new ImageView(empty);
        ImageView empty5 = new ImageView(empty);
        ImageView empty6 = new ImageView(empty);
        ImageView empty7 = new ImageView(empty);
        ImageView empty8 = new ImageView(empty);
        ImageView empty9 = new ImageView(empty);

        grid.add(empty1, 0,0);
        grid.add(empty2, 1,0);
        grid.add(empty3, 2,0);
        grid.add(empty4, 0,1);
        grid.add(empty5, 1,1);
        grid.add(empty6, 2,1);
        grid.add(empty7, 0,2);
        grid.add(empty8, 1,2);
        grid.add(empty9, 2,2);

        GridPane gridPaneAll = new GridPane();
        gridPaneAll.setAlignment(Pos.TOP_CENTER);
        gridPaneAll.setPadding(new Insets(20,10,10,20));
        gridPaneAll.setHgap(10);
        gridPaneAll.setVgap(10);
        gridPaneAll.setBackground(background);

        Label status = new Label("Blblblblb");
        Button newGame = new Button("New Game");

        gridPaneAll.add(grid,0,0);
        gridPaneAll.add(status, 0, 1);
        gridPaneAll.add(newGame,0,2);


        Scene scene = new Scene(gridPaneAll, 600, 700, Color.BLACK);

        primaryStage.setTitle("TIC TAC TOE");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
        /*
        User user = new User();
        user.getName();

        Controller controller = new Controller();
        controller.printGame();
        controller.userMove();
        controller.computerMove1();
        controller.printGame();
        controller.userMove();
        controller.computerMove2();
        controller.printGame();
        controller.userMove();
        controller.computerMove2();
        controller.printGame();

         */
    }
}
