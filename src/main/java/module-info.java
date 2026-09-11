module com.kando.alakzatokfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.kando.alakzatokfx to javafx.fxml;
    exports com.kando.alakzatokfx;
}