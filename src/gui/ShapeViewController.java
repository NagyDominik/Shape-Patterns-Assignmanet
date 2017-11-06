/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bll.Drawer;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
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

    private Drawer drawer;

    public ShapeViewController()
    {
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        drawer = new Drawer();
        drawer.setContext(Canvas.getGraphicsContext2D());
        
        selectedShape.getItems().addAll(drawer.getShapes());
        selectedShape.getSelectionModel().selectFirst();
        selectedPattern.getItems().addAll(drawer.getPatterns());

        selectedPattern.getSelectionModel().selectFirst();
    }

    @FXML
    private void addShape(ActionEvent event)
    {
        drawer.addShapeToQueue(selectedShape.getValue(), Integer.parseInt(sizeField.getText()));
        shapeList.getItems().clear();
        shapeList.getItems().addAll(drawer.getShapesInQueue());
    }

    @FXML
    private void drawShapes(ActionEvent event)
    {
        drawer.drawShapes();
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
