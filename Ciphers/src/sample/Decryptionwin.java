package sample;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.* ;

public class Decryptionwin {

    public static void display(String message) {
        Stage window = new Stage();
        Label label1 = new Label("Decryption Type :");
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.setMinWidth(200);
        Label label2 = new Label("key :");
        TextField textField = new TextField ();
        choiceBox.getItems().addAll("Caesar Cipher", "Vigenère Cipher", "Vernam Cipher");
        choiceBox.setValue("Caesar Cipher");

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Decryption");
        window.setMinWidth(300);
        window.setMinHeight(250);
        Button decrypt = new Button("Decrypt");
        decrypt.setOnAction( e-> {
            if (textField.getLength()<1){
                AlertBox.display(" ALERT !", "Empty key!! , please enter number");
            }
            else if (choiceBox.getValue().equals("Caesar Cipher")) {
                CaesarCipher cc = new CaesarCipher() ;
                //convert the textarea string to an int
                String a = cc.Decrypt(message,Integer.parseInt(textField.getText())) ;
                AlertBox.display(" Decrypted message !", a);
            }
            else if (choiceBox.getValue().equals("Vigenère Cipher")){
                System.out.print("vigenere");
            }

            else {
                System.out.print("Vernam");
                VernamCipher vc = new VernamCipher();
                try {
                String a = vc.encrypt(message , textField.getText()) ;
                AlertBox.display(" Deccrypted msg!", a);
            }
            catch (Exception exception) {
                AlertBox.display("ERROR", "Something went wrong try entering another key ");
            }
            }

        });
        Button closeButton = new Button("cancel");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label1,choiceBox,label2,textField,decrypt,closeButton);
        layout.setAlignment(Pos.CENTER);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

}
