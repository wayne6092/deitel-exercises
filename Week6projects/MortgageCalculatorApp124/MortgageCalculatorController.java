/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MortgageCalculatorApp124;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.NumberFormat;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
/**
 *
 * @author Wayne
 */


public class MortgageCalculatorController {
	private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
	private static final NumberFormat percent = NumberFormat.getPercentInstance();

	private BigDecimal monthlyPayment;
	private BigInteger years = new BigInteger("10");
	private BigDecimal rate = new BigDecimal(".01");

	@FXML
	private TextField purchasePriceTextField;

	@FXML
	private TextField downPaymentTextField;

	@FXML
	private TextField monthlyPaymentTextField;

	@FXML
	private Label loanDurationLabel;

	@FXML
	private Slider loanDurationSlider;

	@FXML
	private Label interestRateLabel;

	@FXML
	private Slider interestRateSlider;

	@FXML
	void calculateMortgageButtonPressed(ActionEvent event) {
		try{
      BigDecimal purchasePrice = new BigDecimal(purchasePriceTextField.getText().trim());
		BigDecimal downPayment = new BigDecimal(downPaymentTextField.getText().trim());
		BigDecimal total = purchasePrice.subtract(downPayment);
		BigInteger totalMonthys = years.multiply(new BigInteger("12"));
		monthlyPayment = total.multiply(rate).add(total).divide(new BigDecimal(totalMonthys), RoundingMode.UP);//total * rate + total
		monthlyPaymentTextField.setText(currency.format(monthlyPayment)); }
      //divide by total months, rounded up
      catch(NumberFormatException ex){//Doesn't allow the user to enter an incorrect value
         purchasePriceTextField.setText("Enter value");
         purchasePriceTextField.selectAll();
         purchasePriceTextField.requestFocus();
         downPaymentTextField.setText("Enter value");
         downPaymentTextField.selectAll();
         downPaymentTextField.requestFocus();
         monthlyPaymentTextField.selectAll();
         monthlyPaymentTextField.requestFocus();
      
      }
	}

	public void initialize() {
		interestRateSlider.valueProperty().addListener(new ChangeListener<Number>() {
         //using the regular expression to listen to interestRateSlider
         
         
			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number oldValue, Number newValue) {
            //Sets the new interest rate value in the app
            
				rate = BigDecimal.valueOf(newValue.intValue() / 100.0);
				interestRateLabel.setText(String.format("Interest rate (%s)", percent.format(rate)));
			}
		});

		loanDurationSlider.valueProperty().addListener((ObservableValue<? extends Number> arg0, Number oldValue, Number newValue) -> {
         years = BigInteger.valueOf(newValue.intValue());//lambda expression that listens to the value property of loanDuration for newValue
         loanDurationLabel.setText(String.format("Loan duration (%s %s)", years,//and sets that new value accordingly
                 years.compareTo(BigInteger.ONE) > 0 ? "years" : "year"));
      });

	}
}
