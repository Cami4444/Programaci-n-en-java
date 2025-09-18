module com.mycompany.proyectoparqueadero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.proyectoparqueadero to javafx.fxml;
    exports com.mycompany.proyectoparqueadero;
}
