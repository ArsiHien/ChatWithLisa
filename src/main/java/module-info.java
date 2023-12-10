module com.example.chatwithlisa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatwithlisa to javafx.fxml;
    exports com.example.chatwithlisa;
}