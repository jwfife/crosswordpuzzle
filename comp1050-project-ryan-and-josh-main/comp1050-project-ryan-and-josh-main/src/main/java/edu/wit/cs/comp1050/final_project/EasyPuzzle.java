package edu.wit.cs.comp1050.final_project;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight; 

public class EasyPuzzle implements EventHandler<ActionEvent> {
   
    ArrayList<String> E = new ArrayList<String>(
            Arrays.asList("BALLS",
                          "FAMILY",
                          "FAIL",
                          "YARN",
                          "NEWBORN",
                          "SCAR",
                          "CROWN",
                          "READING"));
    
    TextField userTextField = new TextField();
    KeyEvent k;
    GridPane grid1 = new GridPane();
    Text HINTS = new Text();
    Text EMPTY = new Text();
    Text DescriptionDown = new Text();
    Text DescriptionAcross = new Text();
    Text One = new Text();
    Text Two = new Text();
    Text Three = new Text();
    Text Four = new Text();
    Text Five = new Text();
    Text Six = new Text();
    Text Seven = new Text();
    Text Eight = new Text();
    Text WellDone = new Text();
    Text TryAgain = new Text();
    
    @Override
    public void handle(ActionEvent event) {
        
        Stage EasyPuzzleStage = new Stage();
        EasyPuzzleStage.setTitle("Easy Crossword Puzzle");
        
        VBox pane1 = new VBox();
        
        Image logo = new Image(App.class.getResourceAsStream("EasyCrossword.png"));
        
        ImageView logoImage = new ImageView(logo);
        logoImage.setFitHeight(760);
        logoImage.setFitWidth(550);
        pane1.setAlignment(Pos.TOP_RIGHT);
        
        HBox pane3 = new HBox();
        pane1.getChildren().add(pane3);
        pane3.setSpacing(35);
  
        VBox paneDown = new VBox();
        pane3.getChildren().add(paneDown);
        paneDown.setSpacing(60);
        
        VBox paneAcross = new VBox();
        pane3.getChildren().add(paneAcross);
        paneAcross.setSpacing(60);
        
        userTextField.setPromptText("Enter guess here");
        userTextField.setFocusTraversable(false);
        
        
        
        ////////////////////////////////////////////////////////////////////////////////
        
        paneDown.getChildren().add(HINTS);
        paneAcross.getChildren().add(EMPTY);
        
        paneDown.getChildren().add(DescriptionDown);
        paneDown.getChildren().add(One);
        paneDown.getChildren().add(Two);
        paneDown.getChildren().add(Four);
        paneDown.getChildren().add(Six);
        paneDown.getChildren().add(Seven);
        
        paneAcross.getChildren().add(DescriptionAcross);
        paneAcross.getChildren().add(Three);
        paneAcross.getChildren().add(Five);
        paneAcross.getChildren().add(Eight);
        
        ////////////////////////////////////////////////////////////////////////////////
        TryAgain.setText("Try Again");
        TryAgain.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC, 35));
        grid1.add(TryAgain, 5, 1);
        TryAgain.setVisible(false);
        
        HINTS.setText("HINTS");
        HINTS.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC, 50)); 
        HINTS.setUnderline(true);
        
        DescriptionDown.setText("Down");
        DescriptionDown.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 25));
        DescriptionDown.setUnderline(true);
        
        One.setText("1. Opposite of when you pass a test");
        One.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 18));
        
        Two.setText("2. 'My ______ consists of my mom, dad, and sister'");
        Two.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 18));
        
        Four.setText("4. A wound that does not heal");
        Four.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 18));
        
        Six.setText("6. Another word for 'baby' or 'infant'");
        Six.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 18));
        
        Seven.setText("7. 'My cat likes playing with a ball of ____'");
        Seven.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 18));
        
        ////////////////////////////////////////////////////////////////////////////////
        
        EMPTY.setText("                ");
        EMPTY.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC, 50));
        
        DescriptionAcross.setText("Across");
        DescriptionAcross.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 25));
        DescriptionAcross.setUnderline(true);
        
        Three.setText("3. Used in most sports");
        Three.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 18));
        
        Five.setText("5. What a King wears");
        Five.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 18));
        
        Eight.setText("8. She loved ______ that book.");
        Eight.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 18));
        
        ///////////////////////////////////////////////////////////////////////////////
        ////////////Printing the Words in the boxes////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////
        
        HBox test = new HBox();
        test.getChildren().add(pane1);
        test.setSpacing(30);
        test.setStyle("-fx-background-color: #a5c5d4");
        
        StackPane stack1 = new StackPane();
        stack1.getChildren().add(logoImage);
        for (int i = 0; i < 9; i++) {
            ColumnConstraints column = new ColumnConstraints(58);
            grid1.getColumnConstraints().add(column);
        }
        
        for (int i = 0; i < 14; i++) {
            RowConstraints row = new RowConstraints(53.5);
            grid1.getRowConstraints().add(row);
        }
        
        test.getChildren().add(stack1);
        
        stack1.getChildren().add(grid1);
        
        pane1.setSpacing(30);   
        
        ////////////////////////////////////////////////////////////////////////////////
        
        VBox pane2 = new VBox(test);
        pane2.setAlignment(Pos.CENTER);
        pane2.setSpacing(50);
        
        var scene = new Scene(pane2, 1250, 800);
        
        
        userTextField.setFont(Font.font ("verdana", 24));
        userTextField.setMinSize(150, 45);
        pane1.getChildren().add(userTextField);
        
        ////////////////////////////////////////////////////////////////////////////////
        
        EasyPuzzleStage.setScene(scene);
        EasyPuzzleStage.setMaximized(true);
        EasyPuzzleStage.show();
        
        userTextField.setOnKeyPressed(textEvent ->{
            if(textEvent.getCode() == KeyCode.ENTER) {
                
                String input = userTextField.getText();
                Boolean output = check(input);
                if(output == true) {
                    TryAgain.setVisible(false);
                    printingWord(input, textEvent);
                }
                else {
                    TryAgain.setVisible(true);
                }
                userTextField.setText("");
            }          
        });
        }
    public Boolean check(String s) {
        String sUpper = s.toUpperCase();
        boolean same = true;
        for(int i = 0; i < E.size(); i++) {
            if(E.get(i).equals(sUpper)) {
                E.remove(i);
                if (E.size() == 0) {
                    WellDone.setText("Well done!");
                    WellDone.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC, 35));
                    grid1.add(WellDone, 5, 1);
                }
                return true;
            }
            else {
                same = false;
            }
        }
        return same;
        
    }
    
    public void printingWord(String s, KeyEvent e) {
        String f = s.toUpperCase();
        if(f.equals("BALLS")) {
            Text ballsText = new Text();
            Text ballsText2 = new Text();
            Text ballsText3 = new Text();
            Text ballsText4 = new Text();
            Text ballsText5 = new Text();
            ballsText.setText("   B");
            ballsText2.setText("   A");
            ballsText3.setText("    L");
            ballsText4.setText("    L");
            ballsText5.setText("    S");
            ballsText.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            ballsText2.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            ballsText3.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            ballsText4.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            ballsText5.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            grid1.add(ballsText, 0, 3);
            grid1.add(ballsText2, 1, 3);
            grid1.add(ballsText3, 2, 3);
            grid1.add(ballsText4, 3, 3);
            grid1.add(ballsText5, 4, 3);
            Three.setStrikethrough(true);

            
        }
        else if(f.equals("FAIL")){
            Text failText = new Text();
            Text failText2 = new Text();
            Text failText3 = new Text();
            Text failText4 = new Text();
            failText.setText("    F");
            failText2.setText("    A");
            failText3.setText("    I");
            failText4.setText("    L");
            failText.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            failText2.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            failText3.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            failText4.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            grid1.add(failText, 3, 0);
            grid1.add(failText2, 3, 1);
            grid1.add(failText3, 3, 2);
            grid1.add(failText4, 3, 3);
            One.setStrikethrough(true);
        }
        else if(f.equals("FAMILY")) {
            Text familyText = new Text();
            Text familyText2 = new Text();
            Text familyText3 = new Text();
            Text familyText4 = new Text();
            Text familyText5 = new Text();
            Text familyText6 = new Text();
            familyText.setText("   F");
            familyText2.setText("   A");
            familyText3.setText("   M");
            familyText4.setText("   I");
            familyText5.setText("   L");
            familyText6.setText("   Y");
            familyText.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            familyText2.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            familyText3.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            familyText4.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            familyText5.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            familyText6.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            grid1.add(familyText, 1, 2);
            grid1.add(familyText2, 1, 3);
            grid1.add(familyText3, 1, 4);
            grid1.add(familyText4, 1, 5);
            grid1.add(familyText5, 1, 6);
            grid1.add(familyText6, 1, 7);
            Two.setStrikethrough(true);
        }
        else if(f.equals("NEWBORN")) {
            Text newbornText = new Text();
            Text newbornText2 = new Text();
            Text newbornText3 = new Text();
            Text newbornText4 = new Text();
            Text newbornText5 = new Text();
            Text newbornText6 = new Text();
            Text newbornText7 = new Text();
            newbornText.setText("     N");
            newbornText2.setText("     E");
            newbornText3.setText("     W");
            newbornText4.setText("     B");
            newbornText5.setText("     O");
            newbornText6.setText("     R");
            newbornText7.setText("     N");
            newbornText.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            newbornText2.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            newbornText3.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            newbornText4.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            newbornText5.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            newbornText6.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            newbornText7.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            grid1.add(newbornText, 7, 6);
            grid1.add(newbornText2, 7, 7);
            grid1.add(newbornText3, 7, 8);
            grid1.add(newbornText4, 7, 9);
            grid1.add(newbornText5, 7, 10);
            grid1.add(newbornText6, 7, 11);
            grid1.add(newbornText7, 7, 12);
            Six.setStrikethrough(true);
        }
        else if(f.equals("CROWN")) {
            Text crownText = new Text();
            Text crownText2 = new Text();
            Text crownText3 = new Text();
            Text crownText4 = new Text();
            Text crownText5 = new Text();
            crownText.setText("    C");
            crownText2.setText("    R");
            crownText3.setText("     O");
            crownText4.setText("     W");
            crownText5.setText("     N");
            crownText.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            crownText2.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            crownText3.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            crownText4.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            crownText5.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            grid1.add(crownText, 3, 6);
            grid1.add(crownText2, 4, 6);
            grid1.add(crownText3, 5, 6);
            grid1.add(crownText4, 6, 6);
            grid1.add(crownText5, 7, 6);
            Five.setStrikethrough(true);
        }
        else if(f.equals("READING")) {
            Text readingText = new Text();
            Text readingText2 = new Text();
            Text readingText3 = new Text();
            Text readingText4 = new Text();
            Text readingText5 = new Text();
            Text readingText6 = new Text();
            Text readingText7 = new Text();
            readingText.setText("    R");
            readingText2.setText("    E");
            readingText3.setText("    A");
            readingText4.setText("    D");
            readingText5.setText("    I");
            readingText6.setText("     N");
            readingText7.setText("     G");
            readingText.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            readingText2.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            readingText3.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            readingText4.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            readingText5.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            readingText6.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            readingText7.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            grid1.add(readingText, 2, 12);
            grid1.add(readingText2, 3, 12);
            grid1.add(readingText3, 4, 12);
            grid1.add(readingText4, 5, 12);
            grid1.add(readingText5, 6, 12);
            grid1.add(readingText6, 7, 12);
            grid1.add(readingText7, 8, 12);
            Eight.setStrikethrough(true);
        }
        else if(f.equals("YARN")) {
            Text yarnText = new Text();
            Text yarnText2 = new Text();
            Text yarnText3 = new Text();
            Text yarnText4 = new Text();
            yarnText.setText("    Y");
            yarnText2.setText("    A");
            yarnText3.setText("    R");
            yarnText4.setText("    N");
            yarnText.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            yarnText2.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            yarnText3.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            yarnText4.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            grid1.add(yarnText, 2, 10);
            grid1.add(yarnText2, 2, 11);
            grid1.add(yarnText3, 2, 12);
            grid1.add(yarnText4, 2, 13);
            Seven.setStrikethrough(true);
        }
        else if(f.equals("SCAR")) {
            Text scarText = new Text();
            Text scarText2 = new Text();
            Text scarText3 = new Text();
            Text scarText4 = new Text();
            scarText.setText("    S");
            scarText2.setText("    C");
            scarText3.setText("    A");
            scarText4.setText("    R");
            scarText.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            scarText2.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            scarText3.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            scarText4.setFont(Font.font("verdana", FontWeight.LIGHT, FontPosture.REGULAR, 24));
            grid1.add(scarText, 4, 3);
            grid1.add(scarText2, 4, 4);
            grid1.add(scarText3, 4, 5);
            grid1.add(scarText4, 4, 6);
            Four.setStrikethrough(true);
        }
    }
    
    }