/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package benchtest2;

import java.awt.dnd.MouseDragGestureRecognizer;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import sun.security.action.OpenFileInputStreamAction;

/**
 *
 * @author Patrice
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World1!");
    }
    
    @FXML
    private ImageView image;
    
    @FXML
    private void handleImageViewMouseClicked(ActionEvent event) 
    {
        FileChooser f = new FileChooser();
        
        try
        {
            image.setImage(new Image(f.showOpenDialog(null).getPath()));
        }
        catch(Exception e){}     
    }
    
    @FXML
    private Slider slider;
    
    @FXML
    private void handleSliderMouseDragged(ActionEvent event) 
    {
        //(MouseDragGestureRecognizer)(event);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    
    
}
