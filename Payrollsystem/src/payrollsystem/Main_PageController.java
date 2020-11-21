/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

import java.io.IOException;
import static java.lang.Double.parseDouble;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sylver Yamsi
 */
public class Main_PageController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private TextField secu_name;
    @FXML
    private ComboBox<String> emp_type;
    @FXML
    private Button ok_button;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        emp_type.getItems().removeAll(emp_type.getItems());
        emp_type.getItems().addAll("Salaried","Hourly","Commission","Base-Salaried");
       
    }    

    @FXML
    private void okbuttonaxn(ActionEvent event) throws IOException {
        Parent root = new Parent(){};
        if (name.getText().isEmpty() || surname.getText().isEmpty() || secu_name.getText().isEmpty() || emp_type.getValue().isEmpty()){
             Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText("Fill in all fields Please !");
        a.show();
        root = FXMLLoader.load(getClass().getResource("Main_Page.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        }
        else {
            switch (emp_type.getValue()) {
                case "Salaried":
                    {
                        Sal_Emp_CalcController.func(name.getText(), surname.getText(),parseDouble(secu_name.getText()));
                        root = FXMLLoader.load(getClass().getResource("Sal_Emp_Calc.fxml"));
                        break;
                    }
                case "Hourly":
                    {
                        root = FXMLLoader.load(getClass().getResource("Hr_Emp_Calc.fxml"));
                        Sal_Emp_CalcController.func(name.getText(),surname.getText(),new Double(secu_name.getText()));
                        break;
                    }
                case "Commission":
                    {
                        root = FXMLLoader.load(getClass().getResource("Comm_Emp_Calc.fxml"));
                        Sal_Emp_CalcController.func(name.getText(),surname.getText(),new Double(secu_name.getText()));
                        break;
                    }
                default:
                    {
                        root = FXMLLoader.load(getClass().getResource("Base_Sal_Emp_Calc.fxml"));
                        Sal_Emp_CalcController.func(name.getText(),surname.getText(),new Double(secu_name.getText()));
                        break;
                    }
            }
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene); 
        }
           
    }
    
}
