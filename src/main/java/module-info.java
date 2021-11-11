module dusome {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens dusome.battleship to javafx.fxml;
    exports dusome.battleship;
}