module com.github.yqy7.iconhelper {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.github.yqy7.iconhelper to javafx.fxml;
    exports com.github.yqy7.iconhelper;
}