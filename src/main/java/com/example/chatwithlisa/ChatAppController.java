package com.example.chatwithlisa;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class ChatAppController implements Initializable {
    @FXML
    private TextField textField;
    @FXML
    private Label chatLabel;
    @FXML
    private Label respondLabel;
    @FXML
    private VBox chatField;

    @FXML
    protected void onSendButtonClick() {
        String sent = textField.getText();
        chatLabel.setText(sent);
        chatLabel.setStyle("-fx-background-color: #d3f3ff; -fx-padding: 8px; -fx-border-radius: 5px; -fx-background-radius: 5px; -fx-max-width: 200px; -fx-wrap-text: true; -fx-margin: 5px;");
        chatLabel.setVisible(true);
        textField.clear();

        PauseTransition pause = new PauseTransition(Duration.seconds(1.5));

        pause.setOnFinished(event -> {
            respondLabel.setStyle("-fx-background-color: #ffffcc; -fx-padding: 8px; -fx-border-radius: 5px; -fx-background-radius: 5px; -fx-max-width: 200px; -fx-wrap-text: true; -fx-margin: 5px;");
            respondLabel.setText("I love you too <3");
            respondLabel.setVisible(true);
        });

        pause.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textField.setStyle("-fx-background-color: #f4f4f4; -fx-padding: 5px; -fx-border-color: #ccc; -fx-border-radius: 5px;");
        textField.setPromptText("Type...");
        chatLabel.setVisible(false);
        respondLabel.setVisible(false);
    }
}