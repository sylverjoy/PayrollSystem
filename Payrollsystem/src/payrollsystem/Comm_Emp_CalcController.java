/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sylver Yamsi
 */
public class Comm_Emp_CalcController implements Initializable {

    @FXML
    private TextField sales;
    @FXML
    private TextField Pay;
    @FXML
    private Button calcbutton;
    @FXML
    private Button homebutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void calcbuttonaxn(ActionEvent event) {
        Payrollsystem.emp2.setSales(new Integer(sales.getText()));
        Pay.setText(Double.toString(Payrollsystem.emp2.Calc_Sal())+" FCFA");
    }

    @FXML
    private void hommebuttonaxn(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("Main_Page.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }
    public void func(String name,String surname,double secu){
       Payrollsystem.emp2.setName(name);
       Payrollsystem.emp2.setSurname(surname);
       Payrollsystem.emp2.setSecu_num(secu);
        
    }
}
