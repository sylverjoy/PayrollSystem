/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 *
 * @author Sylver Yamsi
 */
public class Payrollsystem extends Application {
    
    static Salaried_emp emp ;
    static Based_Salaried emp1 ;
    static Commission_Emp emp2 ;
    static Hourly_Salaried emp3 ;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        emp = new Salaried_emp("","",0);
        emp1 = new Based_Salaried("","",0);
        emp2 = new Commission_Emp("","",0);
        emp3 = new Hourly_Salaried("","",0);
        
        Parent root = FXMLLoader.load(getClass().getResource("Main_Page.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show(); 
        
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText("Fill in the following to get the pay of an employee !");
        a.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
