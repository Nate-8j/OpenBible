module me.jkn.openbible {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.jkn.openbible to javafx.fxml;
    exports me.jkn.openbible;
}