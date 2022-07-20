package ModdedPainter133;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Wayne
 */


public class PainterController {
   //Enum constants for pen sizes
   private enum PenSize {
      SMALL(2), 
      MEDIUM(4), 
      LARGE(6);
      
      private final int radius;
      
      PenSize(int radius) {this.radius = radius;}
      
      public int getRadius() {return radius;}
   };

   //GUI INSTANCE VARIABLES
   @FXML private Slider redSlider;
   
   @FXML private Slider greenSlider;
   
   @FXML private Slider blueSlider;
   
   @FXML private Slider alphaSlider;
   
   @FXML private TextField redTextField;
   
   @FXML private TextField greenTextField;
   
   @FXML private TextField blueTextField;
   
   @FXML private TextField alphaTextField;
   
   @FXML private Rectangle colorRectangle;
   
   @FXML private RadioButton smallRadioButton;
   
   @FXML private RadioButton mediumRadioButton;
   
   @FXML private RadioButton largeRadioButton;
   
   @FXML private Pane drawingAreaPane;
   
   @FXML private ToggleGroup sizeToggleGroup;
   
   
   //RGBA Default color values
   private int red = 0;
   private int green = 0;
   private int blue = 0;
   private double alpha = 1.0;

   //Default Pen size = Medium
   private PenSize radius = PenSize.MEDIUM; // radius of circle
   //Sets up brushColor = Black
   private Paint brushColor = Color.rgb(0, 0, 0, 1.0); // brushColor is set to black
   
   //Binds slider to text boxes
   public void initialize() {
      
      redTextField.textProperty().bind(
              redSlider.valueProperty().asString("%.0f"));
      greenTextField.textProperty().bind(
              greenSlider.valueProperty().asString("%.0f"));
      blueTextField.textProperty().bind(
              blueSlider.valueProperty().asString("%.0f"));
      alphaTextField.textProperty().bind(
              alphaSlider.valueProperty().asString("%.2f"));
      
      //Retrieves user Pen Size selection
      smallRadioButton.setUserData(PenSize.SMALL);
      mediumRadioButton.setUserData(PenSize.MEDIUM);
      largeRadioButton.setUserData(PenSize.LARGE);  

      //Listens for slider changes
      redSlider.valueProperty().addListener(
              new ChangeListener<Number>() {
                 @Override
                 public void changed(ObservableValue<? extends Number> ov,
                                     Number oldValue, Number newValue) {
                    red = newValue.intValue();
                    colorRectangle.setFill(Color.rgb(red, green, blue, alpha));//red value changes
                    
                 }
              }
      );
      greenSlider.valueProperty().addListener(
              new ChangeListener<Number>() {
                 @Override
                 public void changed(ObservableValue<? extends Number> ov,
                                     Number oldValue, Number newValue) {
                    green = newValue.intValue();
                    colorRectangle.setFill(Color.rgb(red, green, blue, alpha));//green value changes
                 }
              }
      );
      blueSlider.valueProperty().addListener(
              new ChangeListener<Number>() {
                 @Override
                 public void changed(ObservableValue<? extends Number> ov,
                                     Number oldValue, Number newValue) {
                    blue = newValue.intValue();
                    colorRectangle.setFill(Color.rgb(red, green, blue, alpha));//blue value changes
                 }
              }
      );
      alphaSlider.valueProperty().addListener(
              new ChangeListener<Number>() {
                 @Override
                 public void changed(ObservableValue<? extends Number> ov,
                                     Number oldValue, Number newValue) {
                    alpha = newValue.doubleValue();
                    colorRectangle.setFill(Color.rgb(red, green, blue, alpha));//alpha changes
                 }
              }
      );

   }
   @FXML
   private void drawingAreaMouseDragged(MouseEvent e) {
      //brushColor= Color.rgb(red, green, blue, alpha);//brushColor receives updated rgba values
      brushColor = (Color) (Color.rgb(red, green, blue, alpha));
      Circle newCircle = new Circle(e.getX(), e.getY(), 
         radius.getRadius(), brushColor);
      drawingAreaPane.getChildren().add(newCircle); //draws new color on area
   }
   
   //Size RadioButton's ActionEvents
   @FXML
   private void sizeRadioButtonSelected(ActionEvent e) {
      //Sets the pen size
      radius =(PenSize) sizeToggleGroup.getSelectedToggle().getUserData();
   } 
      
   //Undo Button's ActionEvents
   @FXML
   private void undoButtonPressed(ActionEvent e) {
      int count = drawingAreaPane.getChildren().size();

      //Remove last shape added
      if (count > 0) {
         drawingAreaPane.getChildren().remove(count - 1);
      }
   }
   
   //Clears the pane
   @FXML
   private void clearButtonPressed(ActionEvent e) {
      drawingAreaPane.getChildren().clear();
   }
}