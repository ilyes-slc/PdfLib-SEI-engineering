module com.sei.pdflib {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
            requires net.synedra.validatorfx;
                requires org.kordamp.bootstrapfx.core;
            
    opens com.sei.pdflib to javafx.fxml;
    exports com.sei.pdflib;
}