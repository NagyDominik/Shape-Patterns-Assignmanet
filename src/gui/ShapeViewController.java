/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bll.Drawer;
import bll.Patterns.RandomPattern;
import bll.Shape;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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
    private ListView<Shape> shapeList;
    @FXML
    private TextField sizeField;
    @FXML
    private ChoiceBox<String> selectedShape;
    @FXML
    private ChoiceBox<String> selectedPattern;
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
        drawer = new Drawer();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        selectedShape.getItems().addAll(drawer.getShapes());
        selectedPattern.setValue("Asd");
        selectedPattern.getItems().addAll(drawer.getPatterns());
    }

    @FXML
    private void addShape(ActionEvent event)
    {
    }

    @FXML
    private void drawShapes(ActionEvent event)
    {
    }

    @FXML
    private void clearList(ActionEvent event)
    {
    }

    @FXML
    private void clearCanvas(ActionEvent event)
    {
    }

}
