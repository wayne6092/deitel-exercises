/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MilesPerGallonCalculatorApp127;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
/**
 *
 * @author Wayne
 */


public class MPGCalculatorController {

    @FXML
    private TextField gallonsTextField;
    @FXML
    private TextField milesTextField;
    @FXML
    private TextField mpgTextField;

    

    public void calculateButtonPressed(ActionEvent event) {
       try{
         double miles = Integer.parseInt(milesTextField.getText());
         double gallons = Integer.parseInt(gallonsTextField.getText());
         double result = miles / gallons;
         mpgTextField.setText(Double.toString(result));}
       
       catch(NumberFormatException ex){
         gallonsTextField.setText("Enter value");
         gallonsTextField.selectAll();
         gallonsTextField.requestFocus();
         milesTextField.setText("Enter value");
         milesTextField.selectAll();
         milesTextField.requestFocus();
       }
    }

}
