package TipCalcMod136;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class TipCalculatorController { 
   // formatters for currency and percentages
   private static final NumberFormat currency = 
      NumberFormat.getCurrencyInstance();

   //private BigDecimal tipPercentage = new BigDecimal(0.15); // 15% default
   
   // GUI controls defined in FXML and used by the controller's code
   @FXML 
   private TextField amountTextField; 

   @FXML
   private Label tipPercentageLabel; 

   @FXML
   private Slider tipPercentageSlider;

   @FXML
   private TextField tipTextField;

   @FXML
   private TextField totalTextField;

   //Property listeners call method update1() to calculate tip and total
   private void update1() {
    
    try {
        currency.setRoundingMode(RoundingMode.HALF_UP);
        BigDecimal amount = new BigDecimal(amountTextField.getText());
        
        BigDecimal tip = amount.multiply(tipPercentage);
        BigDecimal total = amount.add(tip);
        tipTextField.setText(currency.format(tip));
        totalTextField.setText(currency.format(total));

    } catch (NumberFormatException ex) {
        tipTextField.setText("Enter number");
        totalTextField.setText("Enter value amount");
        amountTextField.selectAll();
        amountTextField.requestFocus();
    } 
}
   
   public void initialize() {
      
      
      
      //Property binding that sets the label of tipPercentage based on slider
      tipPercentageLabel.textProperty().bind(tipPercentageSlider.valueProperty().asString("%.0f%%"));
      
      // listener for changes to tipPercentageSlider's value
      tipPercentageSlider.valueProperty().addListener(new ChangeListener<Number>() {
         @Override
         public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
            BigDecimal tipPercentage = new BigDecimal(0.15);
            tipPercentage =
                    BigDecimal.valueOf(newValue.intValue() / 100.0);//does some math
            
            //update1();//calculates total in method update1
         }
      });
      
      // listener for changes to amountTextField value
      amountTextField.textProperty().addListener(new ChangeListener<String>(){
         @Override
         public void changed(ObservableValue<? extends String> ov, String oldValue, String newValue) {
            //update1();//calculates in method update1
            try {
               
               currency.setRoundingMode(RoundingMode.HALF_UP);
               BigDecimal amount = new BigDecimal(amountTextField.getText());
        
               BigDecimal tip = amount.multiply(tipPercentage);
               BigDecimal total = amount.add(tip);
               tipTextField.setText(currency.format(tip));
               totalTextField.setText(currency.format(total));

    }       catch (NumberFormatException ex) {
               tipTextField.setText("Enter number");
               totalTextField.setText("Enter value amount");
               amountTextField.selectAll();
               amountTextField.requestFocus();
    } 
            
         }
      });
      
      
      
      
   }
}

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
