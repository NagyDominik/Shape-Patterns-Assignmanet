/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bll.LogicController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author Dominik
 */
public class ShapeViewController implements Initializable
{

    private Label label;
    @FXML
    private Canvas Canvas;
    @FXML
    private ListView<String> shapeList;
    @FXML
    private TextField sizeField;
    @FXML
    private ComboBox<String> selectedShape;
    @FXML
    private ComboBox<String> selectedPattern;
    @FXML
    private Button addShapebtn;
    @FXML
    private Button Drawbtn;
    @FXML
    private Button clearListbtn;
    @FXML
    private Button clearCanvasbtn;
    @FXML
    private ColorPicker selectedColor;

    private LogicController drawer;
    @FXML
    private CheckBox randColor;

    /**
     * The initialization method of the application. Sets the GraphicsContext
     * for the drawer and fills ComboBoxes on the user interface with the
     * selectable options.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        drawer = new LogicController();
        drawer.setContext(Canvas.getGraphicsContext2D());

        selectedShape.getItems().addAll(drawer.getShapes());
        selectedShape.getSelectionModel().selectFirst();
        selectedPattern.getItems().addAll(drawer.getPatterns());
        selectedPattern.getSelectionModel().selectFirst();
    }

    /**
     * Adds the new shapes to the drawing queue and to the display list of the
     * shapes.
     *
     * @param event
     */
    @FXML
    private void addShape(ActionEvent event)
    {
        if (randColor.isSelected())
        {
            drawer.addShapeToQueue(selectedShape.getValue(), Integer.parseInt(sizeField.getText()), drawer.getRandomColor());
        } else
        {
            drawer.addShapeToQueue(selectedShape.getValue(), Integer.parseInt(sizeField.getText()), selectedColor.getValue());
        }
        shapeList.getItems().clear();
        shapeList.getItems().addAll(drawer.getShapesInQueue());

    }

    @FXML
    private void drawShapes(ActionEvent event)
    {
        drawer.setPattern(selectedPattern.getValue());
        drawer.draw();
    }

    @FXML
    private void clearList(ActionEvent event)
    {

        drawer.clearQueue();
        shapeList.getItems().clear();
    }

    @FXML
    private void clearCanvas(ActionEvent event)
    {
        drawer.clearCanvas();
    }

}
