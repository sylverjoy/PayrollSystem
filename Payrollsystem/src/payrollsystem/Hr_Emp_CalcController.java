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
public class Hr_Emp_CalcController implements Initializable {

    @FXML
    private TextField hour_sal;
    @FXML
    private TextField hours_w;
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
        Payrollsystem.emp3.setHourly_sal(new Double(hour_sal.getText()));
        Payrollsystem.emp3.setHours_w(new Integer(hours_w.getText()));
        Pay.setText(Double.toString(Payrollsystem.emp3.Calc_Sal()));
    }

    @FXML
    private void hommebuttonaxn(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("Main_Page.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }
    public void func(String name,String surname,double secu){
       Payrollsystem.emp3.setName(name);
       Payrollsystem.emp3.setSurname(surname);
       Payrollsystem.emp3.setSecu_num(secu);
    }
}
