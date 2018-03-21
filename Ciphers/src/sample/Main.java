/* Vigenere / Vernam / Ceasar Ciphers -
    Functions for encrypting and decrypting data messages. Then send them to a friend.
  */

package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Vector;

public class Main extends Application  {
  private  Button buttonenc;
  private  Button buttondec;
  private  Button buttonclr;
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Ciphers");



        VBox centermenu = new VBox();
        Label lab = new Label("Enter text below : ") ;
        centermenu.setPrefWidth(100);
        TextArea textArea = new TextArea();
        textArea.setPrefHeight(350);
        textArea.setPrefWidth(300);
        textArea.setStyle("-fx-font-size: 1.5em;");
        buttonenc = new Button("ENCRYPT") ;
        buttondec = new Button("DECRYPT");
        buttonclr = new Button("CLEAR");
        buttonclr.setMinWidth(100);
        buttondec.setMinWidth(100);
        buttonenc.setMinWidth(100);
        buttonclr.setPadding(new Insets(3));
        buttonenc.setPadding(new Insets(3));
        buttondec.setPadding(new Insets(3));
        buttonclr.setOnAction(e->textArea.clear());
        // check if textarea is not empty
        buttonenc.setOnAction(e->{
            if(textArea.getText().length()<1){
                // alert box here cuz empty text area prompt ( enter some text )
                AlertBox.display(" ALERT !", "Empty textarea !! , please enter some text");
            }
            else {
            Encryptionwin.display(textArea.getText()); }
        });
        // check if textarea is not empty
        buttondec.setOnAction(e->{
            if(textArea.getText().length()<1){
                // alert box here cuz empty text area prompt ( enter some text )
                AlertBox.display(" ALERT !", "Empty textarea !! , please enter some text");
            }
            else {
            Decryptionwin.display(textArea.getText()); }
        });
        centermenu.getChildren().addAll(lab,textArea,buttonenc,buttondec,buttonclr);
        centermenu.setAlignment(Pos.CENTER);
        centermenu.setSpacing(5);

        BorderPane bp = new BorderPane();
        bp.setCenter(centermenu);

        Scene scene = new Scene(bp, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


    }

