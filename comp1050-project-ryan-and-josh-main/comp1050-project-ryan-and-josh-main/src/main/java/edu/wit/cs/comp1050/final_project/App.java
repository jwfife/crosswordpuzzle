package edu.wit.cs.comp1050.final_project;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight; 

/**
 * A simple JavaFX App that displays an image
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        stage.setTitle("Ryan and Josh's Crossword");
        Image logo = new Image(App.class.getResourceAsStream("TitlePicture.png"));
        
        ImageView logoImage = new ImageView(logo);
        logoImage.setFitHeight(378.5);
        logoImage.setFitWidth(681);
        
        StackPane pane3 = new StackPane(logoImage);
        pane3.setMaxSize(683, 380);
        pane3.setStyle("-fx-border-color: black;" + "-fx-border-width: 5;");

        HBox pane2 = new HBox();
        Button btnE = new Button("START");
        

        btnE.setFont(Font.font("Helvetica", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 30));
        
        
        pane2.getChildren().addAll(btnE);
        pane2.setSpacing(200);
        pane2.setAlignment(Pos.CENTER);
        
        VBox pane = new VBox();
        pane.getChildren().add(pane3);
        pane.getChildren().add(pane2);
        pane.setSpacing(40);
        pane.setAlignment(Pos.CENTER); //this is at the very center; might want to move down a bit later
        
        var scene = new Scene(pane, 1250, 800);
        pane.setStyle("-fx-background-color: #a5c5d4");
        stage.setScene(scene);
        stage.setMaximized(true);        
        stage.show();
        
        Text welcomeText = new Text();
        Text chooseText = new Text();
        Text disclaimer = new Text();
        
        welcomeText.setText("Hello and welcome to Ryan and Josh's Crossword!");
        disclaimer.setText("*Please make sure you're in fullscreen at all times*");
        
        pane.getChildren().addAll(welcomeText, chooseText, disclaimer);
        welcomeText.setFont(Font.font("verdana", FontWeight.BOLD, 30)); 
        chooseText.setFont(Font.font("verdana", FontWeight.BOLD, 30));
        disclaimer.setFont(Font.font("verdana", FontWeight.NORMAL, FontPosture.ITALIC, 25));
        
        btnE.setOnAction(new EasyConfirm());

        
    }

    public static void main(String[] args) {
        launch();
        
        
    }

}