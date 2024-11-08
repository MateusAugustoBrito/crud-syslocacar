module com.example.crudsyslocacar {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    //requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    //requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.crudsyslocacar to javafx.fxml;
    exports com.example.crudsyslocacar;
    exports com.example.crudsyslocacar.controller;
    opens com.example.crudsyslocacar.controller to javafx.fxml;
}