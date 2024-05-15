module com.empresa.datastructure_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.datastructure_javafx to javafx.fxml;
    exports com.empresa.datastructure_javafx;
}