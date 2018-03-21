package sample;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.* ;

public class Encryptionwin {

    public static void display(String message) {
        Stage window = new Stage();
        Label label1 = new Label("Encryption Type :");
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.setMinWidth(200);
        Label label2 = new Label("key :");
        TextField textField = new TextField ();
        textField.setPromptText("write a key or generate one with button");
        choiceBox.getItems().addAll("Caesar Cipher", "Vigenère Cipher", "Vernam Cipher");
        choiceBox.setValue("Caesar Cipher");

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("encryption");
        window.setMinWidth(400);
        window.setMinHeight(300);
        Button submit = new Button("encrypt");
        submit.setOnAction(e->  {
            if (textField.getLength()<1){
                AlertBox.display(" ALERT !", "Empty key!! , please enter number");
            }
           else if (choiceBox.getValue().equals("Caesar Cipher")){
            CaesarCipher cc = new CaesarCipher() ;
            // need to  convert textfield into int ( used 3 for example )
                try {
                    String a = cc.encrypt(message, Integer.parseInt(textField.getText()));
                    AlertBox.display(" Encrypted msg!", a);}
                catch (Exception exception) {
                    AlertBox.display("ERROR", "Something went wrong try entering another key ");
                }}


            else if (choiceBox.getValue().equals("Vigenère Cipher")){
                System.out.print("vigenere");
            }

            else {
              VernamCipher vc = new VernamCipher();
              String a = vc.encrypt(message , textField.getText()) ;
                AlertBox.display(" Encrypted msg!", a);
            }
        });
        Button closeButton = new Button("cancel");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label1,choiceBox,label2,textField,submit,closeButton);
        layout.setAlignment(Pos.CENTER);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

}