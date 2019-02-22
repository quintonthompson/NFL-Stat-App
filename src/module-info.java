module NFL.StatAppUI {
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires java.sql;
    requires org.jsoup;
    requires java.desktop;
    requires com.jfoenix;


    exports nflapp.ui to javafx.graphics;
    opens nflapp.common to javafx.base;
    opens nflapp.ui;
}