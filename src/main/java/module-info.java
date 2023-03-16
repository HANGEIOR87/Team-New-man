module com.example.testcodecamp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testcodecamp to javafx.fxml;
    exports com.example.testcodecamp;
}