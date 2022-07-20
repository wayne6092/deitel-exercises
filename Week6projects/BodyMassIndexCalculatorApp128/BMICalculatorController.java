/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyMassIndexCalculatorApp128;

/**
 *
 * @author Wayne
 */
import javafx.event.ActionEvent;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class BMICalculatorController {
	private static final NumberFormat percent = 
		      NumberFormat.getPercentInstance();
		   
	private BigDecimal englishConstant = new BigDecimal(703);//Allows for correct calculations
                                                         //when using english system of measurement
	
    @FXML
    private RadioButton englishRadio;

    @FXML
    private ToggleGroup measurement;

    @FXML
    private RadioButton metricRadio;

    @FXML
    private TextField heightTextField;

    @FXML
    private TextField weightTextField;

    @FXML
    private TextField bmiTextField;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
      try{ 
    	percent.setMaximumFractionDigits(4);
    	MathContext mc = new MathContext(4, RoundingMode.HALF_UP);
    	BigDecimal percentage = new BigDecimal(100);
    	
    	if(measurement.getSelectedToggle().equals(metricRadio)) {
    		englishConstant = new BigDecimal(1);
    	}
    	
    	BigDecimal weight = new BigDecimal(weightTextField.getText());
		BigDecimal height = new BigDecimal(heightTextField.getText());
		BigDecimal numerator = weight.multiply(englishConstant, mc);
		BigDecimal denominator = height.multiply(height, mc);
		BigDecimal bmi = numerator.divide(denominator, mc).divide(percentage, mc);
		
		bmiTextField.setText(percent.format(bmi));}
      
      catch(NumberFormatException ex){
         weightTextField.setText("Enter NUMBER weight in pounds");
         weightTextField.selectAll();
         weightTextField.requestFocus();
         heightTextField.setText("Enter NUMBER height in inches");
         heightTextField.selectAll();
         heightTextField.requestFocus();
      }
      
      catch(Exception ex){
         weightTextField.setText("Enter NUMBER weight in pounds");
         weightTextField.selectAll();
         weightTextField.requestFocus();
         heightTextField.setText("Enter NUMBER height in inches");
         heightTextField.selectAll();
         heightTextField.requestFocus();
      }
    }

    @FXML
    void englishRadioSelected(ActionEvent event) {
         weightTextField.setText("Enter weight in pounds");
         weightTextField.selectAll();
         weightTextField.requestFocus();
         heightTextField.setText("Enter height in inches");
         heightTextField.selectAll();
         heightTextField.requestFocus();
      
    }

    @FXML
    void metricRadioSelected(ActionEvent event) {
    	weightTextField.setText("Enter weight in kilograms");
		weightTextField.selectAll();
		weightTextField.requestFocus();
		heightTextField.setText("Enter height in meters");
		heightTextField.selectAll();
		heightTextField.requestFocus();
    }

}
