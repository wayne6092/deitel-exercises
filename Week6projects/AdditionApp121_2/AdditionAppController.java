package AdditionApp121_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Wayne
 */

public class AdditionAppController {

	@FXML
	private Label resultLabel;

	@FXML
	private TextField number1TextField;

	@FXML
	private TextField number2TextField;

	@FXML
	void calculateSumButtonPressed(ActionEvent event) {
		int number1 = getNumber(number1TextField);
		int number2 = getNumber(number2TextField);
		int sum = number1 + number2;
		resultLabel.setText(String.valueOf(sum));
	}

	private int getNumber(TextField numberTextField) {
		int number = 0;

		try {
			number = Integer.parseInt(numberTextField.getText().trim());
		} catch (NumberFormatException e) {
			numberTextField.setText("Enter an integer");
			numberTextField.selectAll();
			numberTextField.requestFocus();
		}

		return number;
	}

}
