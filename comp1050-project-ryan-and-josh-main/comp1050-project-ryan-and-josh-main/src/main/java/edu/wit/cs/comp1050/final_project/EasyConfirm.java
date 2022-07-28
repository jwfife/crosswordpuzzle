package edu.wit.cs.comp1050.final_project;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight; 

public class EasyConfirm implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Stage EasyCStage = new Stage();
            EasyCStage.setTitle("Puzzle Preview");
            
            VBox rightPane = new VBox();
            
            Image logo = new Image(App.class.getResourceAsStream("EasyCrossword.png"));
            
            ImageView logoImage = new ImageView(logo);
            logoImage.setFitHeight(760);
            logoImage.setFitWidth(550);
            rightPane.setAlignment(Pos.TOP_RIGHT);
            
            Text EASYBIG = new Text();
            Text Description = new Text();
            
            rightPane.getChildren().add(EASYBIG);
            rightPane.getChildren().add(Description);
            
            EASYBIG.setText("PUZZLE PREVIEW");
            EASYBIG.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC, 50)); 
            
            Description.setText("This puzzle consists of 8, fun and easy words!");
            Description.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 20)); 
            
            HBox test = new HBox(logoImage);
            test.getChildren().add(rightPane);
            test.setSpacing(400);
            test.setStyle("-fx-background-color: #a5c5d4");
            
            
            rightPane.setSpacing(250);
            
            VBox superPane = new VBox(test);
            superPane.setStyle("-fx-background-color: #a5c5d4");
            superPane.setAlignment(Pos.CENTER);
            superPane.setSpacing(50);
            var scene = new Scene(superPane, 1250, 800);
          
            Button play = new Button("PLAY");
            play.setFont(Font.font("Helvetica", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 30));
            
            rightPane.getChildren().add(play);
            
            EasyCStage.setScene(scene);
            EasyCStage.setMaximized(true);
            EasyCStage.show();
            
            play.setOnAction(new EasyPuzzle());
           
        }
}
