/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdditionApp121;

/**
 *
 * @author Wayne
 */


import javafx.scene.control.Label;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AdditionController {

    @FXML
    private TextField firstNumberTextField;

    @FXML
    private TextField secondNumberTextField;

    @FXML
    private TextField totalTextField;

    @FXML
    private Label totalLabel;
    
    @FXML
    private void calculateButtonPressed(ActionEvent event) {
       try {
         double number1 = Integer.parseInt(firstNumberTextField.getText());
         double number2 = Integer.parseInt(secondNumberTextField.getText());
         double sum = number1 + number2;//I know that the exercise said to make the variables of the Int type
                                        //But I just thought that changing it into a double would be fun
        
         totalTextField.setText(Double.toString(sum));
         
      }
      catch (NumberFormatException ex) {
         firstNumberTextField.setText("Enter first amount");
         
         firstNumberTextField.selectAll();
         
         firstNumberTextField.requestFocus();
         secondNumberTextField.setText("Enter first amount");
         secondNumberTextField.selectAll();
         secondNumberTextField.requestFocus();
      }
    }
    

    
}

