/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnhancedTipCalculatorApp123;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author Wayne
 */
public class TipCalculator extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TipCalculator.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.setTitle("Modified Tip Calculator");
        stage.show(); 
    }

    public static void main(String[] args) {
        launch(args);
    }

}
